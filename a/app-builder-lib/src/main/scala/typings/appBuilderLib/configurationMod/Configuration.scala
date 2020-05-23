package typings.appBuilderLib.configurationMod

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.BeforeBuildContext
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.electronFrameworkMod.ElectronDownloadOptions
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.linuxOptionsMod.AppImageOptions
import typings.appBuilderLib.linuxOptionsMod.DebOptions
import typings.appBuilderLib.linuxOptionsMod.LinuxConfiguration
import typings.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typings.appBuilderLib.macOptionsMod.DmgOptions
import typings.appBuilderLib.macOptionsMod.MacConfiguration
import typings.appBuilderLib.macOptionsMod.MasConfiguration
import typings.appBuilderLib.msiOptionsMod.MsiOptions
import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisOptionsMod.NsisWebOptions
import typings.appBuilderLib.nsisOptionsMod.PortableOptions
import typings.appBuilderLib.packagerApiMod.ArtifactBuildStarted
import typings.appBuilderLib.packagerApiMod.ArtifactCreated
import typings.appBuilderLib.packagerMod.BuildResult
import typings.appBuilderLib.pkgOptionsMod.PkgOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.AsarOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.FileSet
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.Protocol
import typings.appBuilderLib.platformSpecificBuildOptionsMod.ReleaseInfo
import typings.appBuilderLib.snapOptionsMod.SnapOptions
import typings.appBuilderLib.squirrelWindowsOptionsMod.SquirrelWindowsOptions
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends PlatformSpecificBuildOptions {
  /**
    * The function (or path to file or module id) to be [run after all artifacts are build](#afterAllArtifactBuild).
    */
  val afterAllArtifactBuild: js.UndefOr[
    (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String | Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be [run after pack](#afterpack) (but before pack into distributable format and sign).
    */
  val afterPack: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
    */
  val afterSign: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.undefined
  val apk: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.undefined
  /**
    * AppImage options.
    */
  val appImage: js.UndefOr[AppImageOptions | Null] = js.undefined
  val appx: js.UndefOr[AppXOptions | Null] = js.undefined
  /**
    * Appx manifest created on disk - not packed into .appx package yet.
    */
  val appxManifestCreated: js.UndefOr[(js.Function1[/* path */ String, js.Promise[_] | _]) | String | Null] = js.undefined
  /**
    * The function (or path to file or module id) to be run on artifact build completed.
    */
  val artifactBuildCompleted: js.UndefOr[(js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String | Null] = js.undefined
  /**
    * The function (or path to file or module id) to be run on artifact build start.
    */
  val artifactBuildStarted: js.UndefOr[
    (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String | Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be run before dependencies are installed or rebuilt. Works when `npmRebuild` is set to `true`. Resolving to `false` will skip dependencies install or rebuild.
    *
    * If provided and `node_modules` are missing, it will not invoke production dependencies check.
    */
  val beforeBuild: js.UndefOr[(js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String | Null] = js.undefined
  /**
    * Whether to build the application native dependencies from source.
    * @default false
    */
  var buildDependenciesFromSource: js.UndefOr[Boolean] = js.undefined
  /**
    * The build version. Maps to the `CFBundleVersion` on macOS, and `FileVersion` metadata property on Windows. Defaults to the `version`.
    * If `TRAVIS_BUILD_NUMBER` or `APPVEYOR_BUILD_NUMBER` or `CIRCLE_BUILD_NUM` or `BUILD_NUMBER` or `bamboo.buildNumber` or `CI_PIPELINE_IID` env defined, it will be used as a build version (`version.build_number`).
    */
  val buildVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * The human-readable copyright line for the app.
    * @default Copyright © year ${author}
    */
  val copyright: js.UndefOr[String | Null] = js.undefined
  /**
    * Debian package options.
    */
  val deb: js.UndefOr[DebOptions | Null] = js.undefined
  val directories: js.UndefOr[MetadataDirectories | Null] = js.undefined
  /**
    * macOS DMG options.
    */
  val dmg: js.UndefOr[DmgOptions | Null] = js.undefined
  /**
    * Whether to use [electron-compile](http://github.com/electron/electron-compile) to compile app. Defaults to `true` if `electron-compile` in the dependencies. And `false` if in the `devDependencies` or doesn't specified.
    */
  val electronCompile: js.UndefOr[Boolean] = js.undefined
  /**
    * The path to custom Electron build (e.g. `~/electron/out/R`).
    */
  val electronDist: js.UndefOr[String] = js.undefined
  /**
    * The [electron-download](https://github.com/electron-userland/electron-download#usage) options.
    */
  val electronDownload: js.UndefOr[ElectronDownloadOptions] = js.undefined
  /**
    * The version of electron you are packaging for. Defaults to version of `electron`, `electron-prebuilt` or `electron-prebuilt-compile` dependency.
    */
  var electronVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * The name of a built-in configuration preset or path to config file (relative to project dir). Currently, only `react-cra` is supported.
    *
    * If `react-scripts` in the app dependencies, `react-cra` will be set automatically. Set to `null` to disable automatic detection.
    */
  var `extends`: js.UndefOr[String | Null] = js.undefined
  /**
    * Inject properties to `package.json`.
    */
  val extraMetadata: js.UndefOr[js.Any] = js.undefined
  /**
    * The framework name. One of `electron`, `proton`, `libui`. Defaults to `electron`.
    */
  val framework: js.UndefOr[String | Null] = js.undefined
  val freebsd: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.undefined
  /**
    * Whether to include PDB files.
    * @default false
    */
  val includePdb: js.UndefOr[Boolean] = js.undefined
  /**
    * *libui-based frameworks only* The version of LaunchUI you are packaging for. Applicable for Windows only. Defaults to version suitable for used framework version.
    */
  val launchUiVersion: js.UndefOr[Boolean | String | Null] = js.undefined
  /**
    * Options related to how build Linux targets.
    */
  val linux: js.UndefOr[LinuxConfiguration | Null] = js.undefined
  /**
    * Options related to how build macOS targets.
    */
  val mac: js.UndefOr[MacConfiguration | Null] = js.undefined
  /**
    * MAS (Mac Application Store) options.
    */
  val mas: js.UndefOr[MasConfiguration | Null] = js.undefined
  /**
    * MAS (Mac Application Store) development options (`mas-dev` target).
    */
  val masDev: js.UndefOr[MasConfiguration | Null] = js.undefined
  /** @private */
  val msi: js.UndefOr[MsiOptions | Null] = js.undefined
  /**
    * Whether to execute `node-gyp rebuild` before starting to package the app.
    *
    * Don't [use](https://github.com/electron-userland/electron-builder/issues/683#issuecomment-241214075) [npm](http://electron.atom.io/docs/tutorial/using-native-node-modules/#using-npm) (neither `.npmrc`) for configuring electron headers. Use `electron-builder node-gyp-rebuild` instead.
    * @default false
    */
  val nodeGypRebuild: js.UndefOr[Boolean] = js.undefined
  /**
    * *libui-based frameworks only* The version of NodeJS you are packaging for.
    * You can set it to `current` to set the Node.js version that you use to run.
    */
  val nodeVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * Additional command line arguments to use when installing app native deps.
    */
  val npmArgs: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * Whether to [rebuild](https://docs.npmjs.com/cli/rebuild) native dependencies before starting to package the app.
    * @default true
    */
  val npmRebuild: js.UndefOr[Boolean] = js.undefined
  val nsis: js.UndefOr[NsisOptions | Null] = js.undefined
  val nsisWeb: js.UndefOr[NsisWebOptions | Null] = js.undefined
  /**
    * The function (or path to file or module id) to be [run on each node module](#onnodemodulefile) file.
    */
  val onNodeModuleFile: js.UndefOr[(js.Function1[/* file */ String, Unit]) | String | Null] = js.undefined
  val p5p: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.undefined
  val pacman: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.undefined
  /**
    * macOS PKG options.
    */
  val pkg: js.UndefOr[PkgOptions | Null] = js.undefined
  val portable: js.UndefOr[PortableOptions | Null] = js.undefined
  /**
    * As [name](#Metadata-name), but allows you to specify a product name for your executable which contains spaces and other special characters not allowed in the [name property](https://docs.npmjs.com/files/package.json#name).
    */
  val productName: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to build using Electron Build Service if target not supported on current OS.
    * @default true
    */
  val remoteBuild: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to remove `scripts` field from `package.json` files.
    *
    * @default true
    */
  val removePackageScripts: js.UndefOr[Boolean] = js.undefined
  val rpm: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.undefined
  /**
    * Snap options.
    */
  val snap: js.UndefOr[SnapOptions | Null] = js.undefined
  val squirrelWindows: js.UndefOr[SquirrelWindowsOptions | Null] = js.undefined
  /**
    * Options related to how build Windows targets.
    */
  val win: js.UndefOr[WindowsConfiguration | Null] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    afterAllArtifactBuild: js.UndefOr[
      Null | (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String
    ] = js.undefined,
    afterPack: js.UndefOr[
      Null | (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String
    ] = js.undefined,
    afterSign: js.UndefOr[
      Null | (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String
    ] = js.undefined,
    apk: js.UndefOr[Null | LinuxTargetSpecificOptions] = js.undefined,
    appId: js.UndefOr[Null | String] = js.undefined,
    appImage: js.UndefOr[Null | AppImageOptions] = js.undefined,
    appx: js.UndefOr[Null | AppXOptions] = js.undefined,
    appxManifestCreated: js.UndefOr[Null | (js.Function1[/* path */ String, js.Promise[_] | _]) | String] = js.undefined,
    artifactBuildCompleted: js.UndefOr[Null | (js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String] = js.undefined,
    artifactBuildStarted: js.UndefOr[
      Null | (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String
    ] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    asar: js.UndefOr[Null | AsarOptions | Boolean] = js.undefined,
    asarUnpack: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    beforeBuild: js.UndefOr[Null | (js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String] = js.undefined,
    buildDependenciesFromSource: js.UndefOr[Boolean] = js.undefined,
    buildVersion: js.UndefOr[Null | String] = js.undefined,
    compression: js.UndefOr[Null | CompressionLevel] = js.undefined,
    copyright: js.UndefOr[Null | String] = js.undefined,
    cscKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscLink: js.UndefOr[Null | String] = js.undefined,
    deb: js.UndefOr[Null | DebOptions] = js.undefined,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    directories: js.UndefOr[Null | MetadataDirectories] = js.undefined,
    dmg: js.UndefOr[Null | DmgOptions] = js.undefined,
    electronCompile: js.UndefOr[Boolean] = js.undefined,
    electronDist: String = null,
    electronDownload: ElectronDownloadOptions = null,
    electronUpdaterCompatibility: js.UndefOr[Null | String] = js.undefined,
    electronVersion: js.UndefOr[Null | String] = js.undefined,
    `extends`: js.UndefOr[Null | String] = js.undefined,
    extraFiles: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    extraMetadata: js.Any = null,
    extraResources: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    framework: js.UndefOr[Null | String] = js.undefined,
    freebsd: js.UndefOr[Null | LinuxTargetSpecificOptions] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Null | String] = js.undefined,
    includePdb: js.UndefOr[Boolean] = js.undefined,
    launchUiVersion: js.UndefOr[Null | Boolean | String] = js.undefined,
    linux: js.UndefOr[Null | LinuxConfiguration] = js.undefined,
    mac: js.UndefOr[Null | MacConfiguration] = js.undefined,
    mas: js.UndefOr[Null | MasConfiguration] = js.undefined,
    masDev: js.UndefOr[Null | MasConfiguration] = js.undefined,
    msi: js.UndefOr[Null | MsiOptions] = js.undefined,
    nodeGypRebuild: js.UndefOr[Boolean] = js.undefined,
    nodeVersion: js.UndefOr[Null | String] = js.undefined,
    npmArgs: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    npmRebuild: js.UndefOr[Boolean] = js.undefined,
    nsis: js.UndefOr[Null | NsisOptions] = js.undefined,
    nsisWeb: js.UndefOr[Null | NsisWebOptions] = js.undefined,
    onNodeModuleFile: js.UndefOr[Null | (js.Function1[/* file */ String, Unit]) | String] = js.undefined,
    p5p: js.UndefOr[Null | LinuxTargetSpecificOptions] = js.undefined,
    pacman: js.UndefOr[Null | LinuxTargetSpecificOptions] = js.undefined,
    pkg: js.UndefOr[Null | PkgOptions] = js.undefined,
    portable: js.UndefOr[Null | PortableOptions] = js.undefined,
    productName: js.UndefOr[Null | String] = js.undefined,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    releaseInfo: ReleaseInfo = null,
    remoteBuild: js.UndefOr[Boolean] = js.undefined,
    removePackageScripts: js.UndefOr[Boolean] = js.undefined,
    rpm: js.UndefOr[Null | LinuxTargetSpecificOptions] = js.undefined,
    snap: js.UndefOr[Null | SnapOptions] = js.undefined,
    squirrelWindows: js.UndefOr[Null | SquirrelWindowsOptions] = js.undefined,
    target: js.UndefOr[Null | (js.Array[String | TargetConfiguration]) | String | TargetConfiguration] = js.undefined,
    win: js.UndefOr[Null | WindowsConfiguration] = js.undefined
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterAllArtifactBuild)) __obj.updateDynamic("afterAllArtifactBuild")(afterAllArtifactBuild.asInstanceOf[js.Any])
    if (!js.isUndefined(afterPack)) __obj.updateDynamic("afterPack")(afterPack.asInstanceOf[js.Any])
    if (!js.isUndefined(afterSign)) __obj.updateDynamic("afterSign")(afterSign.asInstanceOf[js.Any])
    if (!js.isUndefined(apk)) __obj.updateDynamic("apk")(apk.asInstanceOf[js.Any])
    if (!js.isUndefined(appId)) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(appImage)) __obj.updateDynamic("appImage")(appImage.asInstanceOf[js.Any])
    if (!js.isUndefined(appx)) __obj.updateDynamic("appx")(appx.asInstanceOf[js.Any])
    if (!js.isUndefined(appxManifestCreated)) __obj.updateDynamic("appxManifestCreated")(appxManifestCreated.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactBuildCompleted)) __obj.updateDynamic("artifactBuildCompleted")(artifactBuildCompleted.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactBuildStarted)) __obj.updateDynamic("artifactBuildStarted")(artifactBuildStarted.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(asar)) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (!js.isUndefined(asarUnpack)) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeBuild)) __obj.updateDynamic("beforeBuild")(beforeBuild.asInstanceOf[js.Any])
    if (!js.isUndefined(buildDependenciesFromSource)) __obj.updateDynamic("buildDependenciesFromSource")(buildDependenciesFromSource.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buildVersion)) __obj.updateDynamic("buildVersion")(buildVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(copyright)) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (!js.isUndefined(cscKeyPassword)) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscLink)) __obj.updateDynamic("cscLink")(cscLink.asInstanceOf[js.Any])
    if (!js.isUndefined(deb)) __obj.updateDynamic("deb")(deb.asInstanceOf[js.Any])
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(directories)) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (!js.isUndefined(dmg)) __obj.updateDynamic("dmg")(dmg.asInstanceOf[js.Any])
    if (!js.isUndefined(electronCompile)) __obj.updateDynamic("electronCompile")(electronCompile.get.asInstanceOf[js.Any])
    if (electronDist != null) __obj.updateDynamic("electronDist")(electronDist.asInstanceOf[js.Any])
    if (electronDownload != null) __obj.updateDynamic("electronDownload")(electronDownload.asInstanceOf[js.Any])
    if (!js.isUndefined(electronUpdaterCompatibility)) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(electronVersion)) __obj.updateDynamic("electronVersion")(electronVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(`extends`)) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (!js.isUndefined(extraFiles)) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraMetadata != null) __obj.updateDynamic("extraMetadata")(extraMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(extraResources)) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framework)) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (!js.isUndefined(freebsd)) __obj.updateDynamic("freebsd")(freebsd.asInstanceOf[js.Any])
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(includePdb)) __obj.updateDynamic("includePdb")(includePdb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(launchUiVersion)) __obj.updateDynamic("launchUiVersion")(launchUiVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(linux)) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (!js.isUndefined(mas)) __obj.updateDynamic("mas")(mas.asInstanceOf[js.Any])
    if (!js.isUndefined(masDev)) __obj.updateDynamic("masDev")(masDev.asInstanceOf[js.Any])
    if (!js.isUndefined(msi)) __obj.updateDynamic("msi")(msi.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeGypRebuild)) __obj.updateDynamic("nodeGypRebuild")(nodeGypRebuild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeVersion)) __obj.updateDynamic("nodeVersion")(nodeVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(npmArgs)) __obj.updateDynamic("npmArgs")(npmArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(npmRebuild)) __obj.updateDynamic("npmRebuild")(npmRebuild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nsis)) __obj.updateDynamic("nsis")(nsis.asInstanceOf[js.Any])
    if (!js.isUndefined(nsisWeb)) __obj.updateDynamic("nsisWeb")(nsisWeb.asInstanceOf[js.Any])
    if (!js.isUndefined(onNodeModuleFile)) __obj.updateDynamic("onNodeModuleFile")(onNodeModuleFile.asInstanceOf[js.Any])
    if (!js.isUndefined(p5p)) __obj.updateDynamic("p5p")(p5p.asInstanceOf[js.Any])
    if (!js.isUndefined(pacman)) __obj.updateDynamic("pacman")(pacman.asInstanceOf[js.Any])
    if (!js.isUndefined(pkg)) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (!js.isUndefined(portable)) __obj.updateDynamic("portable")(portable.asInstanceOf[js.Any])
    if (!js.isUndefined(productName)) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteBuild)) __obj.updateDynamic("remoteBuild")(remoteBuild.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removePackageScripts)) __obj.updateDynamic("removePackageScripts")(removePackageScripts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rpm)) __obj.updateDynamic("rpm")(rpm.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (!js.isUndefined(squirrelWindows)) __obj.updateDynamic("squirrelWindows")(squirrelWindows.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(win)) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

