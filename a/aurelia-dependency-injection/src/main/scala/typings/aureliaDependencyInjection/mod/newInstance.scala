package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.anon.Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "newInstance")
@js.native
object newInstance extends js.Object {
  
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    asKeyOrTarget: js.UndefOr[(PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) with (Inject[TArgs, TBase])],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with (Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}
