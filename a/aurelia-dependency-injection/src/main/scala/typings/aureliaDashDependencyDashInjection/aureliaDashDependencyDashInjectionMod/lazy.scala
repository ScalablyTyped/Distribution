package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.aureliaDashDependencyDashInjection.Anon_Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with Anon_Inject[TArgs], 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

