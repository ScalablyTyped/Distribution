package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.AnonInject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "getDecoratorDependencies")
@js.native
object getDecoratorDependencies extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](target: (DependencyCtor[TBase, TImpl, TArgs]) with (AnonInject[TArgs, TBase])): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
  ] = js.native
}

