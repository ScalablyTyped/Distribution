package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the `InjectorDef` equivalent of a `ModuleWithProviders`, an `InjectorDefType` with an
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
      Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
    ]
  ] = js.undefined
}
object InjectorTypeWithProviders {
  
  @scala.inline
  def apply[T](ngModule: InjectorType[T]): InjectorTypeWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectorTypeWithProviders[T]]
  }
  
  @scala.inline
  implicit class InjectorTypeWithProvidersMutableBuilder[Self <: InjectorTypeWithProviders[?], T] (val x: Self & InjectorTypeWithProviders[T]) extends AnyVal {
    
    @scala.inline
    def setNgModule(value: InjectorType[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(
      value: js.Array[
          Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(
      value: (Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
