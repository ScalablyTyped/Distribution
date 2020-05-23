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
    appId: js.UndefOr[Null | String] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    asar: js.UndefOr[Null | AsarOptions | Boolean] = js.undefined,
    asarUnpack: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    category: js.UndefOr[Null | String] = js.undefined,
    compression: js.UndefOr[Null | CompressionLevel] = js.undefined,
    cscKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscLink: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    desktop: js.UndefOr[Null | js.Any] = js.undefined,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronUpdaterCompatibility: js.UndefOr[Null | String] = js.undefined,
    executableArgs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    executableName: js.UndefOr[Null | String] = js.undefined,
    extraFiles: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    extraResources: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    maintainer: js.UndefOr[Null | String] = js.undefined,
    mimeTypes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    packageCategory: js.UndefOr[Null | String] = js.undefined,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    releaseInfo: ReleaseInfo = null,
    synopsis: js.UndefOr[Null | String] = js.undefined,
    target: js.UndefOr[Null | TargetConfigType] = js.undefined,
    vendor: js.UndefOr[Null | String] = js.undefined
  ): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appId)) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(asar)) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (!js.isUndefined(asarUnpack)) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(cscKeyPassword)) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscLink)) __obj.updateDynamic("cscLink")(cscLink.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(electronUpdaterCompatibility)) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(executableArgs)) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(executableName)) __obj.updateDynamic("executableName")(executableName.asInstanceOf[js.Any])
    if (!js.isUndefined(extraFiles)) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(extraResources)) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainer)) __obj.updateDynamic("maintainer")(maintainer.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(packageCategory)) __obj.updateDynamic("packageCategory")(packageCategory.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(synopsis)) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(vendor)) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxConfiguration]
  }
}

