package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outLinuxPackagerMod.LinuxPackager
import typings.appDashBuilderDashLib.outOptionsSnapOptionsMod.SnapOptions
import typings.appDashBuilderDashLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import typings.appDashBuilderDashLib.outTargetsSnapMod.SnapTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/snap", JSImport.Namespace)
@js.native
object outTargetsSnapMod extends js.Object {
  @js.native
  trait SnapTarget extends Target {
    var createDescriptor: js.Any = js.native
    val helper: js.Any = js.native
    var isElectronVersionGreaterOrEqualThen: js.Any = js.native
    var isUseTemplateApp: Boolean = js.native
    @JSName("options")
    val options_SnapTarget: SnapOptions = js.native
    val packager: js.Any = js.native
    var replaceDefault: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SnapTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
}

