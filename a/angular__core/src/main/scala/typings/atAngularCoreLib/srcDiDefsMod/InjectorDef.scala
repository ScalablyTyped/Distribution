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

