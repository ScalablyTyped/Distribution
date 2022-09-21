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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagerApiMod {
  
  trait ArtifactBuildStarted extends StObject {
    
    val arch: Arch | Null
    
    val file: String
    
    val targetPresentableName: String
  }
  object ArtifactBuildStarted {
    
    inline def apply(file: String, targetPresentableName: String): ArtifactBuildStarted = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], targetPresentableName = targetPresentableName.asInstanceOf[js.Any], arch = null)
      __obj.asInstanceOf[ArtifactBuildStarted]
    }
    
    extension [Self <: ArtifactBuildStarted](x: Self) {
      
      inline def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchNull: Self = StObject.set(x, "arch", null)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setTargetPresentableName(value: String): Self = StObject.set(x, "targetPresentableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArtifactCreated
    extends StObject
       with UploadTask {
    
    val isWriteUpdateInfo: js.UndefOr[Boolean] = js.undefined
    
    val packager: PlatformPackager[Any]
    
    val publishConfig: js.UndefOr[PublishConfiguration | Null] = js.undefined
    
    val target: Target | Null
    
    var updateInfo: js.UndefOr[Any] = js.undefined
  }
  object ArtifactCreated {
    
    inline def apply(file: String, packager: PlatformPackager[Any]): ArtifactCreated = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], arch = null, target = null)
      __obj.asInstanceOf[ArtifactCreated]
    }
    
    extension [Self <: ArtifactCreated](x: Self) {
      
      inline def setIsWriteUpdateInfo(value: Boolean): Self = StObject.set(x, "isWriteUpdateInfo", value.asInstanceOf[js.Any])
      
      inline def setIsWriteUpdateInfoUndefined: Self = StObject.set(x, "isWriteUpdateInfo", js.undefined)
      
      inline def setPackager(value: PlatformPackager[Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPublishConfig(value: PublishConfiguration): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      inline def setPublishConfigNull: Self = StObject.set(x, "publishConfig", null)
      
      inline def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setUpdateInfo(value: Any): Self = StObject.set(x, "updateInfo", value.asInstanceOf[js.Any])
      
      inline def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
    }
  }
  
  trait PackagerOptions extends StObject {
    
    val config: js.UndefOr[Configuration | String | Null] = js.undefined
    
    val effectiveOptionComputed: js.UndefOr[js.Function1[/* options */ Any, js.Promise[Boolean]]] = js.undefined
    
    var linux: js.UndefOr[js.Array[String]] = js.undefined
    
    var mac: js.UndefOr[js.Array[String]] = js.undefined
    
    var platformPackagerFactory: js.UndefOr[
        (js.Function2[/* info */ Packager, /* platform */ Platform, PlatformPackager[Any]]) | Null
      ] = js.undefined
    
    val prepackaged: js.UndefOr[String | Null] = js.undefined
    
    var projectDir: js.UndefOr[String | Null] = js.undefined
    
    var targets: js.UndefOr[Map[Platform, Map[Arch, js.Array[String]]]] = js.undefined
    
    var win: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PackagerOptions {
    
    inline def apply(): PackagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackagerOptions]
    }
    
    extension [Self <: PackagerOptions](x: Self) {
      
      inline def setConfig(value: Configuration | String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigNull: Self = StObject.set(x, "config", null)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEffectiveOptionComputed(value: /* options */ Any => js.Promise[Boolean]): Self = StObject.set(x, "effectiveOptionComputed", js.Any.fromFunction1(value))
      
      inline def setEffectiveOptionComputedUndefined: Self = StObject.set(x, "effectiveOptionComputed", js.undefined)
      
      inline def setLinux(value: js.Array[String]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      inline def setLinuxVarargs(value: String*): Self = StObject.set(x, "linux", js.Array(value*))
      
      inline def setMac(value: js.Array[String]): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setMacVarargs(value: String*): Self = StObject.set(x, "mac", js.Array(value*))
      
      inline def setPlatformPackagerFactory(value: (/* info */ Packager, /* platform */ Platform) => PlatformPackager[Any]): Self = StObject.set(x, "platformPackagerFactory", js.Any.fromFunction2(value))
      
      inline def setPlatformPackagerFactoryNull: Self = StObject.set(x, "platformPackagerFactory", null)
      
      inline def setPlatformPackagerFactoryUndefined: Self = StObject.set(x, "platformPackagerFactory", js.undefined)
      
      inline def setPrepackaged(value: String): Self = StObject.set(x, "prepackaged", value.asInstanceOf[js.Any])
      
      inline def setPrepackagedNull: Self = StObject.set(x, "prepackaged", null)
      
      inline def setPrepackagedUndefined: Self = StObject.set(x, "prepackaged", js.undefined)
      
      inline def setProjectDir(value: String): Self = StObject.set(x, "projectDir", value.asInstanceOf[js.Any])
      
      inline def setProjectDirNull: Self = StObject.set(x, "projectDir", null)
      
      inline def setProjectDirUndefined: Self = StObject.set(x, "projectDir", js.undefined)
      
      inline def setTargets(value: Map[Platform, Map[Arch, js.Array[String]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setWin(value: js.Array[String]): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      inline def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
      
      inline def setWinVarargs(value: String*): Self = StObject.set(x, "win", js.Array(value*))
    }
  }
}
