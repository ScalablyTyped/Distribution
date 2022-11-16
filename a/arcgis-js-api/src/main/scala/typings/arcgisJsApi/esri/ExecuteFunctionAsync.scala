package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ExecuteFunctionAsync = (profileVariableInstances : any, context : arcgis-js-api.__esri.ExecuteContext | undefined): std.Promise<arcgis-js-api.__esri.ResultType>
}}}
to avoid circular code involving: 
- arcgis-js-api.__esri.ExecuteFunctionAsync
- arcgis-js-api.__esri.ResultType
*/
@js.native
trait ExecuteFunctionAsync extends StObject {
  
  def apply(profileVariableInstances: Any): js.Promise[ResultType] = js.native
  def apply(profileVariableInstances: Any, context: ExecuteContext): js.Promise[ResultType] = js.native
}
