package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSearchFilter extends StObject {
  
  /**
    * The name of the value that you want to use as a filter, for example "Name": "QUICKSIGHT_USER".
    */
  var Name: js.UndefOr[AnalysisFilterAttribute] = js.undefined
  
  /**
    * The comparison operator that you want to use as a filter, for example "Operator": "StringEquals".
    */
  var Operator: js.UndefOr[FilterOperator] = js.undefined
  
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example "Value". An example is "arn:aws:quicksight:us-east-1:1:user/default/UserName1".
    */
  var Value: js.UndefOr[String] = js.undefined
}
object AnalysisSearchFilter {
  
  inline def apply(): AnalysisSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSearchFilter]
  }
  
  extension [Self <: AnalysisSearchFilter](x: Self) {
    
    inline def setName(value: AnalysisFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
