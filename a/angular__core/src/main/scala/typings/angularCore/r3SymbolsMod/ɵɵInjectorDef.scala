package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵɵInjectorDef[T] extends StObject {
  
  def factory(): T
  
  var imports: js.Array[InjectorType[js.Any] | InjectorTypeWithProviders[js.Any]]
  
  var providers: js.Array[
    Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
  ]
}
object ɵɵInjectorDef {
  
  @scala.inline
  def apply[T](
    factory: () => T,
    imports: js.Array[InjectorType[js.Any] | InjectorTypeWithProviders[js.Any]],
    providers: js.Array[
      Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
  
  @scala.inline
  implicit class ɵɵInjectorDefMutableBuilder[Self <: ɵɵInjectorDef[?], T] (val x: Self & ɵɵInjectorDef[T]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImports(value: js.Array[InjectorType[js.Any] | InjectorTypeWithProviders[js.Any]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: (InjectorType[js.Any] | InjectorTypeWithProviders[js.Any])*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setProviders(
      value: js.Array[
          Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(
      value: (Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
