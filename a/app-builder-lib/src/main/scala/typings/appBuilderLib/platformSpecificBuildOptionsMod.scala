package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.Editor
import typings.appBuilderLib.appBuilderLibStrings.None
import typings.appBuilderLib.appBuilderLibStrings.Shell
import typings.appBuilderLib.appBuilderLibStrings.Viewer
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.integrityMod.AsarIntegrityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformSpecificBuildOptionsMod {
  
  @js.native
  trait AsarOptions extends AsarIntegrityOptions {
    
    var ordering: js.UndefOr[String | Null] = js.native
    
    /**
      * Whether to automatically unpack executables files.
      * @default true
      */
    var smartUnpack: js.UndefOr[Boolean] = js.native
  }
  object AsarOptions {
    
    @scala.inline
    def apply(): AsarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsarOptions]
    }
    
    @scala.inline
    implicit class AsarOptionsMutableBuilder[Self <: AsarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderingNull: Self = StObject.set(x, "ordering", null)
      
      @scala.inline
      def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      @scala.inline
      def setSmartUnpack(value: Boolean): Self = StObject.set(x, "smartUnpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartUnpackUndefined: Self = StObject.set(x, "smartUnpack", js.undefined)
    }
  }
  
  @js.native
  trait FileSet extends StObject {
    
    /**
      * The [glob patterns](/file-patterns).
      */
    var filter: js.UndefOr[js.Array[String] | String] = js.native
    
    /**
      * The source path relative to the project directory.
      */
    var from: js.UndefOr[String] = js.native
    
    /**
      * The destination path relative to the app's content directory for `extraFiles` and the app's resource directory for `extraResources`.
      */
    var to: js.UndefOr[String] = js.native
  }
  object FileSet {
    
    @scala.inline
    def apply(): FileSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSet]
    }
    
    @scala.inline
    implicit class FileSetMutableBuilder[Self <: FileSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Array[String] | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
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
    implicit class PlatformSpecificBuildOptionsMutableBuilder[Self <: PlatformSpecificBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIdNull: Self = StObject.set(x, "appId", null)
      
      @scala.inline
      def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      @scala.inline
      def setAsar(value: AsarOptions | Boolean): Self = StObject.set(x, "asar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsarNull: Self = StObject.set(x, "asar", null)
      
      @scala.inline
      def setAsarUndefined: Self = StObject.set(x, "asar", js.undefined)
      
      @scala.inline
      def setAsarUnpack(value: js.Array[String] | String): Self = StObject.set(x, "asarUnpack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsarUnpackNull: Self = StObject.set(x, "asarUnpack", null)
      
      @scala.inline
      def setAsarUnpackUndefined: Self = StObject.set(x, "asarUnpack", js.undefined)
      
      @scala.inline
      def setAsarUnpackVarargs(value: String*): Self = StObject.set(x, "asarUnpack", js.Array(value :_*))
      
      @scala.inline
      def setCompression(value: CompressionLevel): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setCscKeyPassword(value: String): Self = StObject.set(x, "cscKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscKeyPasswordNull: Self = StObject.set(x, "cscKeyPassword", null)
      
      @scala.inline
      def setCscKeyPasswordUndefined: Self = StObject.set(x, "cscKeyPassword", js.undefined)
      
      @scala.inline
      def setCscLink(value: String): Self = StObject.set(x, "cscLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscLinkNull: Self = StObject.set(x, "cscLink", null)
      
      @scala.inline
      def setCscLinkUndefined: Self = StObject.set(x, "cscLink", js.undefined)
      
      @scala.inline
      def setDetectUpdateChannel(value: Boolean): Self = StObject.set(x, "detectUpdateChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectUpdateChannelUndefined: Self = StObject.set(x, "detectUpdateChannel", js.undefined)
      
      @scala.inline
      def setElectronUpdaterCompatibility(value: String): Self = StObject.set(x, "electronUpdaterCompatibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronUpdaterCompatibilityNull: Self = StObject.set(x, "electronUpdaterCompatibility", null)
      
      @scala.inline
      def setElectronUpdaterCompatibilityUndefined: Self = StObject.set(x, "electronUpdaterCompatibility", js.undefined)
      
      @scala.inline
      def setExtraFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "extraFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraFilesNull: Self = StObject.set(x, "extraFiles", null)
      
      @scala.inline
      def setExtraFilesUndefined: Self = StObject.set(x, "extraFiles", js.undefined)
      
      @scala.inline
      def setExtraFilesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "extraFiles", js.Array(value :_*))
      
      @scala.inline
      def setExtraResources(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "extraResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraResourcesNull: Self = StObject.set(x, "extraResources", null)
      
      @scala.inline
      def setExtraResourcesUndefined: Self = StObject.set(x, "extraResources", js.undefined)
      
      @scala.inline
      def setExtraResourcesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "extraResources", js.Array(value :_*))
      
      @scala.inline
      def setFileAssociations(value: js.Array[FileAssociation] | FileAssociation): Self = StObject.set(x, "fileAssociations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileAssociationsUndefined: Self = StObject.set(x, "fileAssociations", js.undefined)
      
      @scala.inline
      def setFileAssociationsVarargs(value: FileAssociation*): Self = StObject.set(x, "fileAssociations", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesNull: Self = StObject.set(x, "files", null)
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setForceCodeSigning(value: Boolean): Self = StObject.set(x, "forceCodeSigning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceCodeSigningUndefined: Self = StObject.set(x, "forceCodeSigning", js.undefined)
      
      @scala.inline
      def setGenerateUpdatesFilesForAllChannels(value: Boolean): Self = StObject.set(x, "generateUpdatesFilesForAllChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerateUpdatesFilesForAllChannelsUndefined: Self = StObject.set(x, "generateUpdatesFilesForAllChannels", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol] | Protocol): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setReleaseInfo(value: ReleaseInfo): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseInfoUndefined: Self = StObject.set(x, "releaseInfo", js.undefined)
      
      @scala.inline
      def setTarget(value: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Protocol extends StObject {
    
    /**
      * The name. e.g. `IRC server URL`.
      */
    val name: String = js.native
    
    /**
      * *macOS-only* The app’s role with respect to the type.
      * @default Editor
      */
    val role: js.UndefOr[Editor | Viewer | Shell | None] = js.native
    
    /**
      * The schemes. e.g. `["irc", "ircs"]`.
      */
    val schemes: js.Array[String] = js.native
  }
  object Protocol {
    
    @scala.inline
    def apply(name: String, schemes: js.Array[String]): Protocol = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: Editor | Viewer | Shell | None): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReleaseInfo extends StObject {
    
    /**
      * The release date.
      */
    var releaseDate: js.UndefOr[String] = js.native
    
    /**
      * The release name.
      */
    var releaseName: js.UndefOr[String | Null] = js.native
    
    /**
      * The release notes.
      */
    var releaseNotes: js.UndefOr[String | Null] = js.native
    
    /**
      * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
      */
    var releaseNotesFile: js.UndefOr[String | Null] = js.native
  }
  object ReleaseInfo {
    
    @scala.inline
    def apply(): ReleaseInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReleaseInfo]
    }
    
    @scala.inline
    implicit class ReleaseInfoMutableBuilder[Self <: ReleaseInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      @scala.inline
      def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNameNull: Self = StObject.set(x, "releaseName", null)
      
      @scala.inline
      def setReleaseNameUndefined: Self = StObject.set(x, "releaseName", js.undefined)
      
      @scala.inline
      def setReleaseNotes(value: String): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNotesFile(value: String): Self = StObject.set(x, "releaseNotesFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseNotesFileNull: Self = StObject.set(x, "releaseNotesFile", null)
      
      @scala.inline
      def setReleaseNotesFileUndefined: Self = StObject.set(x, "releaseNotesFile", js.undefined)
      
      @scala.inline
      def setReleaseNotesNull: Self = StObject.set(x, "releaseNotes", null)
      
      @scala.inline
      def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    }
  }
}
