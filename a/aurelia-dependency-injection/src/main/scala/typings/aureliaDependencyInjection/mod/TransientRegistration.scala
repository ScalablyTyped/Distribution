package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "TransientRegistration")
@js.native
class TransientRegistration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] () extends Registration_[TBase, TImpl, TArgs] {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
}

