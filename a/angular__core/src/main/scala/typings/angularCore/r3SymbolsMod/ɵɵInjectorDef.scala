package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵɵInjectorDef[T] extends StObject {
  
  def factory(): T = js.native
  
  var imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]] = js.native
  
  var providers: js.Array[
    Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
  ] = js.native
}
object ɵɵInjectorDef {
  
  @scala.inline
  def apply[T](
    factory: () => T,
    imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]],
    providers: js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
  
  @scala.inline
  implicit class ɵɵInjectorDefMutableBuilder[Self <: ɵɵInjectorDef[_], T] (val x: Self with ɵɵInjectorDef[T]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImports(value: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: (InjectorType[js.Any] | InjectorTypeWithProviders[js.Any])*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setProviders(
      value: js.Array[
          Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(
      value: (Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
