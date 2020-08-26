package typings.appBuilderLib.configurationMod

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.BeforeBuildContext
import typings.appBuilderLib.electronFrameworkMod.ElectronDownloadOptions
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
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.snapOptionsMod.SnapOptions
import typings.appBuilderLib.squirrelWindowsOptionsMod.SquirrelWindowsOptions
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends PlatformSpecificBuildOptions {
  /**
    * The function (or path to file or module id) to be [run after all artifacts are build](#afterAllArtifactBuild).
    */
  val afterAllArtifactBuild: js.UndefOr[
    (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be [run after pack](#afterpack) (but before pack into distributable format and sign).
    */
  val afterPack: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
    */
  val afterSign: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.native
  val apk: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * AppImage options.
    */
  val appImage: js.UndefOr[AppImageOptions | Null] = js.native
  val appx: js.UndefOr[AppXOptions | Null] = js.native
  /**
    * Appx manifest created on disk - not packed into .appx package yet.
    */
  val appxManifestCreated: js.UndefOr[(js.Function1[/* path */ String, js.Promise[_] | _]) | String | Null] = js.native
  /**
    * The function (or path to file or module id) to be run on artifact build completed.
    */
  val artifactBuildCompleted: js.UndefOr[(js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String | Null] = js.native
  /**
    * The function (or path to file or module id) to be run on artifact build start.
    */
  val artifactBuildStarted: js.UndefOr[
    (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be run before dependencies are installed or rebuilt. Works when `npmRebuild` is set to `true`. Resolving to `false` will skip dependencies install or rebuild.
    *
    * If provided and `node_modules` are missing, it will not invoke production dependencies check.
    */
  val beforeBuild: js.UndefOr[(js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String | Null] = js.native
  /**
    * Whether to build the application native dependencies from source.
    * @default false
    */
  var buildDependenciesFromSource: js.UndefOr[Boolean] = js.native
  /**
    * The build version. Maps to the `CFBundleVersion` on macOS, and `FileVersion` metadata property on Windows. Defaults to the `version`.
    * If `TRAVIS_BUILD_NUMBER` or `APPVEYOR_BUILD_NUMBER` or `CIRCLE_BUILD_NUM` or `BUILD_NUMBER` or `bamboo.buildNumber` or `CI_PIPELINE_IID` env defined, it will be used as a build version (`version.build_number`).
    */
  val buildVersion: js.UndefOr[String | Null] = js.native
  /**
    * The human-readable copyright line for the app.
    * @default Copyright © year ${author}
    */
  val copyright: js.UndefOr[String | Null] = js.native
  /**
    * Debian package options.
    */
  val deb: js.UndefOr[DebOptions | Null] = js.native
  val directories: js.UndefOr[MetadataDirectories | Null] = js.native
  /**
    * macOS DMG options.
    */
  val dmg: js.UndefOr[DmgOptions | Null] = js.native
  /**
    * Whether to use [electron-compile](http://github.com/electron/electron-compile) to compile app. Defaults to `true` if `electron-compile` in the dependencies. And `false` if in the `devDependencies` or doesn't specified.
    */
  val electronCompile: js.UndefOr[Boolean] = js.native
  /**
    * The path to custom Electron build (e.g. `~/electron/out/R`).
    */
  val electronDist: js.UndefOr[String] = js.native
  /**
    * The [electron-download](https://github.com/electron-userland/electron-download#usage) options.
    */
  val electronDownload: js.UndefOr[ElectronDownloadOptions] = js.native
  /**
    * The version of electron you are packaging for. Defaults to version of `electron`, `electron-prebuilt` or `electron-prebuilt-compile` dependency.
    */
  var electronVersion: js.UndefOr[String | Null] = js.native
  /**
    * The name of a built-in configuration preset or path to config file (relative to project dir). Currently, only `react-cra` is supported.
    *
    * If `react-scripts` in the app dependencies, `react-cra` will be set automatically. Set to `null` to disable automatic detection.
    */
  var `extends`: js.UndefOr[String | Null] = js.native
  /**
    * Inject properties to `package.json`.
    */
  val extraMetadata: js.UndefOr[js.Any] = js.native
  /**
    * The framework name. One of `electron`, `proton`, `libui`. Defaults to `electron`.
    */
  val framework: js.UndefOr[String | Null] = js.native
  val freebsd: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * Whether to include PDB files.
    * @default false
    */
  val includePdb: js.UndefOr[Boolean] = js.native
  /**
    * *libui-based frameworks only* The version of LaunchUI you are packaging for. Applicable for Windows only. Defaults to version suitable for used framework version.
    */
  val launchUiVersion: js.UndefOr[Boolean | String | Null] = js.native
  /**
    * Options related to how build Linux targets.
    */
  val linux: js.UndefOr[LinuxConfiguration | Null] = js.native
  /**
    * Options related to how build macOS targets.
    */
  val mac: js.UndefOr[MacConfiguration | Null] = js.native
  /**
    * MAS (Mac Application Store) options.
    */
  val mas: js.UndefOr[MasConfiguration | Null] = js.native
  /**
    * MAS (Mac Application Store) development options (`mas-dev` target).
    */
  val masDev: js.UndefOr[MasConfiguration | Null] = js.native
  /** @private */
  val msi: js.UndefOr[MsiOptions | Null] = js.native
  /**
    * Whether to execute `node-gyp rebuild` before starting to package the app.
    *
    * Don't [use](https://github.com/electron-userland/electron-builder/issues/683#issuecomment-241214075) [npm](http://electron.atom.io/docs/tutorial/using-native-node-modules/#using-npm) (neither `.npmrc`) for configuring electron headers. Use `electron-builder node-gyp-rebuild` instead.
    * @default false
    */
  val nodeGypRebuild: js.UndefOr[Boolean] = js.native
  /**
    * *libui-based frameworks only* The version of NodeJS you are packaging for.
    * You can set it to `current` to set the Node.js version that you use to run.
    */
  val nodeVersion: js.UndefOr[String | Null] = js.native
  /**
    * Additional command line arguments to use when installing app native deps.
    */
  val npmArgs: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * Whether to [rebuild](https://docs.npmjs.com/cli/rebuild) native dependencies before starting to package the app.
    * @default true
    */
  val npmRebuild: js.UndefOr[Boolean] = js.native
  val nsis: js.UndefOr[NsisOptions | Null] = js.native
  val nsisWeb: js.UndefOr[NsisWebOptions | Null] = js.native
  /**
    * The function (or path to file or module id) to be [run on each node module](#onnodemodulefile) file.
    */
  val onNodeModuleFile: js.UndefOr[(js.Function1[/* file */ String, Unit]) | String | Null] = js.native
  val p5p: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  val pacman: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * macOS PKG options.
    */
  val pkg: js.UndefOr[PkgOptions | Null] = js.native
  val portable: js.UndefOr[PortableOptions | Null] = js.native
  /**
    * As [name](#Metadata-name), but allows you to specify a product name for your executable which contains spaces and other special characters not allowed in the [name property](https://docs.npmjs.com/files/package.json#name).
    */
  val productName: js.UndefOr[String | Null] = js.native
  /**
    * Whether to build using Electron Build Service if target not supported on current OS.
    * @default true
    */
  val remoteBuild: js.UndefOr[Boolean] = js.native
  /**
    * Whether to remove `scripts` field from `package.json` files.
    *
    * @default true
    */
  val removePackageScripts: js.UndefOr[Boolean] = js.native
  val rpm: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * Snap options.
    */
  val snap: js.UndefOr[SnapOptions | Null] = js.native
  val squirrelWindows: js.UndefOr[SquirrelWindowsOptions | Null] = js.native
  /**
    * Options related to how build Windows targets.
    */
  val win: js.UndefOr[WindowsConfiguration | Null] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterAllArtifactBuildFunction1(value: /* context */ BuildResult => js.Promise[js.Array[String]] | js.Array[String]): Self = this.set("afterAllArtifactBuild", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterAllArtifactBuild(
      value: (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String
    ): Self = this.set("afterAllArtifactBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterAllArtifactBuild: Self = this.set("afterAllArtifactBuild", js.undefined)
    @scala.inline
    def setAfterAllArtifactBuildNull: Self = this.set("afterAllArtifactBuild", null)
    @scala.inline
    def setAfterPackFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = this.set("afterPack", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterPack(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = this.set("afterPack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterPack: Self = this.set("afterPack", js.undefined)
    @scala.inline
    def setAfterPackNull: Self = this.set("afterPack", null)
    @scala.inline
    def setAfterSignFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = this.set("afterSign", js.Any.fromFunction1(value))
    @scala.inline
    def setAfterSign(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = this.set("afterSign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSign: Self = this.set("afterSign", js.undefined)
    @scala.inline
    def setAfterSignNull: Self = this.set("afterSign", null)
    @scala.inline
    def setApk(value: LinuxTargetSpecificOptions): Self = this.set("apk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApk: Self = this.set("apk", js.undefined)
    @scala.inline
    def setApkNull: Self = this.set("apk", null)
    @scala.inline
    def setAppImage(value: AppImageOptions): Self = this.set("appImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppImage: Self = this.set("appImage", js.undefined)
    @scala.inline
    def setAppImageNull: Self = this.set("appImage", null)
    @scala.inline
    def setAppx(value: AppXOptions): Self = this.set("appx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppx: Self = this.set("appx", js.undefined)
    @scala.inline
    def setAppxNull: Self = this.set("appx", null)
    @scala.inline
    def setAppxManifestCreatedFunction1(value: /* path */ String => js.Promise[_] | _): Self = this.set("appxManifestCreated", js.Any.fromFunction1(value))
    @scala.inline
    def setAppxManifestCreated(value: (js.Function1[/* path */ String, js.Promise[_] | _]) | String): Self = this.set("appxManifestCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppxManifestCreated: Self = this.set("appxManifestCreated", js.undefined)
    @scala.inline
    def setAppxManifestCreatedNull: Self = this.set("appxManifestCreated", null)
    @scala.inline
    def setArtifactBuildCompletedFunction1(value: /* context */ ArtifactCreated => js.Promise[_] | _): Self = this.set("artifactBuildCompleted", js.Any.fromFunction1(value))
    @scala.inline
    def setArtifactBuildCompleted(value: (js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String): Self = this.set("artifactBuildCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactBuildCompleted: Self = this.set("artifactBuildCompleted", js.undefined)
    @scala.inline
    def setArtifactBuildCompletedNull: Self = this.set("artifactBuildCompleted", null)
    @scala.inline
    def setArtifactBuildStartedFunction1(value: /* context */ ArtifactBuildStarted => js.Promise[_] | _): Self = this.set("artifactBuildStarted", js.Any.fromFunction1(value))
    @scala.inline
    def setArtifactBuildStarted(value: (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String): Self = this.set("artifactBuildStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifactBuildStarted: Self = this.set("artifactBuildStarted", js.undefined)
    @scala.inline
    def setArtifactBuildStartedNull: Self = this.set("artifactBuildStarted", null)
    @scala.inline
    def setBeforeBuildFunction1(value: /* context */ BeforeBuildContext => js.Promise[_]): Self = this.set("beforeBuild", js.Any.fromFunction1(value))
    @scala.inline
    def setBeforeBuild(value: (js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String): Self = this.set("beforeBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeBuild: Self = this.set("beforeBuild", js.undefined)
    @scala.inline
    def setBeforeBuildNull: Self = this.set("beforeBuild", null)
    @scala.inline
    def setBuildDependenciesFromSource(value: Boolean): Self = this.set("buildDependenciesFromSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildDependenciesFromSource: Self = this.set("buildDependenciesFromSource", js.undefined)
    @scala.inline
    def setBuildVersion(value: String): Self = this.set("buildVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildVersion: Self = this.set("buildVersion", js.undefined)
    @scala.inline
    def setBuildVersionNull: Self = this.set("buildVersion", null)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setCopyrightNull: Self = this.set("copyright", null)
    @scala.inline
    def setDeb(value: DebOptions): Self = this.set("deb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeb: Self = this.set("deb", js.undefined)
    @scala.inline
    def setDebNull: Self = this.set("deb", null)
    @scala.inline
    def setDirectories(value: MetadataDirectories): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setDirectoriesNull: Self = this.set("directories", null)
    @scala.inline
    def setDmg(value: DmgOptions): Self = this.set("dmg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDmg: Self = this.set("dmg", js.undefined)
    @scala.inline
    def setDmgNull: Self = this.set("dmg", null)
    @scala.inline
    def setElectronCompile(value: Boolean): Self = this.set("electronCompile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronCompile: Self = this.set("electronCompile", js.undefined)
    @scala.inline
    def setElectronDist(value: String): Self = this.set("electronDist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronDist: Self = this.set("electronDist", js.undefined)
    @scala.inline
    def setElectronDownload(value: ElectronDownloadOptions): Self = this.set("electronDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronDownload: Self = this.set("electronDownload", js.undefined)
    @scala.inline
    def setElectronVersion(value: String): Self = this.set("electronVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronVersion: Self = this.set("electronVersion", js.undefined)
    @scala.inline
    def setElectronVersionNull: Self = this.set("electronVersion", null)
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    @scala.inline
    def setExtraMetadata(value: js.Any): Self = this.set("extraMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraMetadata: Self = this.set("extraMetadata", js.undefined)
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    @scala.inline
    def setFrameworkNull: Self = this.set("framework", null)
    @scala.inline
    def setFreebsd(value: LinuxTargetSpecificOptions): Self = this.set("freebsd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreebsd: Self = this.set("freebsd", js.undefined)
    @scala.inline
    def setFreebsdNull: Self = this.set("freebsd", null)
    @scala.inline
    def setIncludePdb(value: Boolean): Self = this.set("includePdb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePdb: Self = this.set("includePdb", js.undefined)
    @scala.inline
    def setLaunchUiVersion(value: Boolean | String): Self = this.set("launchUiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchUiVersion: Self = this.set("launchUiVersion", js.undefined)
    @scala.inline
    def setLaunchUiVersionNull: Self = this.set("launchUiVersion", null)
    @scala.inline
    def setLinux(value: LinuxConfiguration): Self = this.set("linux", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinux: Self = this.set("linux", js.undefined)
    @scala.inline
    def setLinuxNull: Self = this.set("linux", null)
    @scala.inline
    def setMac(value: MacConfiguration): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    @scala.inline
    def setMacNull: Self = this.set("mac", null)
    @scala.inline
    def setMas(value: MasConfiguration): Self = this.set("mas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMas: Self = this.set("mas", js.undefined)
    @scala.inline
    def setMasNull: Self = this.set("mas", null)
    @scala.inline
    def setMasDev(value: MasConfiguration): Self = this.set("masDev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasDev: Self = this.set("masDev", js.undefined)
    @scala.inline
    def setMasDevNull: Self = this.set("masDev", null)
    @scala.inline
    def setMsi(value: MsiOptions): Self = this.set("msi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsi: Self = this.set("msi", js.undefined)
    @scala.inline
    def setMsiNull: Self = this.set("msi", null)
    @scala.inline
    def setNodeGypRebuild(value: Boolean): Self = this.set("nodeGypRebuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeGypRebuild: Self = this.set("nodeGypRebuild", js.undefined)
    @scala.inline
    def setNodeVersion(value: String): Self = this.set("nodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeVersion: Self = this.set("nodeVersion", js.undefined)
    @scala.inline
    def setNodeVersionNull: Self = this.set("nodeVersion", null)
    @scala.inline
    def setNpmArgsVarargs(value: String*): Self = this.set("npmArgs", js.Array(value :_*))
    @scala.inline
    def setNpmArgs(value: js.Array[String] | String): Self = this.set("npmArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpmArgs: Self = this.set("npmArgs", js.undefined)
    @scala.inline
    def setNpmArgsNull: Self = this.set("npmArgs", null)
    @scala.inline
    def setNpmRebuild(value: Boolean): Self = this.set("npmRebuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpmRebuild: Self = this.set("npmRebuild", js.undefined)
    @scala.inline
    def setNsis(value: NsisOptions): Self = this.set("nsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsis: Self = this.set("nsis", js.undefined)
    @scala.inline
    def setNsisNull: Self = this.set("nsis", null)
    @scala.inline
    def setNsisWeb(value: NsisWebOptions): Self = this.set("nsisWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsisWeb: Self = this.set("nsisWeb", js.undefined)
    @scala.inline
    def setNsisWebNull: Self = this.set("nsisWeb", null)
    @scala.inline
    def setOnNodeModuleFileFunction1(value: /* file */ String => Unit): Self = this.set("onNodeModuleFile", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNodeModuleFile(value: (js.Function1[/* file */ String, Unit]) | String): Self = this.set("onNodeModuleFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnNodeModuleFile: Self = this.set("onNodeModuleFile", js.undefined)
    @scala.inline
    def setOnNodeModuleFileNull: Self = this.set("onNodeModuleFile", null)
    @scala.inline
    def setP5p(value: LinuxTargetSpecificOptions): Self = this.set("p5p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP5p: Self = this.set("p5p", js.undefined)
    @scala.inline
    def setP5pNull: Self = this.set("p5p", null)
    @scala.inline
    def setPacman(value: LinuxTargetSpecificOptions): Self = this.set("pacman", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacman: Self = this.set("pacman", js.undefined)
    @scala.inline
    def setPacmanNull: Self = this.set("pacman", null)
    @scala.inline
    def setPkg(value: PkgOptions): Self = this.set("pkg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    @scala.inline
    def setPkgNull: Self = this.set("pkg", null)
    @scala.inline
    def setPortable(value: PortableOptions): Self = this.set("portable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortable: Self = this.set("portable", js.undefined)
    @scala.inline
    def setPortableNull: Self = this.set("portable", null)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setProductNameNull: Self = this.set("productName", null)
    @scala.inline
    def setRemoteBuild(value: Boolean): Self = this.set("remoteBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteBuild: Self = this.set("remoteBuild", js.undefined)
    @scala.inline
    def setRemovePackageScripts(value: Boolean): Self = this.set("removePackageScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovePackageScripts: Self = this.set("removePackageScripts", js.undefined)
    @scala.inline
    def setRpm(value: LinuxTargetSpecificOptions): Self = this.set("rpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpm: Self = this.set("rpm", js.undefined)
    @scala.inline
    def setRpmNull: Self = this.set("rpm", null)
    @scala.inline
    def setSnap(value: SnapOptions): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setSnapNull: Self = this.set("snap", null)
    @scala.inline
    def setSquirrelWindows(value: SquirrelWindowsOptions): Self = this.set("squirrelWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquirrelWindows: Self = this.set("squirrelWindows", js.undefined)
    @scala.inline
    def setSquirrelWindowsNull: Self = this.set("squirrelWindows", null)
    @scala.inline
    def setWin(value: WindowsConfiguration): Self = this.set("win", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWin: Self = this.set("win", js.undefined)
    @scala.inline
    def setWinNull: Self = this.set("win", null)
  }
  
}

