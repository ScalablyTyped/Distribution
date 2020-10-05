package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵɵInjectorDef[T] extends js.Object {
  var imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]] = js.native
  var providers: js.Array[
    Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
  ] = js.native
  def factory(): T = js.native
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
  implicit class ɵɵInjectorDefOps[Self <: ɵɵInjectorDef[_], T] (val x: Self with ɵɵInjectorDef[T]) extends AnyVal {
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
    def setFactory(value: () => T): Self = this.set("factory", js.Any.fromFunction0(value))
    @scala.inline
    def setImportsVarargs(value: (InjectorType[js.Any] | InjectorTypeWithProviders[js.Any])*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]]): Self = this.set("imports", value.asInstanceOf[js.Any])
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
  }
  
}

