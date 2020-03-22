package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetConfigType
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.platformSpecificBuildOptionsMod.AsarOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.FileSet
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.Protocol
import typings.appBuilderLib.platformSpecificBuildOptionsMod.ReleaseInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxConfiguration
  extends PlatformSpecificBuildOptions
     with CommonLinuxOptions {
  /**
    * The executable name. Defaults to `productName`.
    * Cannot be specified per target, allowed only in the `linux`.
    */
  val executableName: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
    * By default will be generated automatically based on the macOS icns file.
    */
  @JSName("icon")
  val icon_LinuxConfiguration: js.UndefOr[String] = js.undefined
  /**
    * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val maintainer: js.UndefOr[String | Null] = js.undefined
  /**
    * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
    * @private
    */
  val packageCategory: js.UndefOr[String | Null] = js.undefined
  /**
    * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    *
    * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
    *
    * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
    * @default AppImage
    */
  @JSName("target")
  val target_LinuxConfiguration: js.UndefOr[TargetConfigType] = js.undefined
  /**
    * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val vendor: js.UndefOr[String | Null] = js.undefined
}

object LinuxConfiguration {
  @scala.inline
  def apply(
    appId: String = null,
    artifactName: String = null,
    asar: AsarOptions | Boolean = null,
    asarUnpack: js.Array[String] | String = null,
    category: String = null,
    compression: CompressionLevel = null,
    cscKeyPassword: String = null,
    cscLink: String = null,
    description: String = null,
    desktop: js.Any = null,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronUpdaterCompatibility: String = null,
    executableArgs: js.Array[String] = null,
    executableName: String = null,
    extraFiles: (js.Array[FileSet | String]) | FileSet | String = null,
    extraResources: (js.Array[FileSet | String]) | FileSet | String = null,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: (js.Array[FileSet | String]) | FileSet | String = null,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    maintainer: String = null,
    mimeTypes: js.Array[String] = null,
    packageCategory: String = null,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: Publish = null,
    releaseInfo: ReleaseInfo = null,
    synopsis: String = null,
    target: TargetConfigType = null,
    vendor: String = null
  ): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword.asInstanceOf[js.Any])
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel.asInstanceOf[js.Any])
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility.asInstanceOf[js.Any])
    if (executableArgs != null) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (executableName != null) __obj.updateDynamic("executableName")(executableName.asInstanceOf[js.Any])
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning.asInstanceOf[js.Any])
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (packageCategory != null) __obj.updateDynamic("packageCategory")(packageCategory.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxConfiguration]
  }
}

