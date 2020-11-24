package typings.assemblyscriptLoader.mod

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@assemblyscript/loader", "instantiateStreaming")
@js.native
object instantiateStreaming extends js.Object {
  
  def apply[T /* <: js.Object */](source: js.Thenable[Response]): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: js.Thenable[Response], imports: ImportsObject): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Response): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Response, imports: ImportsObject): js.Promise[ASUtil with T] = js.native
}
