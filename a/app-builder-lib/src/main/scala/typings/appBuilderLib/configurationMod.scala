package typings.appBuilderLib

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.BeforeBuildContext
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.electronFrameworkMod.ElectronBrandingOptions
import typings.appBuilderLib.electronFrameworkMod.ElectronDownloadOptions
import typings.appBuilderLib.frameworkMod.PrepareApplicationStageDirectoryOptions
import typings.appBuilderLib.linuxOptionsMod.AppImageOptions
import typings.appBuilderLib.linuxOptionsMod.DebOptions
import typings.appBuilderLib.linuxOptionsMod.FlatpakOptions
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
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.snapOptionsMod.SnapOptions
import typings.appBuilderLib.squirrelWindowsOptionsMod.SquirrelWindowsOptions
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import typings.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  type AfterPackContext = PackContext
  
  type BeforePackContext = PackContext
  
  trait Configuration
    extends StObject
       with PlatformSpecificBuildOptions {
    
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
        (js.Function1[/* context */ AfterPackContext, js.Promise[Any] | Any]) | String | Null
      ] = js.undefined
    
    /**
      * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
      */
    val afterSign: js.UndefOr[
        (js.Function1[/* context */ AfterPackContext, js.Promise[Any] | Any]) | String | Null
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
    val appxManifestCreated: js.UndefOr[(js.Function1[/* path */ String, js.Promise[Any] | Any]) | String | Null] = js.undefined
    
    /**
      * The function (or path to file or module id) to be run on artifact build completed.
      */
    val artifactBuildCompleted: js.UndefOr[
        (js.Function1[/* context */ ArtifactCreated, js.Promise[Any] | Any]) | String | Null
      ] = js.undefined
    
    /**
      * The function (or path to file or module id) to be run on artifact build start.
      */
    val artifactBuildStarted: js.UndefOr[
        (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[Any] | Any]) | String | Null
      ] = js.undefined
    
    /**
      * The function (or path to file or module id) to be run before dependencies are installed or rebuilt. Works when `npmRebuild` is set to `true`. Resolving to `false` will skip dependencies install or rebuild.
      *
      * If provided and `node_modules` are missing, it will not invoke production dependencies check.
      */
    val beforeBuild: js.UndefOr[
        (js.Function1[/* context */ BeforeBuildContext, js.Promise[Any]]) | String | Null
      ] = js.undefined
    
    /**
      * The function (or path to file or module id) to be [run before pack](#beforepack)
      */
    val beforePack: js.UndefOr[
        (js.Function1[/* context */ BeforePackContext, js.Promise[Any] | Any]) | String | Null
      ] = js.undefined
    
    /**
      * Whether to build the application native dependencies from source.
      * @default false
      */
    var buildDependenciesFromSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The build number. Maps to the `--iteration` flag for builds using FPM on Linux.
      * If not defined, then it will fallback to `BUILD_NUMBER` or `TRAVIS_BUILD_NUMBER` or `APPVEYOR_BUILD_NUMBER` or `CIRCLE_BUILD_NUM` or `BUILD_BUILDNUMBER` or `CI_PIPELINE_IID` env.
      */
    val buildNumber: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The build version. Maps to the `CFBundleVersion` on macOS, and `FileVersion` metadata property on Windows. Defaults to the `version`.
      * If `buildVersion` is not defined and `buildNumber` (or one of the `buildNumber` envs) is defined, it will be used as a build version (`version.buildNumber`).
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
      * The branding used by Electron's distributables. This is needed if a fork has modified Electron's BRANDING.json file.
      */
    val electronBranding: js.UndefOr[ElectronBrandingOptions] = js.undefined
    
    /**
      * Whether to use [electron-compile](http://github.com/electron/electron-compile) to compile app. Defaults to `true` if `electron-compile` in the dependencies. And `false` if in the `devDependencies` or doesn't specified.
      */
    val electronCompile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns the path to custom Electron build (e.g. `~/electron/out/R`). Zip files must follow the pattern `electron-v${version}-${platformName}-${arch}.zip`, otherwise it will be assumed to be an unpacked Electron app directory
      */
    val electronDist: js.UndefOr[
        String | (js.Function1[/* options */ PrepareApplicationStageDirectoryOptions, String])
      ] = js.undefined
    
    /**
      * The [electron-download](https://github.com/electron-userland/electron-download#usage) options.
      */
    val electronDownload: js.UndefOr[ElectronDownloadOptions] = js.undefined
    
    /**
      * The version of electron you are packaging for. Defaults to version of `electron`, `electron-prebuilt` or `electron-prebuilt-compile` dependency.
      */
    var electronVersion: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The name of a built-in configuration preset (currently, only `react-cra` is supported) or any number of paths to config files (relative to project dir).
      *
      * The latter allows to mixin a config from multiple other configs, as if you `Object.assign` them, but properly combine `files` glob patterns.
      *
      * If `react-scripts` in the app dependencies, `react-cra` will be set automatically. Set to `null` to disable automatic detection.
      */
    var `extends`: js.UndefOr[js.Array[String] | String | Null] = js.undefined
    
    /**
      * Inject properties to `package.json`.
      */
    val extraMetadata: js.UndefOr[Any] = js.undefined
    
    /**
      * Flatpak options.
      */
    val flatpak: js.UndefOr[FlatpakOptions | Null] = js.undefined
    
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
      * Whether to include *all* of the submodules node_modules directories
      * @default false
      */
    var includeSubNodeModules: js.UndefOr[Boolean] = js.undefined
    
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
      * MSI project created on disk - not packed into .msi package yet.
      */
    val msiProjectCreated: js.UndefOr[(js.Function1[/* path */ String, js.Promise[Any] | Any]) | String | Null] = js.undefined
    
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
      * If not specified inside of the `build` configuration, `productName` property defined at the top level of `package.json` is used. If not specified at the top level of `package.json`, [name property](https://docs.npmjs.com/files/package.json#name) is used.
      */
    val productName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to build using Electron Build Service if target not supported on current OS.
      * @default true
      */
    val remoteBuild: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove `keywords` field from `package.json` files.
      *
      * @default true
      */
    val removePackageKeywords: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAfterAllArtifactBuild(
        value: (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String
      ): Self = StObject.set(x, "afterAllArtifactBuild", value.asInstanceOf[js.Any])
      
      inline def setAfterAllArtifactBuildFunction1(value: /* context */ BuildResult => js.Promise[js.Array[String]] | js.Array[String]): Self = StObject.set(x, "afterAllArtifactBuild", js.Any.fromFunction1(value))
      
      inline def setAfterAllArtifactBuildNull: Self = StObject.set(x, "afterAllArtifactBuild", null)
      
      inline def setAfterAllArtifactBuildUndefined: Self = StObject.set(x, "afterAllArtifactBuild", js.undefined)
      
      inline def setAfterPack(value: (js.Function1[/* context */ AfterPackContext, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "afterPack", value.asInstanceOf[js.Any])
      
      inline def setAfterPackFunction1(value: /* context */ AfterPackContext => js.Promise[Any] | Any): Self = StObject.set(x, "afterPack", js.Any.fromFunction1(value))
      
      inline def setAfterPackNull: Self = StObject.set(x, "afterPack", null)
      
      inline def setAfterPackUndefined: Self = StObject.set(x, "afterPack", js.undefined)
      
      inline def setAfterSign(value: (js.Function1[/* context */ AfterPackContext, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "afterSign", value.asInstanceOf[js.Any])
      
      inline def setAfterSignFunction1(value: /* context */ AfterPackContext => js.Promise[Any] | Any): Self = StObject.set(x, "afterSign", js.Any.fromFunction1(value))
      
      inline def setAfterSignNull: Self = StObject.set(x, "afterSign", null)
      
      inline def setAfterSignUndefined: Self = StObject.set(x, "afterSign", js.undefined)
      
      inline def setApk(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "apk", value.asInstanceOf[js.Any])
      
      inline def setApkNull: Self = StObject.set(x, "apk", null)
      
      inline def setApkUndefined: Self = StObject.set(x, "apk", js.undefined)
      
      inline def setAppImage(value: AppImageOptions): Self = StObject.set(x, "appImage", value.asInstanceOf[js.Any])
      
      inline def setAppImageNull: Self = StObject.set(x, "appImage", null)
      
      inline def setAppImageUndefined: Self = StObject.set(x, "appImage", js.undefined)
      
      inline def setAppx(value: AppXOptions): Self = StObject.set(x, "appx", value.asInstanceOf[js.Any])
      
      inline def setAppxManifestCreated(value: (js.Function1[/* path */ String, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "appxManifestCreated", value.asInstanceOf[js.Any])
      
      inline def setAppxManifestCreatedFunction1(value: /* path */ String => js.Promise[Any] | Any): Self = StObject.set(x, "appxManifestCreated", js.Any.fromFunction1(value))
      
      inline def setAppxManifestCreatedNull: Self = StObject.set(x, "appxManifestCreated", null)
      
      inline def setAppxManifestCreatedUndefined: Self = StObject.set(x, "appxManifestCreated", js.undefined)
      
      inline def setAppxNull: Self = StObject.set(x, "appx", null)
      
      inline def setAppxUndefined: Self = StObject.set(x, "appx", js.undefined)
      
      inline def setArtifactBuildCompleted(value: (js.Function1[/* context */ ArtifactCreated, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "artifactBuildCompleted", value.asInstanceOf[js.Any])
      
      inline def setArtifactBuildCompletedFunction1(value: /* context */ ArtifactCreated => js.Promise[Any] | Any): Self = StObject.set(x, "artifactBuildCompleted", js.Any.fromFunction1(value))
      
      inline def setArtifactBuildCompletedNull: Self = StObject.set(x, "artifactBuildCompleted", null)
      
      inline def setArtifactBuildCompletedUndefined: Self = StObject.set(x, "artifactBuildCompleted", js.undefined)
      
      inline def setArtifactBuildStarted(value: (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "artifactBuildStarted", value.asInstanceOf[js.Any])
      
      inline def setArtifactBuildStartedFunction1(value: /* context */ ArtifactBuildStarted => js.Promise[Any] | Any): Self = StObject.set(x, "artifactBuildStarted", js.Any.fromFunction1(value))
      
      inline def setArtifactBuildStartedNull: Self = StObject.set(x, "artifactBuildStarted", null)
      
      inline def setArtifactBuildStartedUndefined: Self = StObject.set(x, "artifactBuildStarted", js.undefined)
      
      inline def setBeforeBuild(value: (js.Function1[/* context */ BeforeBuildContext, js.Promise[Any]]) | String): Self = StObject.set(x, "beforeBuild", value.asInstanceOf[js.Any])
      
      inline def setBeforeBuildFunction1(value: /* context */ BeforeBuildContext => js.Promise[Any]): Self = StObject.set(x, "beforeBuild", js.Any.fromFunction1(value))
      
      inline def setBeforeBuildNull: Self = StObject.set(x, "beforeBuild", null)
      
      inline def setBeforeBuildUndefined: Self = StObject.set(x, "beforeBuild", js.undefined)
      
      inline def setBeforePack(value: (js.Function1[/* context */ BeforePackContext, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "beforePack", value.asInstanceOf[js.Any])
      
      inline def setBeforePackFunction1(value: /* context */ BeforePackContext => js.Promise[Any] | Any): Self = StObject.set(x, "beforePack", js.Any.fromFunction1(value))
      
      inline def setBeforePackNull: Self = StObject.set(x, "beforePack", null)
      
      inline def setBeforePackUndefined: Self = StObject.set(x, "beforePack", js.undefined)
      
      inline def setBuildDependenciesFromSource(value: Boolean): Self = StObject.set(x, "buildDependenciesFromSource", value.asInstanceOf[js.Any])
      
      inline def setBuildDependenciesFromSourceUndefined: Self = StObject.set(x, "buildDependenciesFromSource", js.undefined)
      
      inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
      
      inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
      
      inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
      
      inline def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
      
      inline def setBuildVersionNull: Self = StObject.set(x, "buildVersion", null)
      
      inline def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setDeb(value: DebOptions): Self = StObject.set(x, "deb", value.asInstanceOf[js.Any])
      
      inline def setDebNull: Self = StObject.set(x, "deb", null)
      
      inline def setDebUndefined: Self = StObject.set(x, "deb", js.undefined)
      
      inline def setDirectories(value: MetadataDirectories): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesNull: Self = StObject.set(x, "directories", null)
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setDmg(value: DmgOptions): Self = StObject.set(x, "dmg", value.asInstanceOf[js.Any])
      
      inline def setDmgNull: Self = StObject.set(x, "dmg", null)
      
      inline def setDmgUndefined: Self = StObject.set(x, "dmg", js.undefined)
      
      inline def setElectronBranding(value: ElectronBrandingOptions): Self = StObject.set(x, "electronBranding", value.asInstanceOf[js.Any])
      
      inline def setElectronBrandingUndefined: Self = StObject.set(x, "electronBranding", js.undefined)
      
      inline def setElectronCompile(value: Boolean): Self = StObject.set(x, "electronCompile", value.asInstanceOf[js.Any])
      
      inline def setElectronCompileUndefined: Self = StObject.set(x, "electronCompile", js.undefined)
      
      inline def setElectronDist(value: String | (js.Function1[/* options */ PrepareApplicationStageDirectoryOptions, String])): Self = StObject.set(x, "electronDist", value.asInstanceOf[js.Any])
      
      inline def setElectronDistFunction1(value: /* options */ PrepareApplicationStageDirectoryOptions => String): Self = StObject.set(x, "electronDist", js.Any.fromFunction1(value))
      
      inline def setElectronDistUndefined: Self = StObject.set(x, "electronDist", js.undefined)
      
      inline def setElectronDownload(value: ElectronDownloadOptions): Self = StObject.set(x, "electronDownload", value.asInstanceOf[js.Any])
      
      inline def setElectronDownloadUndefined: Self = StObject.set(x, "electronDownload", js.undefined)
      
      inline def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      inline def setElectronVersionNull: Self = StObject.set(x, "electronVersion", null)
      
      inline def setElectronVersionUndefined: Self = StObject.set(x, "electronVersion", js.undefined)
      
      inline def setExtends(value: js.Array[String] | String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setExtraMetadata(value: Any): Self = StObject.set(x, "extraMetadata", value.asInstanceOf[js.Any])
      
      inline def setExtraMetadataUndefined: Self = StObject.set(x, "extraMetadata", js.undefined)
      
      inline def setFlatpak(value: FlatpakOptions): Self = StObject.set(x, "flatpak", value.asInstanceOf[js.Any])
      
      inline def setFlatpakNull: Self = StObject.set(x, "flatpak", null)
      
      inline def setFlatpakUndefined: Self = StObject.set(x, "flatpak", js.undefined)
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkNull: Self = StObject.set(x, "framework", null)
      
      inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      inline def setFreebsd(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "freebsd", value.asInstanceOf[js.Any])
      
      inline def setFreebsdNull: Self = StObject.set(x, "freebsd", null)
      
      inline def setFreebsdUndefined: Self = StObject.set(x, "freebsd", js.undefined)
      
      inline def setIncludePdb(value: Boolean): Self = StObject.set(x, "includePdb", value.asInstanceOf[js.Any])
      
      inline def setIncludePdbUndefined: Self = StObject.set(x, "includePdb", js.undefined)
      
      inline def setIncludeSubNodeModules(value: Boolean): Self = StObject.set(x, "includeSubNodeModules", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubNodeModulesUndefined: Self = StObject.set(x, "includeSubNodeModules", js.undefined)
      
      inline def setLaunchUiVersion(value: Boolean | String): Self = StObject.set(x, "launchUiVersion", value.asInstanceOf[js.Any])
      
      inline def setLaunchUiVersionNull: Self = StObject.set(x, "launchUiVersion", null)
      
      inline def setLaunchUiVersionUndefined: Self = StObject.set(x, "launchUiVersion", js.undefined)
      
      inline def setLinux(value: LinuxConfiguration): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setLinuxNull: Self = StObject.set(x, "linux", null)
      
      inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      inline def setMac(value: MacConfiguration): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacNull: Self = StObject.set(x, "mac", null)
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setMas(value: MasConfiguration): Self = StObject.set(x, "mas", value.asInstanceOf[js.Any])
      
      inline def setMasDev(value: MasConfiguration): Self = StObject.set(x, "masDev", value.asInstanceOf[js.Any])
      
      inline def setMasDevNull: Self = StObject.set(x, "masDev", null)
      
      inline def setMasDevUndefined: Self = StObject.set(x, "masDev", js.undefined)
      
      inline def setMasNull: Self = StObject.set(x, "mas", null)
      
      inline def setMasUndefined: Self = StObject.set(x, "mas", js.undefined)
      
      inline def setMsi(value: MsiOptions): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
      
      inline def setMsiNull: Self = StObject.set(x, "msi", null)
      
      inline def setMsiProjectCreated(value: (js.Function1[/* path */ String, js.Promise[Any] | Any]) | String): Self = StObject.set(x, "msiProjectCreated", value.asInstanceOf[js.Any])
      
      inline def setMsiProjectCreatedFunction1(value: /* path */ String => js.Promise[Any] | Any): Self = StObject.set(x, "msiProjectCreated", js.Any.fromFunction1(value))
      
      inline def setMsiProjectCreatedNull: Self = StObject.set(x, "msiProjectCreated", null)
      
      inline def setMsiProjectCreatedUndefined: Self = StObject.set(x, "msiProjectCreated", js.undefined)
      
      inline def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
      
      inline def setNodeGypRebuild(value: Boolean): Self = StObject.set(x, "nodeGypRebuild", value.asInstanceOf[js.Any])
      
      inline def setNodeGypRebuildUndefined: Self = StObject.set(x, "nodeGypRebuild", js.undefined)
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      inline def setNodeVersionNull: Self = StObject.set(x, "nodeVersion", null)
      
      inline def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
      
      inline def setNpmArgs(value: js.Array[String] | String): Self = StObject.set(x, "npmArgs", value.asInstanceOf[js.Any])
      
      inline def setNpmArgsNull: Self = StObject.set(x, "npmArgs", null)
      
      inline def setNpmArgsUndefined: Self = StObject.set(x, "npmArgs", js.undefined)
      
      inline def setNpmArgsVarargs(value: String*): Self = StObject.set(x, "npmArgs", js.Array(value*))
      
      inline def setNpmRebuild(value: Boolean): Self = StObject.set(x, "npmRebuild", value.asInstanceOf[js.Any])
      
      inline def setNpmRebuildUndefined: Self = StObject.set(x, "npmRebuild", js.undefined)
      
      inline def setNsis(value: NsisOptions): Self = StObject.set(x, "nsis", value.asInstanceOf[js.Any])
      
      inline def setNsisNull: Self = StObject.set(x, "nsis", null)
      
      inline def setNsisUndefined: Self = StObject.set(x, "nsis", js.undefined)
      
      inline def setNsisWeb(value: NsisWebOptions): Self = StObject.set(x, "nsisWeb", value.asInstanceOf[js.Any])
      
      inline def setNsisWebNull: Self = StObject.set(x, "nsisWeb", null)
      
      inline def setNsisWebUndefined: Self = StObject.set(x, "nsisWeb", js.undefined)
      
      inline def setOnNodeModuleFile(value: (js.Function1[/* file */ String, Unit]) | String): Self = StObject.set(x, "onNodeModuleFile", value.asInstanceOf[js.Any])
      
      inline def setOnNodeModuleFileFunction1(value: /* file */ String => Unit): Self = StObject.set(x, "onNodeModuleFile", js.Any.fromFunction1(value))
      
      inline def setOnNodeModuleFileNull: Self = StObject.set(x, "onNodeModuleFile", null)
      
      inline def setOnNodeModuleFileUndefined: Self = StObject.set(x, "onNodeModuleFile", js.undefined)
      
      inline def setP5p(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "p5p", value.asInstanceOf[js.Any])
      
      inline def setP5pNull: Self = StObject.set(x, "p5p", null)
      
      inline def setP5pUndefined: Self = StObject.set(x, "p5p", js.undefined)
      
      inline def setPacman(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "pacman", value.asInstanceOf[js.Any])
      
      inline def setPacmanNull: Self = StObject.set(x, "pacman", null)
      
      inline def setPacmanUndefined: Self = StObject.set(x, "pacman", js.undefined)
      
      inline def setPkg(value: PkgOptions): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgNull: Self = StObject.set(x, "pkg", null)
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setPortable(value: PortableOptions): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      inline def setPortableNull: Self = StObject.set(x, "portable", null)
      
      inline def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductNameNull: Self = StObject.set(x, "productName", null)
      
      inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      inline def setRemoteBuild(value: Boolean): Self = StObject.set(x, "remoteBuild", value.asInstanceOf[js.Any])
      
      inline def setRemoteBuildUndefined: Self = StObject.set(x, "remoteBuild", js.undefined)
      
      inline def setRemovePackageKeywords(value: Boolean): Self = StObject.set(x, "removePackageKeywords", value.asInstanceOf[js.Any])
      
      inline def setRemovePackageKeywordsUndefined: Self = StObject.set(x, "removePackageKeywords", js.undefined)
      
      inline def setRemovePackageScripts(value: Boolean): Self = StObject.set(x, "removePackageScripts", value.asInstanceOf[js.Any])
      
      inline def setRemovePackageScriptsUndefined: Self = StObject.set(x, "removePackageScripts", js.undefined)
      
      inline def setRpm(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      inline def setRpmNull: Self = StObject.set(x, "rpm", null)
      
      inline def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      inline def setSnap(value: SnapOptions): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapNull: Self = StObject.set(x, "snap", null)
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setSquirrelWindows(value: SquirrelWindowsOptions): Self = StObject.set(x, "squirrelWindows", value.asInstanceOf[js.Any])
      
      inline def setSquirrelWindowsNull: Self = StObject.set(x, "squirrelWindows", null)
      
      inline def setSquirrelWindowsUndefined: Self = StObject.set(x, "squirrelWindows", js.undefined)
      
      inline def setWin(value: WindowsConfiguration): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      inline def setWinNull: Self = StObject.set(x, "win", null)
      
      inline def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
    }
  }
  
  trait MetadataDirectories extends StObject {
    
    /**
      * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
      */
    val app: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The path to build resources.
      *
      * Please note — build resources are not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
      * @default build
      */
    val buildResources: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The output directory. [File macros](/file-patterns#file-macros) are supported.
      * @default dist
      */
    val output: js.UndefOr[String | Null] = js.undefined
  }
  object MetadataDirectories {
    
    inline def apply(): MetadataDirectories = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataDirectories]
    }
    
    extension [Self <: MetadataDirectories](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppNull: Self = StObject.set(x, "app", null)
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setBuildResources(value: String): Self = StObject.set(x, "buildResources", value.asInstanceOf[js.Any])
      
      inline def setBuildResourcesNull: Self = StObject.set(x, "buildResources", null)
      
      inline def setBuildResourcesUndefined: Self = StObject.set(x, "buildResources", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputNull: Self = StObject.set(x, "output", null)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait PackContext extends StObject {
    
    val appOutDir: String
    
    val arch: Arch
    
    val electronPlatformName: String
    
    val outDir: String
    
    val packager: PlatformPackager[Any]
    
    val targets: js.Array[Target]
  }
  object PackContext {
    
    inline def apply(
      appOutDir: String,
      arch: Arch,
      electronPlatformName: String,
      outDir: String,
      packager: PlatformPackager[Any],
      targets: js.Array[Target]
    ): PackContext = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronPlatformName = electronPlatformName.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackContext]
    }
    
    extension [Self <: PackContext](x: Self) {
      
      inline def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      inline def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setElectronPlatformName(value: String): Self = StObject.set(x, "electronPlatformName", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setPackager(value: PlatformPackager[Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: js.Array[Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
}
