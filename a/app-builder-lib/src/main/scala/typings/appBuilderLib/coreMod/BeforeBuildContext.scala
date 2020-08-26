package typings.appBuilderLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeBuildContext extends js.Object {
  val appDir: String = js.native
  val arch: String = js.native
  val electronVersion: String = js.native
  val platform: Platform = js.native
}

object BeforeBuildContext {
  @scala.inline
  def apply(appDir: String, arch: String, electronVersion: String, platform: Platform): BeforeBuildContext = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronVersion = electronVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBuildContext]
  }
  @scala.inline
  implicit class BeforeBuildContextOps[Self <: BeforeBuildContext] (val x: Self) extends AnyVal {
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
    def setAppDir(value: String): Self = this.set("appDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectronVersion(value: String): Self = this.set("electronVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

