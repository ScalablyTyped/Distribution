package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "fetch")
@js.native
object fetch extends js.Object {
  
  def apply(): js.Promise[Response] = js.native
  def apply(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[Response] = js.native
  def apply(input: RequestInfo): js.Promise[Response] = js.native
}
