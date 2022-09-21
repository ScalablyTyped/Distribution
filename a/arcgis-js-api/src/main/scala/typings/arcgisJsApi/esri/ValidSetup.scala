package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidSetup
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    issues: js.Array[String],
    propertyIsEnumerable: PropertyKey => Boolean,
    status: Boolean
  ): ValidSetup = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), issues = issues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidSetup]
  }
  
  extension [Self <: ValidSetup](x: Self) {
    
    inline def setIssues(value: js.Array[String]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: String*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
