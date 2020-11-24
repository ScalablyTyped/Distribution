package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.anon.Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "parent")
@js.native
object parent extends js.Object {
  
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    target: (DependencyCtor[TBase, TImpl, TArgs]) with (Inject[TArgs, TBase]),
    _key: js.Any,
    index: Double
  ): Unit = js.native
}
