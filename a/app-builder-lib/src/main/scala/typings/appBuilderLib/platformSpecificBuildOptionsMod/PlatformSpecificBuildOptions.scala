package typings.appBuilderLib.platformSpecificBuildOptionsMod

import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformSpecificBuildOptions extends TargetSpecificOptions {
  /**
    * The application id. Used as [CFBundleIdentifier](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102070) for MacOS and as
    * [Application User Model ID](https://msdn.microsoft.com/en-us/library/windows/desktop/dd378459(v=vs.85).aspx) for Windows (NSIS target only, Squirrel.Windows not supported). It is strongly recommended that an explicit ID is set.
    * @default com.electron.${name}
    */
  val appId: js.UndefOr[String | Null] = js.native
  /**
    * Whether to package the application's source code into an archive, using [Electron's archive format](http://electron.atom.io/docs/tutorial/application-packaging/).
    *
    * Node modules, that must be unpacked, will be detected automatically, you don't need to explicitly set [asarUnpack](#configuration-asarUnpack) - please file an issue if this doesn't work.
    * @default true
    */
  val asar: js.UndefOr[AsarOptions | Boolean | Null] = js.native
  /**
    * A [glob patterns](/file-patterns) relative to the [app directory](#MetadataDirectories-app), which specifies which files to unpack when creating the [asar](http://electron.atom.io/docs/tutorial/application-packaging/) archive.
    */
  val asarUnpack: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * The compression level. If you want to rapidly test build, `store` can reduce build time significantly. `maximum` doesn't lead to noticeable size difference, but increase build time.
    * @default normal
    */
  val compression: js.UndefOr[CompressionLevel | Null] = js.native
  /** @private */
  var cscKeyPassword: js.UndefOr[String | Null] = js.native
  /** @private */
  var cscLink: js.UndefOr[String | Null] = js.native
  /**
    * Whether to infer update channel from application version pre-release components. e.g. if version `0.12.1-alpha.1`, channel will be set to `alpha`. Otherwise to `latest`.
    * @default true
    */
  val detectUpdateChannel: js.UndefOr[Boolean] = js.native
  /**
    * The [electron-updater compatibility](/auto-update#compatibility) semver range.
    */
  val electronUpdaterCompatibility: js.UndefOr[String | Null] = js.native
  var extraFiles: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  var extraResources: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  /**
    * The file associations.
    */
  val fileAssociations: js.UndefOr[js.Array[FileAssociation] | FileAssociation] = js.native
  var files: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  /**
    * Whether to fail if app will be not code signed.
    */
  val forceCodeSigning: js.UndefOr[Boolean] = js.native
  /**
    * Please see [Building and Releasing using Channels](https://github.com/electron-userland/electron-builder/issues/1182#issuecomment-324947139).
    * @default false
    */
  val generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.native
  /** @private */
  val icon: js.UndefOr[String | Null] = js.native
  /**
    * The URL protocol schemes.
    */
  val protocols: js.UndefOr[js.Array[Protocol] | Protocol] = js.native
  /**
    * The release info. Intended for command line usage:
    *
    * ```
    * -c.releaseInfo.releaseNotes="new features"
    * ```
    */
  val releaseInfo: js.UndefOr[ReleaseInfo] = js.native
  val target: js.UndefOr[(js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null] = js.native
}

object PlatformSpecificBuildOptions {
  @scala.inline
  def apply(): PlatformSpecificBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSpecificBuildOptions]
  }
  @scala.inline
  implicit class PlatformSpecificBuildOptionsOps[Self <: PlatformSpecificBuildOptions] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    @scala.inline
    def setAsar(value: AsarOptions | Boolean): Self = this.set("asar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsar: Self = this.set("asar", js.undefined)
    @scala.inline
    def setAsarNull: Self = this.set("asar", null)
    @scala.inline
    def setAsarUnpackVarargs(value: String*): Self = this.set("asarUnpack", js.Array(value :_*))
    @scala.inline
    def setAsarUnpack(value: js.Array[String] | String): Self = this.set("asarUnpack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsarUnpack: Self = this.set("asarUnpack", js.undefined)
    @scala.inline
    def setAsarUnpackNull: Self = this.set("asarUnpack", null)
    @scala.inline
    def setCompression(value: CompressionLevel): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCompressionNull: Self = this.set("compression", null)
    @scala.inline
    def setCscKeyPassword(value: String): Self = this.set("cscKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscKeyPassword: Self = this.set("cscKeyPassword", js.undefined)
    @scala.inline
    def setCscKeyPasswordNull: Self = this.set("cscKeyPassword", null)
    @scala.inline
    def setCscLink(value: String): Self = this.set("cscLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscLink: Self = this.set("cscLink", js.undefined)
    @scala.inline
    def setCscLinkNull: Self = this.set("cscLink", null)
    @scala.inline
    def setDetectUpdateChannel(value: Boolean): Self = this.set("detectUpdateChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectUpdateChannel: Self = this.set("detectUpdateChannel", js.undefined)
    @scala.inline
    def setElectronUpdaterCompatibility(value: String): Self = this.set("electronUpdaterCompatibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronUpdaterCompatibility: Self = this.set("electronUpdaterCompatibility", js.undefined)
    @scala.inline
    def setElectronUpdaterCompatibilityNull: Self = this.set("electronUpdaterCompatibility", null)
    @scala.inline
    def setExtraFilesVarargs(value: (FileSet | String)*): Self = this.set("extraFiles", js.Array(value :_*))
    @scala.inline
    def setExtraFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = this.set("extraFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraFiles: Self = this.set("extraFiles", js.undefined)
    @scala.inline
    def setExtraFilesNull: Self = this.set("extraFiles", null)
    @scala.inline
    def setExtraResourcesVarargs(value: (FileSet | String)*): Self = this.set("extraResources", js.Array(value :_*))
    @scala.inline
    def setExtraResources(value: (js.Array[FileSet | String]) | FileSet | String): Self = this.set("extraResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraResources: Self = this.set("extraResources", js.undefined)
    @scala.inline
    def setExtraResourcesNull: Self = this.set("extraResources", null)
    @scala.inline
    def setFileAssociationsVarargs(value: FileAssociation*): Self = this.set("fileAssociations", js.Array(value :_*))
    @scala.inline
    def setFileAssociations(value: js.Array[FileAssociation] | FileAssociation): Self = this.set("fileAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileAssociations: Self = this.set("fileAssociations", js.undefined)
    @scala.inline
    def setFilesVarargs(value: (FileSet | String)*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFilesNull: Self = this.set("files", null)
    @scala.inline
    def setForceCodeSigning(value: Boolean): Self = this.set("forceCodeSigning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceCodeSigning: Self = this.set("forceCodeSigning", js.undefined)
    @scala.inline
    def setGenerateUpdatesFilesForAllChannels(value: Boolean): Self = this.set("generateUpdatesFilesForAllChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateUpdatesFilesForAllChannels: Self = this.set("generateUpdatesFilesForAllChannels", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[Protocol] | Protocol): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setReleaseInfo(value: ReleaseInfo): Self = this.set("releaseInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseInfo: Self = this.set("releaseInfo", js.undefined)
    @scala.inline
    def setTargetVarargs(value: (String | TargetConfiguration)*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
  
}

