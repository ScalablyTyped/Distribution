package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵɵInjectorDef[T] extends StObject {
  
  var imports: js.Array[InjectorType[Any] | InjectorTypeWithProviders[Any]]
  
  var providers: js.Array[
    Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any]
  ]
}
object ɵɵInjectorDef {
  
  inline def apply[T](
    imports: js.Array[InjectorType[Any] | InjectorTypeWithProviders[Any]],
    providers: js.Array[
      Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ɵɵInjectorDef[?], T] (val x: Self & ɵɵInjectorDef[T]) extends AnyVal {
    
    inline def setImports(value: js.Array[InjectorType[Any] | InjectorTypeWithProviders[Any]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: (InjectorType[Any] | InjectorTypeWithProviders[Any])*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setProviders(
      value: js.Array[
          Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(
      value: (Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any])*
    ): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
