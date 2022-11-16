package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ExecuteFunction = (profileVariableInstances : any, context : arcgis-js-api.__esri.ExecuteContext | undefined): arcgis-js-api.__esri.ResultType
}}}
to avoid circular code involving: 
- arcgis-js-api.__esri.ExecuteFunction
- arcgis-js-api.__esri.ResultType
*/
@js.native
trait ExecuteFunction extends StObject {
  
  def apply(profileVariableInstances: Any): ResultType = js.native
  def apply(profileVariableInstances: Any, context: ExecuteContext): ResultType = js.native
}
