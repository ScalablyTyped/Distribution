package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the `InjectorDef` equivalent of a `ModuleWithProviders`, an `InjectorType` with an
  * associated array of providers.
  *
  * Objects of this type can be listed in the imports section of an `InjectorDef`.
  *
  * NOTE: This is a private type and should not be exported
  */
trait InjectorTypeWithProviders[T] extends StObject {
  
  var ngModule: InjectorType[T]
  
  var providers: js.UndefOr[
    js.Array[
      Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any]
    ]
  ] = js.undefined
}
object InjectorTypeWithProviders {
  
  inline def apply[T](ngModule: InjectorType[T]): InjectorTypeWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectorTypeWithProviders[T]]
  }
  
  extension [Self <: InjectorTypeWithProviders[?], T](x: Self & InjectorTypeWithProviders[T]) {
    
    inline def setNgModule(value: InjectorType[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    inline def setProviders(
      value: js.Array[
          Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(
      value: (Type[Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | EnvironmentProviders | js.Array[Any])*
    ): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
