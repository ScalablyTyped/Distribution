package typings.angularCore.mod

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
  
  inline def apply[T](
    factory: () => T,
    imports: js.Array[InjectorType[js.Any] | InjectorTypeWithProviders[js.Any]],
    providers: js.Array[
      Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
  
  extension [Self <: ɵɵInjectorDef[?], T](x: Self & ɵɵInjectorDef[T]) {
    
    inline def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    inline def setImports(value: js.Array[InjectorType[js.Any] | InjectorTypeWithProviders[js.Any]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: (InjectorType[js.Any] | InjectorTypeWithProviders[js.Any])*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setProviders(
      value: js.Array[
          Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(
      value: (Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
