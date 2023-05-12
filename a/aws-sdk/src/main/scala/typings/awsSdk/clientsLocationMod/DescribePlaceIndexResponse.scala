package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlaceIndexResponse extends StObject {
  
  /**
    * The timestamp for when the place index resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The data provider of geospatial data. Values can be one of the following:    Esri     Grab     Here    For more information about data providers, see Amazon Location Service data providers.
    */
  var DataSource: String
  
  /**
    * The specified data storage option for requesting Places.
    */
  var DataSourceConfiguration: typings.awsSdk.clientsLocationMod.DataSourceConfiguration
  
  /**
    * The optional description for the place index resource.
    */
  var Description: ResourceDescription
  
  /**
    * The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across Amazon Web Services.    Format example: arn:aws:geo:region:account-id:place-index/ExamplePlaceIndex   
    */
  var IndexArn: Arn
  
  /**
    * The name of the place index resource being described.
    */
  var IndexName: ResourceName
  
  /**
    * No longer used. Always returns RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * Tags associated with place index resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The timestamp for when the place index resource was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object DescribePlaceIndexResponse {
  
  inline def apply(
    CreateTime: js.Date,
    DataSource: String,
    DataSourceConfiguration: DataSourceConfiguration,
    Description: ResourceDescription,
    IndexArn: Arn,
    IndexName: ResourceName,
    UpdateTime: js.Date
  ): DescribePlaceIndexResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any], DataSourceConfiguration = DataSourceConfiguration.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IndexArn = IndexArn.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlaceIndexResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePlaceIndexResponse] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "DataSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIndexArn(value: Arn): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
