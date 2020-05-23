package typings.appBuilderLib

import typings.appBuilderLib.forgeMakerMod.ForgeOptions
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AppInfo protected ()
    extends typings.appBuilderLib.appInfoMod.AppInfo {
    def this(info: typings.appBuilderLib.packagerMod.Packager) = this()
    def this(info: typings.appBuilderLib.packagerMod.Packager, buildVersion: String) = this()
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
  
  @js.native
  class CancellationToken ()
    extends typings.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typings.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class Packager protected ()
    extends typings.appBuilderLib.packagerMod.Packager {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: typings.builderUtilRuntime.mod.CancellationToken) = this()
  }
  
  @js.native
  class Platform protected ()
    extends typings.appBuilderLib.coreMod.Platform {
    def this(name: String, buildConfigurationKey: String, nodeName: typings.node.NodeJS.Platform) = this()
  }
  
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
    extends typings.appBuilderLib.platformPackagerMod.PlatformPackager[DC] {
    protected def this(info: Packager, platform: Platform) = this()
  }
  
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
  
  @js.native
  abstract class Target protected ()
    extends typings.appBuilderLib.coreMod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  val DEFAULT_TARGET: /* "default" */ String = js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  def archFromString(name: String): Arch = js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  def build(options: PackagerOptions with PublishOptions, packager: typings.appBuilderLib.packagerMod.Packager): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.archMod.Arch with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var LINUX: typings.appBuilderLib.coreMod.Platform = js.native
    var MAC: typings.appBuilderLib.coreMod.Platform = js.native
    var WINDOWS: typings.appBuilderLib.coreMod.Platform = js.native
    def current(): typings.appBuilderLib.coreMod.Platform = js.native
    def fromString(name: String): typings.appBuilderLib.coreMod.Platform = js.native
  }
  
  /* static members */
  @js.native
  object PlatformPackager extends js.Object {
    var buildAsyncTargets: js.Any = js.native
    var normalizePlatformSpecificBuildOptions: js.Any = js.native
  }
  
}

