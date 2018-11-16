package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/entrypoint", JSImport.Namespace)
@js.native
object srcViewEntrypointMod extends js.Object {
  def clearOverrides(): scala.Unit = js.native
  def createNgModuleFactory(
    ngModuleType: atAngularCoreLib.srcTypeMod.Type[_],
    bootstrapComponents: js.Array[atAngularCoreLib.srcTypeMod.Type[_]],
    defFactory: atAngularCoreLib.srcViewTypesMod.NgModuleDefinitionFactory
  ): atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[_] = js.native
  def overrideComponentView(
    comp: atAngularCoreLib.srcTypeMod.Type[_],
    componentFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]
  ): scala.Unit = js.native
  def overrideProvider(`override`: atAngularCoreLib.srcViewTypesMod.ProviderOverride): scala.Unit = js.native
}

