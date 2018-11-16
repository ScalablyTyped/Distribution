package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/ng_module", JSImport.Namespace)
@js.native
object srcViewNgUnderscoreModuleMod extends js.Object {
  def callNgModuleLifecycle(
    ngModule: atAngularCoreLib.srcViewTypesMod.NgModuleData,
    lifecycles: atAngularCoreLib.srcViewTypesMod.NodeFlags
  ): scala.Unit = js.native
  def initNgModule(data: atAngularCoreLib.srcViewTypesMod.NgModuleData): scala.Unit = js.native
  def moduleDef(providers: js.Array[atAngularCoreLib.srcViewTypesMod.NgModuleProviderDef]): atAngularCoreLib.srcViewTypesMod.NgModuleDefinition = js.native
  def moduleProvideDef(
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    token: js.Any,
    value: js.Any,
    deps: js.Array[(js.Tuple2[atAngularCoreLib.srcViewTypesMod.DepFlags, _]) | _]
  ): atAngularCoreLib.srcViewTypesMod.NgModuleProviderDef = js.native
  def resolveNgModuleDep(
    data: atAngularCoreLib.srcViewTypesMod.NgModuleData,
    depDef: atAngularCoreLib.srcViewTypesMod.DepDef
  ): js.Any = js.native
  def resolveNgModuleDep(
    data: atAngularCoreLib.srcViewTypesMod.NgModuleData,
    depDef: atAngularCoreLib.srcViewTypesMod.DepDef,
    notFoundValue: js.Any
  ): js.Any = js.native
}

