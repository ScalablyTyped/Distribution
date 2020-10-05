package typings.angularCore.r3SymbolsMod

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
trait InjectorTypeWithProviders[T] extends js.Object {
  var ngModule: InjectorType[T] = js.native
  var providers: js.UndefOr[
    js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
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
  implicit class InjectorTypeWithProvidersOps[Self <: InjectorTypeWithProviders[_], T] (val x: Self with InjectorTypeWithProviders[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNgModule(value: InjectorType[T]): Self = this.set("ngModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(
      value: (Type[js.Any] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[js.Any])*
    ): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(
      value: js.Array[
          Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
        ]
    ): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
  
}

