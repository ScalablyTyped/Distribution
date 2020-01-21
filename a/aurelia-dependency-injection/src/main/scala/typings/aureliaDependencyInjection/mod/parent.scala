package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.AnonInject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "parent")
@js.native
object parent extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) with AnonInject[TArgs], _key: js.Any, index: Double): Unit = js.native
}

