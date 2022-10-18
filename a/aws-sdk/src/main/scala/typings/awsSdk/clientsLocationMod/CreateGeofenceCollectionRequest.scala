package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGeofenceCollectionRequest extends StObject {
  
  /**
    * A custom name for the geofence collection. Requirements:   Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).    Must be a unique geofence collection name.   No spaces allowed. For example, ExampleGeofenceCollection.  
    */
  var CollectionName: ResourceName
  
  /**
    * An optional description for the geofence collection.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A key identifier for an AWS KMS customer managed key. Enter a key ID, key ARN, alias name, or alias ARN. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsLocationMod.KmsKeyId] = js.undefined
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * This parameter is no longer used.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify, search, and filter your resources by labelling them. Format: "key" : "value"  Restrictions:   Maximum 50 tags per resource   Each resource tag must be unique with a maximum of one value.   Maximum key length: 128 Unicode characters in UTF-8   Maximum value length: 256 Unicode characters in UTF-8   Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.    Cannot use "aws:" as a prefix for a key.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateGeofenceCollectionRequest {
  
  inline def apply(CollectionName: ResourceName): CreateGeofenceCollectionRequest = {
    val __obj = js.Dynamic.literal(CollectionName = CollectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGeofenceCollectionRequest]
  }
  
  extension [Self <: CreateGeofenceCollectionRequest](x: Self) {
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
