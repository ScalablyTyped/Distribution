package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
class NewInstance_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(
    key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ) = this()
  
  def as(key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs]): this.type = js.native
  
  def get(container: Container): ImplOrAny[TImpl] = js.native
}
/* static members */
object NewInstance_ {
  
  @JSImport("aurelia-dependency-injection", "NewInstance.of")
  @js.native
  def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    key: PrimitiveOrDependencyCtorOrFunctor[TBase, TImpl, TArgs],
    dynamicDependencies: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
  ): NewInstance_[TBase, TImpl, TArgs] = js.native
}
