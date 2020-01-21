package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "SingletonRegistration")
@js.native
class SingletonRegistration[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] () extends Registration_[TBase, TImpl, TArgs] {
  def this(keyOrRegisterInChild: Boolean) = this()
  def this(keyOrRegisterInChild: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  def this(keyOrRegisterInChild: Boolean, registerInChild: Boolean) = this()
  def this(keyOrRegisterInChild: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs], registerInChild: Boolean) = this()
  /* CompleteClass */
  override def registerResolver(
    container: Container,
    key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs],
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs]
  ): Resolver_ = js.native
}

