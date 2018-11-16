package typings
package atAngularCoreLib.srcDiDefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InjectorTypeWithProviders[T] extends js.Object {
  var ngModule: InjectorType[T]
  var providers: js.UndefOr[
    js.Array[
      atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiProviderMod.ValueProvider | atAngularCoreLib.srcDiProviderMod.ExistingProvider | atAngularCoreLib.srcDiProviderMod.FactoryProvider | atAngularCoreLib.srcDiProviderMod.ConstructorProvider | atAngularCoreLib.srcDiProviderMod.StaticClassProvider | atAngularCoreLib.srcDiProviderMod.ClassProvider | js.Array[_]
    ]
  ] = js.undefined
}

