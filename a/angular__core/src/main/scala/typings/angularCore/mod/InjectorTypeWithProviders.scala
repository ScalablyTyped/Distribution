package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the `InjectorDef` equivalent of a `ModuleWithProviders`, an `InjectorDefType` with an
  * associated array of providers.
  *
  * Objects of this type can be listed in the imports section of an `InjectorDef`.
  *
  * NOTE: This is a private type and should not be exported
  */
@js.native
trait InjectorTypeWithProviders[T] extends StObject {
  
  var ngModule: InjectorType[T] = js.native
  
  var providers: js.UndefOr[
    js.Array[
      typings.angularCore.mod.Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ] = js.native
}
object InjectorTypeWithProviders {
  
  @scala.inline
  def apply[T](ngModule: InjectorType[T]): InjectorTypeWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectorTypeWithProviders[T]]
  }
  
  @scala.inline
  implicit class InjectorTypeWithProvidersMutableBuilder[Self <: InjectorTypeWithProviders[_], T] (val x: Self with InjectorTypeWithProviders[T]) extends AnyVal {
    
    @scala.inline
    def setNgModule(value: InjectorType[T]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(
      value: js.Array[
          typings.angularCore.mod.Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
        ]
    ): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(
      value: (typings.angularCore.mod.Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
