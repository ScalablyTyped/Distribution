package typings.appBuilderLib.yarnMod

import typings.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typings.lazyVal.mod.Lazy
import typings.node.processMod.global.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebuildOptions extends js.Object {
  
  var additionalArgs: js.UndefOr[js.Array[String] | Null] = js.native
  
  var arch: js.UndefOr[String] = js.native
  
  var buildFromSource: js.UndefOr[Boolean] = js.native
  
  var frameworkInfo: DesktopFrameworkInfo = js.native
  
  var platform: js.UndefOr[Platform] = js.native
  
  var productionDeps: js.UndefOr[Lazy[js.Array[NodeModuleDirInfo]]] = js.native
}
object RebuildOptions {
  
  @scala.inline
  def apply(frameworkInfo: DesktopFrameworkInfo): RebuildOptions = {
    val __obj = js.Dynamic.literal(frameworkInfo = frameworkInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildOptions]
  }
  
  @scala.inline
  implicit class RebuildOptionsOps[Self <: RebuildOptions] (val x: Self) extends AnyVal {
    
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
    def setFrameworkInfo(value: DesktopFrameworkInfo): Self = this.set("frameworkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalArgsVarargs(value: String*): Self = this.set("additionalArgs", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalArgs(value: js.Array[String]): Self = this.set("additionalArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalArgs: Self = this.set("additionalArgs", js.undefined)
    
    @scala.inline
    def setAdditionalArgsNull: Self = this.set("additionalArgs", null)
    
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    
    @scala.inline
    def setBuildFromSource(value: Boolean): Self = this.set("buildFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildFromSource: Self = this.set("buildFromSource", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setProductionDeps(value: Lazy[js.Array[NodeModuleDirInfo]]): Self = this.set("productionDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionDeps: Self = this.set("productionDeps", js.undefined)
  }
}
