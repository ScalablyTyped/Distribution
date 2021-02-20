package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invoker_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends StObject {
  
  def invoke(container: Container, fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs], dependencies: TArgs): ImplOrAny[TImpl] = js.native
  
  def invokeWithDynamicDependencies(
    container: Container,
    fn: DependencyCtorOrFunctor[TBase, TImpl, TArgs],
    staticDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ],
    dynamicDependencies: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]
  ): ImplOrAny[TImpl] = js.native
}
object Invoker_ {
  
  @scala.inline
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](
    invoke: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl],
    invokeWithDynamicDependencies: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ], js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
    ]) => ImplOrAny[TImpl]
  ): Invoker_[TBase, TImpl, TArgs] = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction3(invoke), invokeWithDynamicDependencies = js.Any.fromFunction4(invokeWithDynamicDependencies))
    __obj.asInstanceOf[Invoker_[TBase, TImpl, TArgs]]
  }
  
  @scala.inline
  implicit class Invoker_MutableBuilder[Self <: Invoker_[_, _, _], TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] (val x: Self with (Invoker_[TBase, TImpl, TArgs])) extends AnyVal {
    
    @scala.inline
    def setInvoke(value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], TArgs) => ImplOrAny[TImpl]): Self = StObject.set(x, "invoke", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInvokeWithDynamicDependencies(
      value: (Container, DependencyCtorOrFunctor[TBase, TImpl, TArgs], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ], js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]) => ImplOrAny[TImpl]
    ): Self = StObject.set(x, "invokeWithDynamicDependencies", js.Any.fromFunction4(value))
  }
}
