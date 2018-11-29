package typings
package atAngularCoreLib.srcDiR3UnderscoreInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/r3_injector", JSImport.Namespace)
@js.native
object srcDiR3UnderscoreInjectorModMembers extends js.Object {
  def createInjector(defType: js.Any): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(defType: js.Any, parent: atAngularCoreLib.srcDiInjectorMod.Injector): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: atAngularCoreLib.srcDiInjectorMod.Injector,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def isTypeProvider(value: SingleProvider): /* is TypeProvider */scala.Boolean = js.native
  def providerToFactory(provider: SingleProvider): js.Function0[_] = js.native
}

