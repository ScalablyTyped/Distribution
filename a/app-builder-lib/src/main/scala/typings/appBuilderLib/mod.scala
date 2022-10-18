package typings.appBuilderLib

import typings.appBuilderLib.outForgeMakerMod.ForgeOptions
import typings.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.outPackagerApiMod.PackagerOptions
import typings.builderUtil.outArchMod.Arch
import typings.electronPublish.mod.PublishOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("app-builder-lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib", "AppInfo")
  @js.native
  open class AppInfo protected ()
    extends typings.appBuilderLib.outAppInfoMod.AppInfo {
    def this(info: typings.appBuilderLib.outPackagerMod.Packager) = this()
    def this(info: typings.appBuilderLib.outPackagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appBuilderLib.outPackagerMod.Packager,
      buildVersion: Unit,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @JSImport("app-builder-lib", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.outArchMod.Arch & Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.outArchMod.Arch.arm64 & Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.outArchMod.Arch.armv7l & Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.outArchMod.Arch.ia32 & Double = js.native
    
    /* 4 */ val universal: typings.builderUtil.outArchMod.Arch.universal & Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.outArchMod.Arch.x64 & Double = js.native
  }
  
  @JSImport("app-builder-lib", "CancellationToken")
  @js.native
  open class CancellationToken ()
    extends typings.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @JSImport("app-builder-lib", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("app-builder-lib", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("app-builder-lib", "Packager")
  @js.native
  open class Packager protected ()
    extends typings.appBuilderLib.outPackagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: typings.builderUtilRuntime.mod.CancellationToken) = this()
  }
  
  @JSImport("app-builder-lib", "Platform")
  @js.native
  open class Platform protected ()
    extends typings.appBuilderLib.outCoreMod.Platform {
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
    def LINUX: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def LINUX_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "Platform.MAC")
    @js.native
    def MAC: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def MAC_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "Platform.WINDOWS")
    @js.native
    def WINDOWS: typings.appBuilderLib.outCoreMod.Platform = js.native
    inline def WINDOWS_=(x: typings.appBuilderLib.outCoreMod.Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    inline def current(): typings.appBuilderLib.outCoreMod.Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typings.appBuilderLib.outCoreMod.Platform]
    
    inline def fromString(name: String): typings.appBuilderLib.outCoreMod.Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(name.asInstanceOf[js.Any]).asInstanceOf[typings.appBuilderLib.outCoreMod.Platform]
  }
  
  /* note: abstract class */ @JSImport("app-builder-lib", "PlatformPackager")
  @js.native
  open class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager[DC] {
    /* protected */ def this(info: Packager, platform: Platform) = this()
  }
  /* static members */
  object PlatformPackager {
    
    @JSImport("app-builder-lib", "PlatformPackager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib", "PlatformPackager.buildAsyncTargets")
    @js.native
    def buildAsyncTargets: Any = js.native
    inline def buildAsyncTargets_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildAsyncTargets")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib", "PlatformPackager.normalizePlatformSpecificBuildOptions")
    @js.native
    def normalizePlatformSpecificBuildOptions: Any = js.native
    inline def normalizePlatformSpecificBuildOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePlatformSpecificBuildOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("app-builder-lib", "PublishManager")
  @js.native
  open class PublishManager protected ()
    extends typings.appBuilderLib.outPublishPublishManagerMod.PublishManager {
    def this(packager: typings.appBuilderLib.outPackagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typings.appBuilderLib.outPackagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typings.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("app-builder-lib", "Target")
  @js.native
  open class Target protected ()
    extends typings.appBuilderLib.outCoreMod.Target {
    /* protected */ def this(name: String) = this()
    /* protected */ def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  inline def archFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("archFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def build(options: PackagerOptions & PublishOptions): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def build(options: PackagerOptions & PublishOptions, packager: typings.appBuilderLib.outPackagerMod.Packager): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildForge")(forgeOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def checkBuildRequestOptions(options: PackagerOptions & PublishOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBuildRequestOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getArchSuffix(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getArchSuffix(arch: Arch, defaultArch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any], defaultArch.asInstanceOf[js.Any])).asInstanceOf[String]
}
