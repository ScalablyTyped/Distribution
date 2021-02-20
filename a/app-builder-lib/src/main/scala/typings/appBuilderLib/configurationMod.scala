package typings.appBuilderLib

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.BeforeBuildContext
import typings.appBuilderLib.coreMod.Target
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
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.snapOptionsMod.SnapOptions
import typings.appBuilderLib.squirrelWindowsOptionsMod.SquirrelWindowsOptions
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import typings.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @js.native
  trait AfterPackContext extends StObject {
    
    val appOutDir: String = js.native
    
    val arch: Arch = js.native
    
    val electronPlatformName: String = js.native
    
    val outDir: String = js.native
    
    val packager: PlatformPackager[_] = js.native
    
    val targets: js.Array[Target] = js.native
  }
  object AfterPackContext {
    
    @scala.inline
    def apply(
      appOutDir: String,
      arch: Arch,
      electronPlatformName: String,
      outDir: String,
      packager: PlatformPackager[_],
      targets: js.Array[Target]
    ): AfterPackContext = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronPlatformName = electronPlatformName.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterPackContext]
    }
    
    @scala.inline
    implicit class AfterPackContextMutableBuilder[Self <: AfterPackContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronPlatformName(value: String): Self = StObject.set(x, "electronPlatformName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackager(value: PlatformPackager[_]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargets(value: js.Array[Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
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
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAllArtifactBuild(
        value: (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String
      ): Self = StObject.set(x, "afterAllArtifactBuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterAllArtifactBuildFunction1(value: /* context */ BuildResult => js.Promise[js.Array[String]] | js.Array[String]): Self = StObject.set(x, "afterAllArtifactBuild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterAllArtifactBuildNull: Self = StObject.set(x, "afterAllArtifactBuild", null)
      
      @scala.inline
      def setAfterAllArtifactBuildUndefined: Self = StObject.set(x, "afterAllArtifactBuild", js.undefined)
      
      @scala.inline
      def setAfterPack(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = StObject.set(x, "afterPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterPackFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = StObject.set(x, "afterPack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPackNull: Self = StObject.set(x, "afterPack", null)
      
      @scala.inline
      def setAfterPackUndefined: Self = StObject.set(x, "afterPack", js.undefined)
      
      @scala.inline
      def setAfterSign(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = StObject.set(x, "afterSign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterSignFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = StObject.set(x, "afterSign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSignNull: Self = StObject.set(x, "afterSign", null)
      
      @scala.inline
      def setAfterSignUndefined: Self = StObject.set(x, "afterSign", js.undefined)
      
      @scala.inline
      def setApk(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "apk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApkNull: Self = StObject.set(x, "apk", null)
      
      @scala.inline
      def setApkUndefined: Self = StObject.set(x, "apk", js.undefined)
      
      @scala.inline
      def setAppImage(value: AppImageOptions): Self = StObject.set(x, "appImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppImageNull: Self = StObject.set(x, "appImage", null)
      
      @scala.inline
      def setAppImageUndefined: Self = StObject.set(x, "appImage", js.undefined)
      
      @scala.inline
      def setAppx(value: AppXOptions): Self = StObject.set(x, "appx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppxManifestCreated(value: (js.Function1[/* path */ String, js.Promise[_] | _]) | String): Self = StObject.set(x, "appxManifestCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppxManifestCreatedFunction1(value: /* path */ String => js.Promise[_] | _): Self = StObject.set(x, "appxManifestCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppxManifestCreatedNull: Self = StObject.set(x, "appxManifestCreated", null)
      
      @scala.inline
      def setAppxManifestCreatedUndefined: Self = StObject.set(x, "appxManifestCreated", js.undefined)
      
      @scala.inline
      def setAppxNull: Self = StObject.set(x, "appx", null)
      
      @scala.inline
      def setAppxUndefined: Self = StObject.set(x, "appx", js.undefined)
      
      @scala.inline
      def setArtifactBuildCompleted(value: (js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String): Self = StObject.set(x, "artifactBuildCompleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactBuildCompletedFunction1(value: /* context */ ArtifactCreated => js.Promise[_] | _): Self = StObject.set(x, "artifactBuildCompleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArtifactBuildCompletedNull: Self = StObject.set(x, "artifactBuildCompleted", null)
      
      @scala.inline
      def setArtifactBuildCompletedUndefined: Self = StObject.set(x, "artifactBuildCompleted", js.undefined)
      
      @scala.inline
      def setArtifactBuildStarted(value: (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String): Self = StObject.set(x, "artifactBuildStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactBuildStartedFunction1(value: /* context */ ArtifactBuildStarted => js.Promise[_] | _): Self = StObject.set(x, "artifactBuildStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArtifactBuildStartedNull: Self = StObject.set(x, "artifactBuildStarted", null)
      
      @scala.inline
      def setArtifactBuildStartedUndefined: Self = StObject.set(x, "artifactBuildStarted", js.undefined)
      
      @scala.inline
      def setBeforeBuild(value: (js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String): Self = StObject.set(x, "beforeBuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeBuildFunction1(value: /* context */ BeforeBuildContext => js.Promise[_]): Self = StObject.set(x, "beforeBuild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeBuildNull: Self = StObject.set(x, "beforeBuild", null)
      
      @scala.inline
      def setBeforeBuildUndefined: Self = StObject.set(x, "beforeBuild", js.undefined)
      
      @scala.inline
      def setBuildDependenciesFromSource(value: Boolean): Self = StObject.set(x, "buildDependenciesFromSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildDependenciesFromSourceUndefined: Self = StObject.set(x, "buildDependenciesFromSource", js.undefined)
      
      @scala.inline
      def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildVersionNull: Self = StObject.set(x, "buildVersion", null)
      
      @scala.inline
      def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightNull: Self = StObject.set(x, "copyright", null)
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDeb(value: DebOptions): Self = StObject.set(x, "deb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebNull: Self = StObject.set(x, "deb", null)
      
      @scala.inline
      def setDebUndefined: Self = StObject.set(x, "deb", js.undefined)
      
      @scala.inline
      def setDirectories(value: MetadataDirectories): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesNull: Self = StObject.set(x, "directories", null)
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setDmg(value: DmgOptions): Self = StObject.set(x, "dmg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDmgNull: Self = StObject.set(x, "dmg", null)
      
      @scala.inline
      def setDmgUndefined: Self = StObject.set(x, "dmg", js.undefined)
      
      @scala.inline
      def setElectronCompile(value: Boolean): Self = StObject.set(x, "electronCompile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronCompileUndefined: Self = StObject.set(x, "electronCompile", js.undefined)
      
      @scala.inline
      def setElectronDist(value: String): Self = StObject.set(x, "electronDist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronDistUndefined: Self = StObject.set(x, "electronDist", js.undefined)
      
      @scala.inline
      def setElectronDownload(value: ElectronDownloadOptions): Self = StObject.set(x, "electronDownload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronDownloadUndefined: Self = StObject.set(x, "electronDownload", js.undefined)
      
      @scala.inline
      def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronVersionNull: Self = StObject.set(x, "electronVersion", null)
      
      @scala.inline
      def setElectronVersionUndefined: Self = StObject.set(x, "electronVersion", js.undefined)
      
      @scala.inline
      def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtraMetadata(value: js.Any): Self = StObject.set(x, "extraMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraMetadataUndefined: Self = StObject.set(x, "extraMetadata", js.undefined)
      
      @scala.inline
      def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameworkNull: Self = StObject.set(x, "framework", null)
      
      @scala.inline
      def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      @scala.inline
      def setFreebsd(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "freebsd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreebsdNull: Self = StObject.set(x, "freebsd", null)
      
      @scala.inline
      def setFreebsdUndefined: Self = StObject.set(x, "freebsd", js.undefined)
      
      @scala.inline
      def setIncludePdb(value: Boolean): Self = StObject.set(x, "includePdb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePdbUndefined: Self = StObject.set(x, "includePdb", js.undefined)
      
      @scala.inline
      def setLaunchUiVersion(value: Boolean | String): Self = StObject.set(x, "launchUiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchUiVersionNull: Self = StObject.set(x, "launchUiVersion", null)
      
      @scala.inline
      def setLaunchUiVersionUndefined: Self = StObject.set(x, "launchUiVersion", js.undefined)
      
      @scala.inline
      def setLinux(value: LinuxConfiguration): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinuxNull: Self = StObject.set(x, "linux", null)
      
      @scala.inline
      def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      @scala.inline
      def setMac(value: MacConfiguration): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacNull: Self = StObject.set(x, "mac", null)
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      @scala.inline
      def setMas(value: MasConfiguration): Self = StObject.set(x, "mas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasDev(value: MasConfiguration): Self = StObject.set(x, "masDev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasDevNull: Self = StObject.set(x, "masDev", null)
      
      @scala.inline
      def setMasDevUndefined: Self = StObject.set(x, "masDev", js.undefined)
      
      @scala.inline
      def setMasNull: Self = StObject.set(x, "mas", null)
      
      @scala.inline
      def setMasUndefined: Self = StObject.set(x, "mas", js.undefined)
      
      @scala.inline
      def setMsi(value: MsiOptions): Self = StObject.set(x, "msi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsiNull: Self = StObject.set(x, "msi", null)
      
      @scala.inline
      def setMsiUndefined: Self = StObject.set(x, "msi", js.undefined)
      
      @scala.inline
      def setNodeGypRebuild(value: Boolean): Self = StObject.set(x, "nodeGypRebuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeGypRebuildUndefined: Self = StObject.set(x, "nodeGypRebuild", js.undefined)
      
      @scala.inline
      def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeVersionNull: Self = StObject.set(x, "nodeVersion", null)
      
      @scala.inline
      def setNodeVersionUndefined: Self = StObject.set(x, "nodeVersion", js.undefined)
      
      @scala.inline
      def setNpmArgs(value: js.Array[String] | String): Self = StObject.set(x, "npmArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmArgsNull: Self = StObject.set(x, "npmArgs", null)
      
      @scala.inline
      def setNpmArgsUndefined: Self = StObject.set(x, "npmArgs", js.undefined)
      
      @scala.inline
      def setNpmArgsVarargs(value: String*): Self = StObject.set(x, "npmArgs", js.Array(value :_*))
      
      @scala.inline
      def setNpmRebuild(value: Boolean): Self = StObject.set(x, "npmRebuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmRebuildUndefined: Self = StObject.set(x, "npmRebuild", js.undefined)
      
      @scala.inline
      def setNsis(value: NsisOptions): Self = StObject.set(x, "nsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsisNull: Self = StObject.set(x, "nsis", null)
      
      @scala.inline
      def setNsisUndefined: Self = StObject.set(x, "nsis", js.undefined)
      
      @scala.inline
      def setNsisWeb(value: NsisWebOptions): Self = StObject.set(x, "nsisWeb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNsisWebNull: Self = StObject.set(x, "nsisWeb", null)
      
      @scala.inline
      def setNsisWebUndefined: Self = StObject.set(x, "nsisWeb", js.undefined)
      
      @scala.inline
      def setOnNodeModuleFile(value: (js.Function1[/* file */ String, Unit]) | String): Self = StObject.set(x, "onNodeModuleFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNodeModuleFileFunction1(value: /* file */ String => Unit): Self = StObject.set(x, "onNodeModuleFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeModuleFileNull: Self = StObject.set(x, "onNodeModuleFile", null)
      
      @scala.inline
      def setOnNodeModuleFileUndefined: Self = StObject.set(x, "onNodeModuleFile", js.undefined)
      
      @scala.inline
      def setP5p(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "p5p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP5pNull: Self = StObject.set(x, "p5p", null)
      
      @scala.inline
      def setP5pUndefined: Self = StObject.set(x, "p5p", js.undefined)
      
      @scala.inline
      def setPacman(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "pacman", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacmanNull: Self = StObject.set(x, "pacman", null)
      
      @scala.inline
      def setPacmanUndefined: Self = StObject.set(x, "pacman", js.undefined)
      
      @scala.inline
      def setPkg(value: PkgOptions): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgNull: Self = StObject.set(x, "pkg", null)
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setPortable(value: PortableOptions): Self = StObject.set(x, "portable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortableNull: Self = StObject.set(x, "portable", null)
      
      @scala.inline
      def setPortableUndefined: Self = StObject.set(x, "portable", js.undefined)
      
      @scala.inline
      def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductNameNull: Self = StObject.set(x, "productName", null)
      
      @scala.inline
      def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      @scala.inline
      def setRemoteBuild(value: Boolean): Self = StObject.set(x, "remoteBuild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteBuildUndefined: Self = StObject.set(x, "remoteBuild", js.undefined)
      
      @scala.inline
      def setRemovePackageScripts(value: Boolean): Self = StObject.set(x, "removePackageScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovePackageScriptsUndefined: Self = StObject.set(x, "removePackageScripts", js.undefined)
      
      @scala.inline
      def setRpm(value: LinuxTargetSpecificOptions): Self = StObject.set(x, "rpm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpmNull: Self = StObject.set(x, "rpm", null)
      
      @scala.inline
      def setRpmUndefined: Self = StObject.set(x, "rpm", js.undefined)
      
      @scala.inline
      def setSnap(value: SnapOptions): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapNull: Self = StObject.set(x, "snap", null)
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setSquirrelWindows(value: SquirrelWindowsOptions): Self = StObject.set(x, "squirrelWindows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquirrelWindowsNull: Self = StObject.set(x, "squirrelWindows", null)
      
      @scala.inline
      def setSquirrelWindowsUndefined: Self = StObject.set(x, "squirrelWindows", js.undefined)
      
      @scala.inline
      def setWin(value: WindowsConfiguration): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWinNull: Self = StObject.set(x, "win", null)
      
      @scala.inline
      def setWinUndefined: Self = StObject.set(x, "win", js.undefined)
    }
  }
  
  @js.native
  trait MetadataDirectories extends StObject {
    
    /**
      * The application directory (containing the application package.json), defaults to `app`, `www` or working directory.
      */
    val app: js.UndefOr[String | Null] = js.native
    
    /**
      * The path to build resources.
      *
      * Please note — build resources are not packed into the app. If you need to use some files, e.g. as tray icon, please include required files explicitly: `"files": ["**\/ *", "build/icon.*"]`
      * @default build
      */
    val buildResources: js.UndefOr[String | Null] = js.native
    
    /**
      * The output directory. [File macros](/file-patterns#file-macros) are supported.
      * @default dist
      */
    val output: js.UndefOr[String | Null] = js.native
  }
  object MetadataDirectories {
    
    @scala.inline
    def apply(): MetadataDirectories = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetadataDirectories]
    }
    
    @scala.inline
    implicit class MetadataDirectoriesMutableBuilder[Self <: MetadataDirectories] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppNull: Self = StObject.set(x, "app", null)
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setBuildResources(value: String): Self = StObject.set(x, "buildResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildResourcesNull: Self = StObject.set(x, "buildResources", null)
      
      @scala.inline
      def setBuildResourcesUndefined: Self = StObject.set(x, "buildResources", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputNull: Self = StObject.set(x, "output", null)
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
}
