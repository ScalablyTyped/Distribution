package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValues extends StObject {
  
  /**
    * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones. Not all dimensions are supported in each API. Refer to the documentation for each specific API to see what is supported.  LINK_ACCOUNT_NAME and SERVICE_CODE can only be used in CostCategoryRule.  ANOMALY_TOTAL_IMPACT_ABSOLUTE and ANOMALY_TOTAL_IMPACT_PERCENTAGE can only be used in AnomalySubscriptions.
    */
  var Key: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The match options that you can use to filter your results.  MatchOptions is only applicable for actions related to Cost Category and Anomaly Subscriptions. Refer to the documentation for each specific API to see what is supported. The default values for MatchOptions are EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MatchOptions] = js.undefined
  
  /**
    * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values.
    */
  var Values: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Values] = js.undefined
}
object DimensionValues {
  
  inline def apply(): DimensionValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionValues] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Dimension): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    inline def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    inline def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value*))
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
