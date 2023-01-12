package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlaceIndexRequest extends StObject {
  
  /**
    * Specifies the geospatial data provider for the new place index.  This field is case-sensitive. Enter the valid values as shown. For example, entering HERE returns an error.  Valid values include:    Esri – For additional information about Esri's coverage in your region of interest, see Esri details on geocoding coverage.    Here – For additional information about HERE Technologies' coverage in your region of interest, see HERE details on goecoding coverage.  If you specify HERE Technologies (Here) as the data provider, you may not store results for locations in Japan. For more information, see the AWS Service Terms for Amazon Location Service.    For additional information , see Data providers on the Amazon Location Service Developer Guide.
    */
  var DataSource: String
  
  /**
    * Specifies the data storage option requesting Places.
    */
  var DataSourceConfiguration: js.UndefOr[typings.awsSdk.clientsLocationMod.DataSourceConfiguration] = js.undefined
  
  /**
    * The optional description for the place index resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The name of the place index resource.  Requirements:   Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).   Must be a unique place index resource name.   No spaces allowed. For example, ExamplePlaceIndex.  
    */
  var IndexName: ResourceName
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage, identify, search, and filter your resources. Format: "key" : "value"  Restrictions:   Maximum 50 tags per resource.   Each tag key must be unique and must have exactly one associated value.   Maximum key length: 128 Unicode characters in UTF-8.   Maximum value length: 256 Unicode characters in UTF-8.   Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @   Cannot use "aws:" as a prefix for a key.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreatePlaceIndexRequest {
  
  inline def apply(DataSource: String, IndexName: ResourceName): CreatePlaceIndexRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlaceIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePlaceIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "DataSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataSourceConfigurationUndefined: Self = StObject.set(x, "DataSourceConfiguration", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
