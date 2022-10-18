package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMapRequest extends StObject {
  
  /**
    * Specifies the map style selected from an available data provider.
    */
  var Configuration: MapConfiguration
  
  /**
    * An optional description for the map resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The name for the map resource. Requirements:   Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).    Must be a unique map resource name.    No spaces allowed. For example, ExampleMap.  
    */
  var MapName: ResourceName
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * Applies one or more tags to the map resource. A tag is a key-value pair helps manage, identify, search, and filter your resources by labelling them. Format: "key" : "value"  Restrictions:   Maximum 50 tags per resource   Each resource tag must be unique with a maximum of one value.   Maximum key length: 128 Unicode characters in UTF-8   Maximum value length: 256 Unicode characters in UTF-8   Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.    Cannot use "aws:" as a prefix for a key.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateMapRequest {
  
  inline def apply(Configuration: MapConfiguration, MapName: ResourceName): CreateMapRequest = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMapRequest]
  }
  
  extension [Self <: CreateMapRequest](x: Self) {
    
    inline def setConfiguration(value: MapConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
