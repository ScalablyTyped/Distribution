package typings.assemblyscriptLoader.mod

import typings.std.BufferSource
import typings.std.Response
import typings.std.WebAssembly.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@assemblyscript/loader", "instantiate")
@js.native
object instantiate extends js.Object {
  
  def apply[T /* <: js.Object */](source: js.Thenable[Module | BufferSource | Response]): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: js.Thenable[Module | BufferSource | Response], imports: ImportsObject): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: BufferSource): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: BufferSource, imports: ImportsObject): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Response): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Response, imports: ImportsObject): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Module): js.Promise[ASUtil with T] = js.native
  def apply[T /* <: js.Object */](source: Module, imports: ImportsObject): js.Promise[ASUtil with T] = js.native
}
