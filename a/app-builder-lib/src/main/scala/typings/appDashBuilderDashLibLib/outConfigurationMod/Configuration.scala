package typings
package appDashBuilderDashLibLib.outConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration
  extends appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions {
  /**
    * The function (or path to file or module id) to be [run after all artifacts are build](#afterAllArtifactBuild).
    */
  val afterAllArtifactBuild: js.UndefOr[
    (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerMod.BuildResult, 
      js.Promise[js.Array[java.lang.String]] | js.Array[java.lang.String]
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be [run after pack](#afterpack) (but before pack into distributable format and sign).
    */
  val afterPack: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
    */
  val afterSign: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | java.lang.String | scala.Null
  ] = js.undefined
  val apk: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions | scala.Null
  ] = js.undefined
  /**
    * AppImage options.
    */
  val appImage: js.UndefOr[appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.AppImageOptions | scala.Null] = js.undefined
  val appx: js.UndefOr[appDashBuilderDashLibLib.outOptionsAppXOptionsMod.AppXOptions | scala.Null] = js.undefined
  /**
    * The function (or path to file or module id) to be run on artifact build completed.
    */
  val artifactBuildCompleted: js.UndefOr[
    (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactCreated, 
      js.Promise[_] | _
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be run on artifact build start.
    */
  val artifactBuildStarted: js.UndefOr[
    (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactBuildStarted, 
      js.Promise[_] | _
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be run before dependencies are installed or rebuilt. Works when `npmRebuild` is set to `true`. Resolving to `false` will skip dependencies install or rebuild.
    *
    * If provided and `node_modules` are missing, it will not invoke production dependencies check.
    */
  val beforeBuild: js.UndefOr[
    (js.Function1[
      /* context */ appDashBuilderDashLibLib.outCoreMod.BeforeBuildContext, 
      js.Promise[_]
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
    * Whether to build the application native dependencies from source.
    * @default false
    */
  var buildDependenciesFromSource: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The build version. Maps to the `CFBundleVersion` on macOS, and `FileVersion` metadata property on Windows. Defaults to the `version`.
    * If `TRAVIS_BUILD_NUMBER` or `APPVEYOR_BUILD_NUMBER` or `CIRCLE_BUILD_NUM` or `BUILD_NUMBER` or `bamboo.buildNumber` env defined, it will be used as a build version (`version.build_number`).
    */
  val buildVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The human-readable copyright line for the app.
    * @default Copyright © year ${author}
    */
  val copyright: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Debian package options.
    */
  val deb: js.UndefOr[appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.DebOptions | scala.Null] = js.undefined
  val directories: js.UndefOr[MetadataDirectories | scala.Null] = js.undefined
  /**
    * macOS DMG options.
    */
  val dmg: js.UndefOr[appDashBuilderDashLibLib.outOptionsMacOptionsMod.DmgOptions | scala.Null] = js.undefined
  /**
    * Whether to use [electron-compile](http://github.com/electron/electron-compile) to compile app. Defaults to `true` if `electron-compile` in the dependencies. And `false` if in the `devDependencies` or doesn't specified.
    */
  val electronCompile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The path to custom Electron build (e.g. `~/electron/out/R`).
    */
  val electronDist: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The [electron-download](https://github.com/electron-userland/electron-download#usage) options.
    */
  val electronDownload: js.UndefOr[appDashBuilderDashLibLib.outElectronElectronFrameworkMod.ElectronDownloadOptions] = js.undefined
  /**
    * The version of electron you are packaging for. Defaults to version of `electron`, `electron-prebuilt` or `electron-prebuilt-compile` dependency.
    */
  var electronVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The name of a built-in configuration preset or path to config file (relative to project dir). Currently, only `react-cra` is supported.
    *
    * If `react-scripts` in the app dependencies, `react-cra` will be set automatically. Set to `null` to disable automatic detection.
    */
  var `extends`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Inject properties to `package.json`.
    */
  val extraMetadata: js.UndefOr[js.Any] = js.undefined
  /**
    * The framework name. One of `electron`, `proton-native`, `libui`. Defaults to `electron`.
    */
  val framework: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val freebsd: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions | scala.Null
  ] = js.undefined
  /**
    * Whether to include PDB files.
    * @default false
    */
  val includePdb: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * *libui-based frameworks only* The version of LaunchUI you are packaging for. Applicable for Windows only. Defaults to version suitable for used framework version.
    */
  val launchUiVersion: js.UndefOr[scala.Boolean | java.lang.String | scala.Null] = js.undefined
  /**
    * Options related to how build Linux targets.
    */
  val linux: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxConfiguration | scala.Null
  ] = js.undefined
  /**
    * Options related to how build macOS targets.
    */
  val mac: js.UndefOr[appDashBuilderDashLibLib.outOptionsMacOptionsMod.MacConfiguration | scala.Null] = js.undefined
  /**
    * MAS (Mac Application Store) options.
    */
  val mas: js.UndefOr[appDashBuilderDashLibLib.outOptionsMacOptionsMod.MasConfiguration | scala.Null] = js.undefined
  /** @private */
  val msi: js.UndefOr[appDashBuilderDashLibLib.outOptionsMsiOptionsMod.MsiOptions | scala.Null] = js.undefined
  /**
    * The version of muon you are packaging for.
    */
  val muonVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to execute `node-gyp rebuild` before starting to package the app.
    *
    * Don't [use](https://github.com/electron-userland/electron-builder/issues/683#issuecomment-241214075) [npm](http://electron.atom.io/docs/tutorial/using-native-node-modules/#using-npm) (neither `.npmrc`) for configuring electron headers. Use `electron-builder node-gyp-rebuild` instead.
    * @default false
    */
  val nodeGypRebuild: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * *libui-based frameworks only* The version of NodeJS you are packaging for.
    * You can set it to `current` to set the Node.js version that you use to run.
    */
  val nodeVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Additional command line arguments to use when installing app native deps.
    */
  val npmArgs: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to [rebuild](https://docs.npmjs.com/cli/rebuild) native dependencies before starting to package the app.
    * @default true
    */
  val npmRebuild: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated Please use npmBuildFromSource.
    * @private
    */
  val npmSkipBuildFromSource: js.UndefOr[scala.Boolean] = js.undefined
  val nsis: js.UndefOr[appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.NsisOptions | scala.Null] = js.undefined
  val nsisWeb: js.UndefOr[
    appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.NsisWebOptions | scala.Null
  ] = js.undefined
  /**
    * The function (or path to file or module id) to be [run on each node module](#onnodemodulefile) file.
    */
  val onNodeModuleFile: js.UndefOr[
    (js.Function1[/* file */ java.lang.String, scala.Unit]) | java.lang.String | scala.Null
  ] = js.undefined
  val p5p: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions | scala.Null
  ] = js.undefined
  val pacman: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions | scala.Null
  ] = js.undefined
  /**
    * macOS PKG options.
    */
  val pkg: js.UndefOr[appDashBuilderDashLibLib.outOptionsPkgOptionsMod.PkgOptions | scala.Null] = js.undefined
  val portable: js.UndefOr[
    appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.PortableOptions | scala.Null
  ] = js.undefined
  /**
    * As [name](#Metadata-name), but allows you to specify a product name for your executable which contains spaces and other special characters not allowed in the [name property](https://docs.npmjs.com/files/package.json#name).
    */
  val productName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * @private
    * @deprecated Set framework and nodeVersion if need.
    */
  val protonNodeVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Whether to fail if the application is not signed (to prevent unsigned app if code signing configuration is not correct).
    * @default false
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to build using Electron Build Service if target not supported on current OS.
    * @default true
    */
  val remoteBuild: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to remove `scripts` field from `package.json` files.
    *
    * @default true
    */
  val removePackageScripts: js.UndefOr[scala.Boolean] = js.undefined
  val rpm: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions | scala.Null
  ] = js.undefined
  /**
    * Snap options.
    */
  val snap: js.UndefOr[appDashBuilderDashLibLib.outOptionsSnapOptionsMod.SnapOptions | scala.Null] = js.undefined
  val squirrelWindows: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsSquirrelWindowsOptionsMod.SquirrelWindowsOptions | scala.Null
  ] = js.undefined
  /**
    * Options related to how build Windows targets.
    */
  val win: js.UndefOr[
    appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration | scala.Null
  ] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    afterAllArtifactBuild: (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerMod.BuildResult, 
      js.Promise[js.Array[java.lang.String]] | js.Array[java.lang.String]
    ]) | java.lang.String = null,
    afterPack: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | java.lang.String = null,
    afterSign: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | java.lang.String = null,
    apk: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions = null,
    appId: java.lang.String = null,
    appImage: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.AppImageOptions = null,
    appx: appDashBuilderDashLibLib.outOptionsAppXOptionsMod.AppXOptions = null,
    artifactBuildCompleted: (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactCreated, 
      js.Promise[_] | _
    ]) | java.lang.String = null,
    artifactBuildStarted: (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactBuildStarted, 
      js.Promise[_] | _
    ]) | java.lang.String = null,
    artifactName: java.lang.String = null,
    asar: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions | scala.Boolean = null,
    asarUnpack: js.Array[java.lang.String] | java.lang.String = null,
    beforeBuild: (js.Function1[
      /* context */ appDashBuilderDashLibLib.outCoreMod.BeforeBuildContext, 
      js.Promise[_]
    ]) | java.lang.String = null,
    buildDependenciesFromSource: js.UndefOr[scala.Boolean] = js.undefined,
    buildVersion: java.lang.String = null,
    compression: appDashBuilderDashLibLib.outCoreMod.CompressionLevel = null,
    copyright: java.lang.String = null,
    cscKeyPassword: java.lang.String = null,
    cscLink: java.lang.String = null,
    deb: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.DebOptions = null,
    detectUpdateChannel: js.UndefOr[scala.Boolean] = js.undefined,
    directories: MetadataDirectories = null,
    dmg: appDashBuilderDashLibLib.outOptionsMacOptionsMod.DmgOptions = null,
    electronCompile: js.UndefOr[scala.Boolean] = js.undefined,
    electronDist: java.lang.String = null,
    electronDownload: appDashBuilderDashLibLib.outElectronElectronFrameworkMod.ElectronDownloadOptions = null,
    electronUpdaterCompatibility: java.lang.String = null,
    electronVersion: java.lang.String = null,
    `extends`: java.lang.String = null,
    extraFiles: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    extraMetadata: js.Any = null,
    extraResources: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    fileAssociations: js.Array[appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation] | appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation = null,
    files: (js.Array[
      appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String
    ]) | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet | java.lang.String = null,
    forceCodeSigning: js.UndefOr[scala.Boolean] = js.undefined,
    framework: java.lang.String = null,
    freebsd: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions = null,
    generateUpdatesFilesForAllChannels: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    includePdb: js.UndefOr[scala.Boolean] = js.undefined,
    launchUiVersion: scala.Boolean | java.lang.String = null,
    linux: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxConfiguration = null,
    mac: appDashBuilderDashLibLib.outOptionsMacOptionsMod.MacConfiguration = null,
    mas: appDashBuilderDashLibLib.outOptionsMacOptionsMod.MasConfiguration = null,
    msi: appDashBuilderDashLibLib.outOptionsMsiOptionsMod.MsiOptions = null,
    muonVersion: java.lang.String = null,
    nodeGypRebuild: js.UndefOr[scala.Boolean] = js.undefined,
    nodeVersion: java.lang.String = null,
    npmArgs: js.Array[java.lang.String] | java.lang.String = null,
    npmRebuild: js.UndefOr[scala.Boolean] = js.undefined,
    npmSkipBuildFromSource: js.UndefOr[scala.Boolean] = js.undefined,
    nsis: appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.NsisOptions = null,
    nsisWeb: appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.NsisWebOptions = null,
    onNodeModuleFile: (js.Function1[/* file */ java.lang.String, scala.Unit]) | java.lang.String = null,
    p5p: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions = null,
    pacman: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions = null,
    pkg: appDashBuilderDashLibLib.outOptionsPkgOptionsMod.PkgOptions = null,
    portable: appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod.PortableOptions = null,
    productName: java.lang.String = null,
    protocols: js.Array[appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol] | appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol = null,
    protonNodeVersion: java.lang.String = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    releaseInfo: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo = null,
    remoteBuild: js.UndefOr[scala.Boolean] = js.undefined,
    removePackageScripts: js.UndefOr[scala.Boolean] = js.undefined,
    rpm: appDashBuilderDashLibLib.outOptionsLinuxOptionsMod.LinuxTargetSpecificOptions = null,
    snap: appDashBuilderDashLibLib.outOptionsSnapOptionsMod.SnapOptions = null,
    squirrelWindows: appDashBuilderDashLibLib.outOptionsSquirrelWindowsOptionsMod.SquirrelWindowsOptions = null,
    target: (js.Array[java.lang.String | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration]) | java.lang.String | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration = null,
    win: appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration = null
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
    if (msi != null) __obj.updateDynamic("msi")(msi)
    if (muonVersion != null) __obj.updateDynamic("muonVersion")(muonVersion)
    if (!js.isUndefined(nodeGypRebuild)) __obj.updateDynamic("nodeGypRebuild")(nodeGypRebuild)
    if (nodeVersion != null) __obj.updateDynamic("nodeVersion")(nodeVersion)
    if (npmArgs != null) __obj.updateDynamic("npmArgs")(npmArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(npmRebuild)) __obj.updateDynamic("npmRebuild")(npmRebuild)
    if (!js.isUndefined(npmSkipBuildFromSource)) __obj.updateDynamic("npmSkipBuildFromSource")(npmSkipBuildFromSource)
    if (nsis != null) __obj.updateDynamic("nsis")(nsis)
    if (nsisWeb != null) __obj.updateDynamic("nsisWeb")(nsisWeb)
    if (onNodeModuleFile != null) __obj.updateDynamic("onNodeModuleFile")(onNodeModuleFile.asInstanceOf[js.Any])
    if (p5p != null) __obj.updateDynamic("p5p")(p5p)
    if (pacman != null) __obj.updateDynamic("pacman")(pacman)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (portable != null) __obj.updateDynamic("portable")(portable)
    if (productName != null) __obj.updateDynamic("productName")(productName)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (protonNodeVersion != null) __obj.updateDynamic("protonNodeVersion")(protonNodeVersion)
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

