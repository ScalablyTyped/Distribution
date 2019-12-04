package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.Packager
import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.Platform
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.default_
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.dir
import typings.appDashBuilderDashLib.outForgeDashMakerMod.ForgeOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import typings.builderDashUtil.outArchMod.Arch
import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", JSImport.Namespace)
@js.native
object appDashBuilderDashLibMod extends js.Object {
  @js.native
  class AppInfo protected ()
    extends typings.appDashBuilderDashLib.outAppInfoMod.AppInfo {
    def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager) = this()
    def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken {
    def this(parent: typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class Packager protected ()
    extends typings.appDashBuilderDashLib.outPackagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(
      options: PackagerOptions,
      cancellationToken: typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
    ) = this()
  }
  
  @js.native
  class Platform protected ()
    extends typings.appDashBuilderDashLib.outCoreMod.Platform {
    def this(name: String, buildConfigurationKey: String, nodeName: typings.node.NodeJS.Platform) = this()
  }
  
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager[DC] {
    protected def this(info: Packager, platform: Platform) = this()
  }
  
  @js.native
  class PublishManager protected ()
    extends typings.appDashBuilderDashLib.outPublishPublishManagerMod.PublishManager {
    def this(packager: typings.appDashBuilderDashLib.outPackagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typings.appDashBuilderDashLib.outPackagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
    ) = this()
  }
  
  @js.native
  abstract class Target protected ()
    extends typings.appDashBuilderDashLib.outCoreMod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  val DEFAULT_TARGET: default_ = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): Arch = js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  def build(
    options: PackagerOptions with PublishOptions,
    packager: typings.appDashBuilderDashLib.outPackagerMod.Packager
  ): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typings.builderDashUtil.outArchMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typings.builderDashUtil.outArchMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typings.builderDashUtil.outArchMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typings.builderDashUtil.outArchMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderDashUtil.outArchMod.Arch with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var LINUX: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
    var MAC: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
    var WINDOWS: typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
    def current(): typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
    def fromString(name: String): typings.appDashBuilderDashLib.outCoreMod.Platform = js.native
  }
  
  /* static members */
  @js.native
  object PlatformPackager extends js.Object {
    var buildAsyncTargets: js.Any = js.native
    var normalizePlatformSpecificBuildOptions: js.Any = js.native
  }
  
}

