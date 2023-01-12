package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteCalculatorRequest extends StObject {
  
  /**
    * The name of the route calculator resource.  Requirements:   Can use alphanumeric characters (A–Z, a–z, 0–9) , hyphens (-), periods (.), and underscores (_).   Must be a unique Route calculator resource name.   No spaces allowed. For example, ExampleRouteCalculator.  
    */
  var CalculatorName: ResourceName
  
  /**
    * Specifies the data provider of traffic and road network data.  This field is case-sensitive. Enter the valid values as shown. For example, entering HERE returns an error. Route calculators that use Esri as a data source only calculate routes that are shorter than 400 km.  Valid values include:    Esri – For additional information about Esri's coverage in your region of interest, see Esri details on street networks and traffic coverage.    Here – For additional information about HERE Technologies' coverage in your region of interest, see HERE car routing coverage and HERE truck routing coverage.   For additional information , see Data providers on the Amazon Location Service Developer Guide.
    */
  var DataSource: String
  
  /**
    * The optional description for the route calculator resource.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * No longer used. If included, the only allowed value is RequestBasedUsage.
    */
  var PricingPlan: js.UndefOr[typings.awsSdk.clientsLocationMod.PricingPlan] = js.undefined
  
  /**
    * Applies one or more tags to the route calculator resource. A tag is a key-value pair helps manage, identify, search, and filter your resources by labelling them.   For example: { "tag1" : "value1", "tag2" : "value2"}   Format: "key" : "value"  Restrictions:   Maximum 50 tags per resource   Each resource tag must be unique with a maximum of one value.   Maximum key length: 128 Unicode characters in UTF-8   Maximum value length: 256 Unicode characters in UTF-8   Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.    Cannot use "aws:" as a prefix for a key.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRouteCalculatorRequest {
  
  inline def apply(CalculatorName: ResourceName, DataSource: String): CreateRouteCalculatorRequest = {
    val __obj = js.Dynamic.literal(CalculatorName = CalculatorName.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteCalculatorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRouteCalculatorRequest] (val x: Self) extends AnyVal {
    
    inline def setCalculatorName(value: ResourceName): Self = StObject.set(x, "CalculatorName", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: String): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPricingPlan(value: PricingPlan): Self = StObject.set(x, "PricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "PricingPlan", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
