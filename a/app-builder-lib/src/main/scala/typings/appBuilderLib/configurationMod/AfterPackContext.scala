package typings.appBuilderLib.configurationMod

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterPackContext extends js.Object {
  val appOutDir: String = js.native
  val arch: Arch = js.native
  val electronPlatformName: String = js.native
  val outDir: String = js.native
  val packager: PlatformPackager[_] = js.native
  val targets: js.Array[Target] = js.native
}

object AfterPackContext {
  @scala.inline
  def apply(
    appOutDir: String,
    arch: Arch,
    electronPlatformName: String,
    outDir: String,
    packager: PlatformPackager[_],
    targets: js.Array[Target]
  ): AfterPackContext = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronPlatformName = electronPlatformName.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterPackContext]
  }
  @scala.inline
  implicit class AfterPackContextOps[Self <: AfterPackContext] (val x: Self) extends AnyVal {
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
    def setAppOutDir(value: String): Self = this.set("appOutDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setArch(value: Arch): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectronPlatformName(value: String): Self = this.set("electronPlatformName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutDir(value: String): Self = this.set("outDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackager(value: PlatformPackager[_]): Self = this.set("packager", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[Target]): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
  
}

