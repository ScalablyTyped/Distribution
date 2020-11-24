package typings.assemblyscriptLoader.mod

import typings.std.BufferSource
import typings.std.WebAssembly.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@assemblyscript/loader", "instantiateSync")
@js.native
object instantiateSync extends js.Object {
  
  def apply[T /* <: js.Object */](source: BufferSource): ASUtil with T = js.native
  def apply[T /* <: js.Object */](source: BufferSource, imports: ImportsObject): ASUtil with T = js.native
  def apply[T /* <: js.Object */](source: Module): ASUtil with T = js.native
  def apply[T /* <: js.Object */](source: Module, imports: ImportsObject): ASUtil with T = js.native
}
