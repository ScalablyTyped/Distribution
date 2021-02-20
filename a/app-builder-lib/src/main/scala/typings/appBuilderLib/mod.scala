package typings.appBuilderLib

import typings.appBuilderLib.forgeMakerMod.ForgeOptions
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.electronPublish.mod.PublishOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("app-builder-lib", "AppInfo")
  @js.native
  class AppInfo protected ()
    extends typings.appBuilderLib.appInfoMod.AppInfo {
    def this(info: typings.appBuilderLib.packagerMod.Packager) = this()
    def this(info: typings.appBuilderLib.packagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.packagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @JSImport("app-builder-lib", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.archMod.Arch with Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 with Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l with Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 with Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 with Double = js.native
  }
  
  @JSImport("app-builder-lib", "CancellationToken")
  @js.native
  class CancellationToken ()
    extends typings.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("app-builder-lib", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("app-builder-lib", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("app-builder-lib", "Packager")
  @js.native
  class Packager protected ()
    extends typings.appBuilderLib.packagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: typings.builderUtilRuntime.mod.CancellationToken) = this()
  }
  
  @JSImport("app-builder-lib", "Platform")
  @js.native
  class Platform protected ()
    extends typings.appBuilderLib.coreMod.Platform {
    def this(
      name: String,
      buildConfigurationKey: String,
      nodeName: typings.node.processMod.global.NodeJS.Platform
    ) = this()
  }
  /* static members */
  object Platform {
    
    @JSImport("app-builder-lib", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib", "Platform.LINUX")
    @js.native
    def LINUX: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def LINUX_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "Platform.MAC")
    @js.native
    def MAC: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def MAC_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "Platform.WINDOWS")
    @js.native
    def WINDOWS: typings.appBuilderLib.coreMod.Platform = js.native
    @scala.inline
    def WINDOWS_=(x: typings.appBuilderLib.coreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "Platform.current")
    @js.native
    def current(): typings.appBuilderLib.coreMod.Platform = js.native
    
    @JSImport("app-builder-lib", "Platform.fromString")
    @js.native
    def fromString(name: String): typings.appBuilderLib.coreMod.Platform = js.native
  }
  
  @JSImport("app-builder-lib", "PlatformPackager")
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typings.appBuilderLib.platformPackagerMod.PlatformPackager[DC] {
    protected def this(info: Packager, platform: Platform) = this()
  }
  /* static members */
  object PlatformPackager {
    
    @JSImport("app-builder-lib", "PlatformPackager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib", "PlatformPackager.buildAsyncTargets")
    @js.native
    def buildAsyncTargets: js.Any = js.native
    @scala.inline
    def buildAsyncTargets_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildAsyncTargets")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "PlatformPackager.normalizePlatformSpecificBuildOptions")
    @js.native
    def normalizePlatformSpecificBuildOptions: js.Any = js.native
    @scala.inline
    def normalizePlatformSpecificBuildOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePlatformSpecificBuildOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("app-builder-lib", "PublishManager")
  @js.native
  class PublishManager protected ()
    extends typings.appBuilderLib.publishManagerMod.PublishManager {
    def this(packager: typings.appBuilderLib.packagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typings.appBuilderLib.packagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typings.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @JSImport("app-builder-lib", "Target")
  @js.native
  abstract class Target protected ()
    extends typings.appBuilderLib.coreMod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  @JSImport("app-builder-lib", "archFromString")
  @js.native
  def archFromString(name: String): Arch = js.native
  
  @JSImport("app-builder-lib", "build")
  @js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  @JSImport("app-builder-lib", "build")
  @js.native
  def build(options: PackagerOptions with PublishOptions, packager: typings.appBuilderLib.packagerMod.Packager): js.Promise[js.Array[String]] = js.native
  
  @JSImport("app-builder-lib", "buildForge")
  @js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  
  @JSImport("app-builder-lib", "checkBuildRequestOptions")
  @js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  
  @JSImport("app-builder-lib", "getArchSuffix")
  @js.native
  def getArchSuffix(arch: Arch): String = js.native
}
