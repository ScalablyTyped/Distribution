package typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod

import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetConfiguration
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import typings.appDashBuilderDashLib.outOptionsFileAssociationMod.FileAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformSpecificBuildOptions extends TargetSpecificOptions {
  /**
    * The application id. Used as [CFBundleIdentifier](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102070) for MacOS and as
    * [Application User Model ID](https://msdn.microsoft.com/en-us/library/windows/desktop/dd378459(v=vs.85).aspx) for Windows (NSIS target only, Squirrel.Windows not supported). It is strongly recommended that an explicit ID is set.
    * @default com.electron.${name}
    */
  val appId: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to package the application's source code into an archive, using [Electron's archive format](http://electron.atom.io/docs/tutorial/application-packaging/).
    *
    * Node modules, that must be unpacked, will be detected automatically, you don't need to explicitly set [asarUnpack](#configuration-asarUnpack) - please file an issue if this doesn't work.
    * @default true
    */
  val asar: js.UndefOr[AsarOptions | Boolean | Null] = js.undefined
  /**
    * A [glob patterns](/file-patterns) relative to the [app directory](#MetadataDirectories-app), which specifies which files to unpack when creating the [asar](http://electron.atom.io/docs/tutorial/application-packaging/) archive.
    */
  val asarUnpack: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * The compression level. If you want to rapidly test build, `store` can reduce build time significantly. `maximum` doesn't lead to noticeable size difference, but increase build time.
    * @default normal
    */
  val compression: js.UndefOr[CompressionLevel | Null] = js.undefined
  /** @private */
  var cscKeyPassword: js.UndefOr[String | Null] = js.undefined
  /** @private */
  var cscLink: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to infer update channel from application version pre-release components. e.g. if version `0.12.1-alpha.1`, channel will be set to `alpha`. Otherwise to `latest`.
    * @default true
    */
  val detectUpdateChannel: js.UndefOr[Boolean] = js.undefined
  /**
    * The [electron-updater compatibility](/auto-update#compatibility) semver range.
    */
  val electronUpdaterCompatibility: js.UndefOr[String | Null] = js.undefined
  var extraFiles: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
  var extraResources: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
  /**
    * The file associations.
    */
  val fileAssociations: js.UndefOr[js.Array[FileAssociation] | FileAssociation] = js.undefined
  var files: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
  /**
    * Whether to fail if app will be not code signed.
    */
  val forceCodeSigning: js.UndefOr[Boolean] = js.undefined
  /**
    * Please see [Building and Releasing using Channels](https://github.com/electron-userland/electron-builder/issues/1182#issuecomment-324947139).
    * @default false
    */
  val generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined
  /** @private */
  val icon: js.UndefOr[String | Null] = js.undefined
  /**
    * The URL protocol schemes.
    */
  val protocols: js.UndefOr[js.Array[Protocol] | Protocol] = js.undefined
  /**
    * The release info. Intended for command line usage:
    *
    * ```
    * -c.releaseInfo.releaseNotes="new features"
    * ```
    */
  val releaseInfo: js.UndefOr[ReleaseInfo] = js.undefined
  val target: js.UndefOr[(js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null] = js.undefined
}

object PlatformSpecificBuildOptions {
  @scala.inline
  def apply(
    appId: String = null,
    artifactName: String = null,
    asar: AsarOptions | Boolean = null,
    asarUnpack: js.Array[String] | String = null,
    compression: CompressionLevel = null,
    cscKeyPassword: String = null,
    cscLink: String = null,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronUpdaterCompatibility: String = null,
    extraFiles: (js.Array[FileSet | String]) | FileSet | String = null,
    extraResources: (js.Array[FileSet | String]) | FileSet | String = null,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: (js.Array[FileSet | String]) | FileSet | String = null,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: Publish = null,
    releaseInfo: ReleaseInfo = null,
    target: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration = null
  ): PlatformSpecificBuildOptions = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword)
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink)
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel)
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility)
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning)
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformSpecificBuildOptions]
  }
}

