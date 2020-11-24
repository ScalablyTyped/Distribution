package typings.actionsOnGoogle.expressMod

import typings.actionsOnGoogle.frameworkFrameworkMod.Framework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/framework/express", "Express")
@js.native
class Express_ () extends Framework[ExpressHandler] {
  
  def check(first: js.Object, second: js.Object): Boolean = js.native
  
  def isRequest(first: js.Object): /* is express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query> */ Boolean = js.native
  
  def isResponse(second: js.Object): /* is express.express.Response<any> */ Boolean = js.native
}
