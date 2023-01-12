package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGeofenceCollectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all AWS.    Format example: arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection   
    */
  var CollectionArn: Arn
  
  /**
    * The name of the geofence collection.
    */
  var CollectionName: ResourceName
  
  /**
    * The timestamp for when the geofence resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var CreateTime: js.Date
  
  /**
    * The optional description for the geofence collection.
    */
  var Description: ResourceDescription
  
  /**
    * A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsLocationMod.KmsKeyId] = js.undefined
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * No longer used. Always returns an empty string.
    */
  var PricingPlanDataSource: js.UndefOr[String] = js.undefined
  
  /**
    * Displays the key, value pairs of tags associated with this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The timestamp for when the geofence collection was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var UpdateTime: js.Date
}
object DescribeGeofenceCollectionResponse {
  
  inline def apply(
    CollectionArn: Arn,
    CollectionName: ResourceName,
    CreateTime: js.Date,
    Description: ResourceDescription,
    UpdateTime: js.Date
  ): DescribeGeofenceCollectionResponse = {
    val __obj = js.Dynamic.literal(CollectionArn = CollectionArn.asInstanceOf[js.Any], CollectionName = CollectionName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGeofenceCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGeofenceCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionArn(value: Arn): Self = StObject.set(x, "CollectionArn", value.asInstanceOf[js.Any])
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSource(value: String): Self = StObject.set(x, "PricingPlanDataSource", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanDataSourceUndefined: Self = StObject.set(x, "PricingPlanDataSource", js.undefined)
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
