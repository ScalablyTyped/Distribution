package typings.appDashBuilderDashLib.outConfigurationMod

import typings.appDashBuilderDashLib.outCoreMod.BeforeBuildContext
import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetConfiguration
import typings.appDashBuilderDashLib.outElectronElectronFrameworkMod.ElectronDownloadOptions
import typings.appDashBuilderDashLib.outOptionsAppXOptionsMod.AppXOptions
import typings.appDashBuilderDashLib.outOptionsFileAssociationMod.FileAssociation
import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.AppImageOptions
import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.DebOptions
import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.LinuxConfiguration
import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions
import typings.appDashBuilderDashLib.outOptionsMacOptionsMod.DmgOptions
import typings.appDashBuilderDashLib.outOptionsMacOptionsMod.MacConfiguration
import typings.appDashBuilderDashLib.outOptionsMacOptionsMod.MasConfiguration
import typings.appDashBuilderDashLib.outOptionsMsiOptionsMod.MsiOptions
import typings.appDashBuilderDashLib.outOptionsPkgOptionsMod.PkgOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo
import typings.appDashBuilderDashLib.outOptionsSnapOptionsMod.SnapOptions
import typings.appDashBuilderDashLib.outOptionsSquirrelWindowsOptionsMod.SquirrelWindowsOptions
import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import typings.appDashBuilderDashLib.outPackagerApiMod.ArtifactBuildStarted
import typings.appDashBuilderDashLib.outPackagerApiMod.ArtifactCreated
import typings.appDashBuilderDashLib.outPackagerMod.BuildResult
import typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.NsisWebOptions
import typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.PortableOptions
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
    * Whether to fail if the application is not signed (to prevent unsigned app if code signing configuration is not correct).
    * @default false
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
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
    afterAllArtifactBuild: (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String = null,
    afterPack: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String = null,
    afterSign: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String = null,
    apk: LinuxTargetSpecificOptions = null,
    appId: String = null,
    appImage: AppImageOptions = null,
    appx: AppXOptions = null,
    artifactBuildCompleted: (js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String = null,
    artifactBuildStarted: (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String = null,
    artifactName: String = null,
    asar: AsarOptions | Boolean = null,
    asarUnpack: js.Array[String] | String = null,
    beforeBuild: (js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String = null,
    buildDependenciesFromSource: js.UndefOr[Boolean] = js.undefined,
    buildVersion: String = null,
    compression: CompressionLevel = null,
    copyright: String = null,
    cscKeyPassword: String = null,
    cscLink: String = null,
    deb: DebOptions = null,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    directories: MetadataDirectories = null,
    dmg: DmgOptions = null,
    electronCompile: js.UndefOr[Boolean] = js.undefined,
    electronDist: String = null,
    electronDownload: ElectronDownloadOptions = null,
    electronUpdaterCompatibility: String = null,
    electronVersion: String = null,
    `extends`: String = null,
    extraFiles: (js.Array[FileSet | String]) | FileSet | String = null,
    extraMetadata: js.Any = null,
    extraResources: (js.Array[FileSet | String]) | FileSet | String = null,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: (js.Array[FileSet | String]) | FileSet | String = null,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    framework: String = null,
    freebsd: LinuxTargetSpecificOptions = null,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    includePdb: js.UndefOr[Boolean] = js.undefined,
    launchUiVersion: Boolean | String = null,
    linux: LinuxConfiguration = null,
    mac: MacConfiguration = null,
    mas: MasConfiguration = null,
    masDev: MasConfiguration = null,
    msi: MsiOptions = null,
    nodeGypRebuild: js.UndefOr[Boolean] = js.undefined,
    nodeVersion: String = null,
    npmArgs: js.Array[String] | String = null,
    npmRebuild: js.UndefOr[Boolean] = js.undefined,
    nsis: NsisOptions = null,
    nsisWeb: NsisWebOptions = null,
    onNodeModuleFile: (js.Function1[/* file */ String, Unit]) | String = null,
    p5p: LinuxTargetSpecificOptions = null,
    pacman: LinuxTargetSpecificOptions = null,
    pkg: PkgOptions = null,
    portable: PortableOptions = null,
    productName: String = null,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: Publish = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    releaseInfo: ReleaseInfo = null,
    remoteBuild: js.UndefOr[Boolean] = js.undefined,
    removePackageScripts: js.UndefOr[Boolean] = js.undefined,
    rpm: LinuxTargetSpecificOptions = null,
    snap: SnapOptions = null,
    squirrelWindows: SquirrelWindowsOptions = null,
    target: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration = null,
    win: WindowsConfiguration = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (afterAllArtifactBuild != null) __obj.updateDynamic("afterAllArtifactBuild")(afterAllArtifactBuild.asInstanceOf[js.Any])
    if (afterPack != null) __obj.updateDynamic("afterPack")(afterPack.asInstanceOf[js.Any])
    if (afterSign != null) __obj.updateDynamic("afterSign")(afterSign.asInstanceOf[js.Any])
    if (apk != null) __obj.updateDynamic("apk")(apk)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (appImage != null) __obj.updateDynamic("appImage")(appImage)
    if (appx != null) __obj.updateDynamic("appx")(appx)
    if (artifactBuildCompleted != null) __obj.updateDynamic("artifactBuildCompleted")(artifactBuildCompleted.asInstanceOf[js.Any])
    if (artifactBuildStarted != null) __obj.updateDynamic("artifactBuildStarted")(artifactBuildStarted.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (beforeBuild != null) __obj.updateDynamic("beforeBuild")(beforeBuild.asInstanceOf[js.Any])
    if (!js.isUndefined(buildDependenciesFromSource)) __obj.updateDynamic("buildDependenciesFromSource")(buildDependenciesFromSource)
    if (buildVersion != null) __obj.updateDynamic("buildVersion")(buildVersion)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword)
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink)
    if (deb != null) __obj.updateDynamic("deb")(deb)
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel)
    if (directories != null) __obj.updateDynamic("directories")(directories)
    if (dmg != null) __obj.updateDynamic("dmg")(dmg)
    if (!js.isUndefined(electronCompile)) __obj.updateDynamic("electronCompile")(electronCompile)
    if (electronDist != null) __obj.updateDynamic("electronDist")(electronDist)
    if (electronDownload != null) __obj.updateDynamic("electronDownload")(electronDownload)
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility)
    if (electronVersion != null) __obj.updateDynamic("electronVersion")(electronVersion)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraMetadata != null) __obj.updateDynamic("extraMetadata")(extraMetadata)
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (freebsd != null) __obj.updateDynamic("freebsd")(freebsd)
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(includePdb)) __obj.updateDynamic("includePdb")(includePdb)
    if (launchUiVersion != null) __obj.updateDynamic("launchUiVersion")(launchUiVersion.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (mas != null) __obj.updateDynamic("mas")(mas)
    if (masDev != null) __obj.updateDynamic("masDev")(masDev)
    if (msi != null) __obj.updateDynamic("msi")(msi)
    if (!js.isUndefined(nodeGypRebuild)) __obj.updateDynamic("nodeGypRebuild")(nodeGypRebuild)
    if (nodeVersion != null) __obj.updateDynamic("nodeVersion")(nodeVersion)
    if (npmArgs != null) __obj.updateDynamic("npmArgs")(npmArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(npmRebuild)) __obj.updateDynamic("npmRebuild")(npmRebuild)
    if (nsis != null) __obj.updateDynamic("nsis")(nsis)
    if (nsisWeb != null) __obj.updateDynamic("nsisWeb")(nsisWeb)
    if (onNodeModuleFile != null) __obj.updateDynamic("onNodeModuleFile")(onNodeModuleFile.asInstanceOf[js.Any])
    if (p5p != null) __obj.updateDynamic("p5p")(p5p)
    if (pacman != null) __obj.updateDynamic("pacman")(pacman)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (portable != null) __obj.updateDynamic("portable")(portable)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo)
    if (!js.isUndefined(remoteBuild)) __obj.updateDynamic("remoteBuild")(remoteBuild)
    if (!js.isUndefined(removePackageScripts)) __obj.updateDynamic("removePackageScripts")(removePackageScripts)
    if (rpm != null) __obj.updateDynamic("rpm")(rpm)
    if (snap != null) __obj.updateDynamic("snap")(snap)
    if (squirrelWindows != null) __obj.updateDynamic("squirrelWindows")(squirrelWindows)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win)
    __obj.asInstanceOf[Configuration]
  }
}

