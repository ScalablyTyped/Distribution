package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typings.lazyVal.mod.Lazy
import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yarnMod {
  
  @JSImport("app-builder-lib/out/util/yarn", "getGypEnv")
  @js.native
  def getGypEnv(frameworkInfo: DesktopFrameworkInfo, platform: Platform, arch: String, buildFromSource: Boolean): js.Any = js.native
  
  @JSImport("app-builder-lib/out/util/yarn", "installOrRebuild")
  @js.native
  def installOrRebuild(config: Configuration, appDir: String, options: RebuildOptions): js.Promise[Unit] = js.native
  @JSImport("app-builder-lib/out/util/yarn", "installOrRebuild")
  @js.native
  def installOrRebuild(config: Configuration, appDir: String, options: RebuildOptions, forceInstall: Boolean): js.Promise[Unit] = js.native
  
  @js.native
  trait DesktopFrameworkInfo extends StObject {
    
    var useCustomDist: Boolean = js.native
    
    var version: String = js.native
  }
  object DesktopFrameworkInfo {
    
    @scala.inline
    def apply(useCustomDist: Boolean, version: String): DesktopFrameworkInfo = {
      val __obj = js.Dynamic.literal(useCustomDist = useCustomDist.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DesktopFrameworkInfo]
    }
    
    @scala.inline
    implicit class DesktopFrameworkInfoMutableBuilder[Self <: DesktopFrameworkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseCustomDist(value: Boolean): Self = StObject.set(x, "useCustomDist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RebuildOptions extends StObject {
    
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
    implicit class RebuildOptionsMutableBuilder[Self <: RebuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalArgs(value: js.Array[String]): Self = StObject.set(x, "additionalArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalArgsNull: Self = StObject.set(x, "additionalArgs", null)
      
      @scala.inline
      def setAdditionalArgsUndefined: Self = StObject.set(x, "additionalArgs", js.undefined)
      
      @scala.inline
      def setAdditionalArgsVarargs(value: String*): Self = StObject.set(x, "additionalArgs", js.Array(value :_*))
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setBuildFromSource(value: Boolean): Self = StObject.set(x, "buildFromSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildFromSourceUndefined: Self = StObject.set(x, "buildFromSource", js.undefined)
      
      @scala.inline
      def setFrameworkInfo(value: DesktopFrameworkInfo): Self = StObject.set(x, "frameworkInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setProductionDeps(value: Lazy[js.Array[NodeModuleDirInfo]]): Self = StObject.set(x, "productionDeps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionDepsUndefined: Self = StObject.set(x, "productionDeps", js.undefined)
    }
  }
}
