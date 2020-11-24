package typings.appBuilderLib.frameworkMod

import typings.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typings.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrepareApplicationStageDirectoryOptions extends js.Object {
  
  /**
    * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
    */
  val appOutDir: String = js.native
  
  val arch: String = js.native
  
  val packager: PlatformPackager[_] = js.native
  
  val platformName: ElectronPlatformName = js.native
  
  val version: String = js.native
}
object PrepareApplicationStageDirectoryOptions {
  
  @scala.inline
  def apply(
    appOutDir: String,
    arch: String,
    packager: PlatformPackager[_],
    platformName: ElectronPlatformName,
    version: String
  ): PrepareApplicationStageDirectoryOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
  }
  
  @scala.inline
  implicit class PrepareApplicationStageDirectoryOptionsOps[Self <: PrepareApplicationStageDirectoryOptions] (val x: Self) extends AnyVal {
    
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackager(value: PlatformPackager[_]): Self = this.set("packager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformName(value: ElectronPlatformName): Self = this.set("platformName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
