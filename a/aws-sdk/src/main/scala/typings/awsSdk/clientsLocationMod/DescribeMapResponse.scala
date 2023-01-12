package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMapResponse extends StObject {
  
  /**
    * Specifies the map tile style selected from a partner data provider.
    */
  var Configuration: MapConfiguration
  
  /**
    * The timestamp for when the map resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var CreateTime: js.Date
  
  /**
    * Specifies the data provider for the associated map tiles.
    */
  var DataSource: String
  
  /**
    * The optional description for the map resource.
    */
  var Description: ResourceDescription
  
  /**
    * The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.   Format example: arn:aws:geo:region:account-id:map/ExampleMap   
    */
  var MapArn: GeoArn
  
  /**
    * The map style selected from an available provider.
    */
  var MapName: ResourceName
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * Tags associated with the map resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The timestamp for when the map resource was last update in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var UpdateTime: js.Date
}
object DescribeMapResponse {
  
  inline def apply(
    Configuration: MapConfiguration,
    CreateTime: js.Date,
    DataSource: String,
    Description: ResourceDescription,
    MapArn: GeoArn,
    MapName: ResourceName,
    UpdateTime: js.Date
  ): DescribeMapResponse = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], MapArn = MapArn.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMapResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMapResponse] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: MapConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setMapArn(value: GeoArn): Self = StObject.set(x, "MapArn", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
