package typings
package appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlatformSpecificBuildOptions
  extends appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
       * The application id. Used as [CFBundleIdentifier](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102070) for MacOS and as
       * [Application User Model ID](https://msdn.microsoft.com/en-us/library/windows/desktop/dd378459(v=vs.85).aspx) for Windows (NSIS target only, Squirrel.Windows not supported). It is strongly recommended that an explicit ID is set.
       * @default com.electron.${name}
       */
  val appId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Whether to package the application's source code into an archive, using [Electron's archive format](http://electron.atom.io/docs/tutorial/application-packaging/).
       *
       * Node modules, that must be unpacked, will be detected automatically, you don't need to explicitly set [asarUnpack](#configuration-asarUnpack) - please file an issue if this doesn't work.
       * @default true
       */
  val asar: js.UndefOr[AsarOptions | scala.Boolean | scala.Null] = js.undefined
  /**
       * A [glob patterns](/file-patterns) relative to the [app directory](#MetadataDirectories-app), which specifies which files to unpack when creating the [asar](http://electron.atom.io/docs/tutorial/application-packaging/) archive.
       */
  val asarUnpack: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Null] = js.undefined
  /**
       * The compression level. If you want to rapidly test build, `store` can reduce build time significantly. `maximum` doesn't lead to noticeable size difference, but increase build time.
       * @default normal
       */
  val compression: js.UndefOr[appDashBuilderDashLibLib.outCoreMod.CompressionLevel | scala.Null] = js.undefined
  /** @private */
  var cscKeyPassword: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** @private */
  var cscLink: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Whether to infer update channel from application version pre-release components. e.g. if version `0.12.1-alpha.1`, channel will be set to `alpha`. Otherwise to `latest`.
       * @default true
       */
  val detectUpdateChannel: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The [electron-updater compatibility](/auto-update#compatibility) semver range.
       */
  val electronUpdaterCompatibility: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val extraFiles: js.UndefOr[(js.Array[FileSet | java.lang.String]) | FileSet | java.lang.String | scala.Null] = js.undefined
  val extraResources: js.UndefOr[(js.Array[FileSet | java.lang.String]) | FileSet | java.lang.String | scala.Null] = js.undefined
  /**
       * The file associations.
       */
  val fileAssociations: js.UndefOr[
    js.Array[appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation] | appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation
  ] = js.undefined
  val files: js.UndefOr[(js.Array[FileSet | java.lang.String]) | FileSet | java.lang.String | scala.Null] = js.undefined
  /**
       * Whether to fail if app will be not code signed.
       */
  val forceCodeSigning: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Please see [Building and Releasing using Channels](https://github.com/electron-userland/electron-builder/issues/1182#issuecomment-324947139).
       * @default false
       */
  val generateUpdatesFilesForAllChannels: js.UndefOr[scala.Boolean] = js.undefined
  /** @private */
  val icon: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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
  val target: js.UndefOr[
    (js.Array[java.lang.String | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration]) | java.lang.String | appDashBuilderDashLibLib.outCoreMod.TargetConfiguration | scala.Null
  ] = js.undefined
}

