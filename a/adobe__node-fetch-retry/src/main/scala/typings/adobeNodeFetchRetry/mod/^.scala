package typings.adobeNodeFetchRetry.mod

import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adobe/node-fetch-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(url: String, options: Options): js.Promise[Response] = js.native
  def apply(url: Request, options: Options): js.Promise[Response] = js.native
}
