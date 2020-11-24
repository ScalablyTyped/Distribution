package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "invokeAsFactory")
@js.native
object invokeAsFactory extends js.Object {
  
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = js.native
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](potentialTarget: DependencyCtor[TBase, TImpl, TArgs]): Unit | (js.Function1[/* target */ DependencyCtor[TBase, TImpl, TArgs], Unit]) = js.native
}
