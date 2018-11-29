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
      stdLib.Promise[js.Array[java.lang.String]] | js.Array[java.lang.String]
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
       * The function (or path to file or module id) to be [run after pack](#afterpack) (but before pack into distributable format and sign).
       */
  val afterPack: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, stdLib.Promise[_] | _]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
       * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
       */
  val afterSign: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, stdLib.Promise[_] | _]) | java.lang.String | scala.Null
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
      stdLib.Promise[_] | _
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  /**
       * The function (or path to file or module id) to be run on artifact build start.
       */
  val artifactBuildStarted: js.UndefOr[
    (js.Function1[
      /* context */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactBuildStarted, 
      stdLib.Promise[_] | _
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
      stdLib.Promise[_]
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

