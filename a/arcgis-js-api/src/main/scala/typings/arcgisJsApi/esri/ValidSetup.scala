package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidSetup extends StObject {
  
  /**
    * An array of error messages for the missing requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ValidSetup)
    */
  var issues: js.Array[String]
  
  /**
    * Is `true` if the requirements are met.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#ValidSetup)
    */
  var status: Boolean
}
object ValidSetup {
  
  inline def apply(issues: js.Array[String], status: Boolean): ValidSetup = {
    val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidSetup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidSetup] (val x: Self) extends AnyVal {
    
    inline def setIssues(value: js.Array[String]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: String*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
