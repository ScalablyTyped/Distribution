package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.electronPublish.mod.UploadTask
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagerApiMod {
  
  @js.native
  trait ArtifactBuildStarted extends StObject {
    
    val arch: Arch | Null = js.native
    
    val file: String = js.native
    
    val targetPresentableName: String = js.native
  }
  object ArtifactBuildStarted {
    
    @scala.inline
    def apply(file: String, targetPresentableName: String): ArtifactBuildStarted = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], targetPresentableName = targetPresentableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactBuildStarted]
    }
    
    @scala.inline
    implicit class ArtifactBuildStartedMutableBuilder[Self <: ArtifactBuildStarted] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchNull: Self = StObject.set(x, "arch", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPresentableName(value: String): Self = StObject.set(x, "targetPresentableName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArtifactCreated extends UploadTask {
    
    val isWriteUpdateInfo: js.UndefOr[Boolean] = js.native
    
    val packager: PlatformPackager[_] = js.native
    
    val publishConfig: js.UndefOr[PublishConfiguration | Null] = js.native
    
    val target: Target | Null = js.native
    
    var updateInfo: js.UndefOr[js.Any] = js.native
  }
  object ArtifactCreated {
    
    @scala.inline
    def apply(file: String, packager: PlatformPackager[_]): ArtifactCreated = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArtifactCreated]
    }
    
    @scala.inline
    implicit class ArtifactCreatedMutableBuilder[Self <: ArtifactCreated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsWriteUpdateInfo(value: Boolean): Self = StObject.set(x, "isWriteUpdateInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWriteUpdateInfoUndefined: Self = StObject.set(x, "isWriteUpdateInfo", js.undefined)
      
      @scala.inline
      def setPackager(value: PlatformPackager[_]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfig(value: PublishConfiguration): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfigNull: Self = StObject.set(x, "publishConfig", null)
      
      @scala.inline
      def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setUpdateInfo(value: js.Any): Self = StObject.set(x, "updateInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
    }
  }
  
  @js.native
  trait PackagerOptions extends StObject {
    
    val config: js.UndefOr[Configuration | String | Null] = js.native
    
    val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ js.Any, js.Promise[Boolean]]] = js.native
    
    var linux: js.UndefOr[js.Array[String]] = js.native
    
    var mac: js.UndefOr[js.Array[String]] = js.native
    
    var platformPackagerFactory: js.UndefOr[
        (js.Function2[/* info */ Packager, /* platform */ Platform, PlatformPackager[_]]) | Null
      ] = js.native
    
    val prepackaged: js.UndefOr[String | Null] = js.native
    
    var projectDir: js.UndefOr[String | Null] = js.native
    
    var targets: js.UndefOr[Map[Platform, Map[Arch, js.Array[String]]]] = js.native
    
    var win: js.UndefOr[js.Array[String]] = js.native
  }
  object PackagerOptions {
    
    @scala.inline
    def apply(): PackagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackagerOptions]
    }
    
    @scala.inline
    implicit class PackagerOptionsMutableBuilder[Self <: PackagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Configuration | String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigNull: Self = StObject.set(x, "config", null)
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setEffectiveOptionComputed(value: /* options */ js.Any => js.Promise[Boolean]): Self = StObject.set(x, "effectiveOptionComputed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEffectiveOptionComputedUndefined: Self = StObject.set(x, "effectiveOptionComputed", js.undefined)
      
      @scala.inline
      def setLinux(value: js.Array[String]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      @scala.inline
      def setLinuxVarargs(value: String*): Self = StObject.set(x, "linux", js.Array(value :_*))
      
      @scala.inline
      def setMac(value: js.Array[String]): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      @scala.inline
      def setMacVarargs(value: String*): Self = StObject.set(x, "mac", js.Array(value :_*))
      
      @scala.inline
      def setPlatformPackagerFactory(value: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[_]): Self = StObject.set(x, "platformPackagerFactory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlatformPackagerFactoryNull: Self = StObject.set(x, "platformPackagerFactory", null)
      
      @scala.inline
      def setPlatformPackagerFactoryUndefined: Self = StObject.set(x, "platformPackagerFactory", js.undefined)
      
      @scala.inline
      def setPrepackaged(value: String): Self = StObject.set(x, "prepackaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepackagedNull: Self = StObject.set(x, "prepackaged", null)
      
      @scala.inline
      def setPrepackagedUndefined: Self = StObject.set(x, "prepackaged", js.undefined)
      
      @scala.inline
      def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectDirNull: Self = StObject.set(x, "projectDir", null)
      
      @scala.inline
      def setProjectDirUndefined: Self = StObject.set(x, "projectDir", js.undefined)
      
      @scala.inline
      def setTargets(value: Map[Platform, Map[Arch, js.Array[String]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setWin(value: js.Array[String]): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
      
      @scala.inline
      def setWinVarargs(value: String*): Self = StObject.set(x, "win", js.Array(value :_*))
    }
  }
}
