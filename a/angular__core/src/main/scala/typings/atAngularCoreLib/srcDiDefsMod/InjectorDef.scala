package typings
package atAngularCoreLib.srcDiDefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectorDef[T] extends js.Object {
  var imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]]
  var providers: js.Array[
    atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiProviderMod.ValueProvider | atAngularCoreLib.srcDiProviderMod.ExistingProvider | atAngularCoreLib.srcDiProviderMod.FactoryProvider | atAngularCoreLib.srcDiProviderMod.ConstructorProvider | atAngularCoreLib.srcDiProviderMod.StaticClassProvider | atAngularCoreLib.srcDiProviderMod.ClassProvider | js.Array[_]
  ]
  def factory(): T
}

object InjectorDef {
  @scala.inline
  def apply[T](
    factory: () => T,
    imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]],
    providers: js.Array[
      atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiProviderMod.ValueProvider | atAngularCoreLib.srcDiProviderMod.ExistingProvider | atAngularCoreLib.srcDiProviderMod.FactoryProvider | atAngularCoreLib.srcDiProviderMod.ConstructorProvider | atAngularCoreLib.srcDiProviderMod.StaticClassProvider | atAngularCoreLib.srcDiProviderMod.ClassProvider | js.Array[_]
    ]
  ): InjectorDef[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), imports = imports, providers = providers)
  
    __obj.asInstanceOf[InjectorDef[T]]
  }
}

