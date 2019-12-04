package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the `InjectorDef` equivalent of a `ModuleWithProviders`, an `InjectorDefType` with an
  * associated array of providers.
  *
  * Objects of this type can be listed in the imports section of an `InjectorDef`.
  *
  * NOTE: This is a private type and should not be exported
  */
trait InjectorTypeWithProviders[T] extends js.Object {
  var ngModule: InjectorType[T]
  var providers: js.UndefOr[
    js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ] = js.undefined
}

object InjectorTypeWithProviders {
  @scala.inline
  def apply[T](
    ngModule: InjectorType[T],
    providers: js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ] = null
  ): InjectorTypeWithProviders[T] = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectorTypeWithProviders[T]]
  }
}

