package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.Editor
import typings.appBuilderLib.appBuilderLibStrings.None
import typings.appBuilderLib.appBuilderLibStrings.Shell
import typings.appBuilderLib.appBuilderLibStrings.Viewer
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformSpecificBuildOptionsMod {
  
  trait AsarOptions extends StObject {
    
    var ordering: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to automatically unpack executables files.
      * @default true
      */
    var smartUnpack: js.UndefOr[Boolean] = js.undefined
  }
  object AsarOptions {
    
    inline def apply(): AsarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsarOptions]
    }
    
    extension [Self <: AsarOptions](x: Self) {
      
      inline def setOrdering(value: String): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      inline def setOrderingNull: Self = StObject.set(x, "ordering", null)
      
      inline def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      inline def setSmartUnpack(value: Boolean): Self = StObject.set(x, "smartUnpack", value.asInstanceOf[js.Any])
      
      inline def setSmartUnpackUndefined: Self = StObject.set(x, "smartUnpack", js.undefined)
    }
  }
  
  trait FileSet extends StObject {
    
    /**
      * The [glob patterns](/file-patterns).
      */
    var filter: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * The source path relative to the project directory.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * The destination path relative to the app's content directory for `extraFiles` and the app's resource directory for `extraResources`.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object FileSet {
    
    inline def apply(): FileSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSet]
    }
    
    extension [Self <: FileSet](x: Self) {
      
      inline def setFilter(value: js.Array[String] | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait PlatformSpecificBuildOptions
    extends StObject
       with TargetSpecificOptions {
    
    /**
      * The application id. Used as [CFBundleIdentifier](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102070) for MacOS and as
      * [Application User Model ID](https://msdn.microsoft.com/en-us/library/windows/desktop/dd378459(v=vs.85).aspx) for Windows (NSIS target only, Squirrel.Windows not supported). It is strongly recommended that an explicit ID is set.
      * @default com.electron.${name}
      */
    val appId: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to package the application's source code into an archive, using [Electron's archive format](http://electron.atom.io/docs/tutorial/application-packaging/).
      *
      * Node modules, that must be unpacked, will be detected automatically, you don't need to explicitly set [asarUnpack](#configuration-asarUnpack) - please file an issue if this doesn't work.
      * @default true
      */
    val asar: js.UndefOr[AsarOptions | Boolean | Null] = js.undefined
    
    /**
      * A [glob patterns](/file-patterns) relative to the [app directory](#MetadataDirectories-app), which specifies which files to unpack when creating the [asar](http://electron.atom.io/docs/tutorial/application-packaging/) archive.
      */
    val asarUnpack: js.UndefOr[js.Array[String] | String | Null] = js.undefined
    
    /**
      * The compression level. If you want to rapidly test build, `store` can reduce build time significantly. `maximum` doesn't lead to noticeable size difference, but increase build time.
      * @default normal
      */
    val compression: js.UndefOr[CompressionLevel | Null] = js.undefined
    
    /** @private */
    var cscKeyPassword: js.UndefOr[String | Null] = js.undefined
    
    /** @private */
    var cscLink: js.UndefOr[String | Null] = js.undefined
    
    val defaultArch: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to infer update channel from application version pre-release components. e.g. if version `0.12.1-alpha.1`, channel will be set to `alpha`. Otherwise to `latest`.
      * @default true
      */
    val detectUpdateChannel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The [electron-updater compatibility](/auto-update#compatibility) semver range.
      */
    val electronUpdaterCompatibility: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The executable name. Defaults to `productName`.
      */
    val executableName: js.UndefOr[String | Null] = js.undefined
    
    var extraFiles: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
    
    var extraResources: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
    
    /**
      * The file associations.
      */
    val fileAssociations: js.UndefOr[js.Array[FileAssociation] | FileAssociation] = js.undefined
    
    var files: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.undefined
    
    /**
      * Whether to fail if app will be not code signed.
      */
    val forceCodeSigning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Please see [Building and Releasing using Channels](https://github.com/electron-userland/electron-builder/issues/1182#issuecomment-324947139).
      * @default false
      */
    val generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined
    
    /** @private */
    val icon: js.UndefOr[String | Null] = js.undefined
    
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
    
    val target: js.UndefOr[(js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null] = js.undefined
  }
  object PlatformSpecificBuildOptions {
    
    inline def apply(): PlatformSpecificBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformSpecificBuildOptions]
    }
    
    extension [Self <: PlatformSpecificBuildOptions](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdNull: Self = StObject.set(x, "appId", null)
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAsar(value: AsarOptions | Boolean): Self = StObject.set(x, "asar", value.asInstanceOf[js.Any])
      
      inline def setAsarNull: Self = StObject.set(x, "asar", null)
      
      inline def setAsarUndefined: Self = StObject.set(x, "asar", js.undefined)
      
      inline def setAsarUnpack(value: js.Array[String] | String): Self = StObject.set(x, "asarUnpack", value.asInstanceOf[js.Any])
      
      inline def setAsarUnpackNull: Self = StObject.set(x, "asarUnpack", null)
      
      inline def setAsarUnpackUndefined: Self = StObject.set(x, "asarUnpack", js.undefined)
      
      inline def setAsarUnpackVarargs(value: String*): Self = StObject.set(x, "asarUnpack", js.Array(value*))
      
      inline def setCompression(value: CompressionLevel): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCscKeyPassword(value: String): Self = StObject.set(x, "cscKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setCscKeyPasswordNull: Self = StObject.set(x, "cscKeyPassword", null)
      
      inline def setCscKeyPasswordUndefined: Self = StObject.set(x, "cscKeyPassword", js.undefined)
      
      inline def setCscLink(value: String): Self = StObject.set(x, "cscLink", value.asInstanceOf[js.Any])
      
      inline def setCscLinkNull: Self = StObject.set(x, "cscLink", null)
      
      inline def setCscLinkUndefined: Self = StObject.set(x, "cscLink", js.undefined)
      
      inline def setDefaultArch(value: String): Self = StObject.set(x, "defaultArch", value.asInstanceOf[js.Any])
      
      inline def setDefaultArchUndefined: Self = StObject.set(x, "defaultArch", js.undefined)
      
      inline def setDetectUpdateChannel(value: Boolean): Self = StObject.set(x, "detectUpdateChannel", value.asInstanceOf[js.Any])
      
      inline def setDetectUpdateChannelUndefined: Self = StObject.set(x, "detectUpdateChannel", js.undefined)
      
      inline def setElectronUpdaterCompatibility(value: String): Self = StObject.set(x, "electronUpdaterCompatibility", value.asInstanceOf[js.Any])
      
      inline def setElectronUpdaterCompatibilityNull: Self = StObject.set(x, "electronUpdaterCompatibility", null)
      
      inline def setElectronUpdaterCompatibilityUndefined: Self = StObject.set(x, "electronUpdaterCompatibility", js.undefined)
      
      inline def setExecutableName(value: String): Self = StObject.set(x, "executableName", value.asInstanceOf[js.Any])
      
      inline def setExecutableNameNull: Self = StObject.set(x, "executableName", null)
      
      inline def setExecutableNameUndefined: Self = StObject.set(x, "executableName", js.undefined)
      
      inline def setExtraFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "extraFiles", value.asInstanceOf[js.Any])
      
      inline def setExtraFilesNull: Self = StObject.set(x, "extraFiles", null)
      
      inline def setExtraFilesUndefined: Self = StObject.set(x, "extraFiles", js.undefined)
      
      inline def setExtraFilesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "extraFiles", js.Array(value*))
      
      inline def setExtraResources(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "extraResources", value.asInstanceOf[js.Any])
      
      inline def setExtraResourcesNull: Self = StObject.set(x, "extraResources", null)
      
      inline def setExtraResourcesUndefined: Self = StObject.set(x, "extraResources", js.undefined)
      
      inline def setExtraResourcesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "extraResources", js.Array(value*))
      
      inline def setFileAssociations(value: js.Array[FileAssociation] | FileAssociation): Self = StObject.set(x, "fileAssociations", value.asInstanceOf[js.Any])
      
      inline def setFileAssociationsUndefined: Self = StObject.set(x, "fileAssociations", js.undefined)
      
      inline def setFileAssociationsVarargs(value: FileAssociation*): Self = StObject.set(x, "fileAssociations", js.Array(value*))
      
      inline def setFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesNull: Self = StObject.set(x, "files", null)
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: (FileSet | String)*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setForceCodeSigning(value: Boolean): Self = StObject.set(x, "forceCodeSigning", value.asInstanceOf[js.Any])
      
      inline def setForceCodeSigningUndefined: Self = StObject.set(x, "forceCodeSigning", js.undefined)
      
      inline def setGenerateUpdatesFilesForAllChannels(value: Boolean): Self = StObject.set(x, "generateUpdatesFilesForAllChannels", value.asInstanceOf[js.Any])
      
      inline def setGenerateUpdatesFilesForAllChannelsUndefined: Self = StObject.set(x, "generateUpdatesFilesForAllChannels", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setProtocols(value: js.Array[Protocol] | Protocol): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setReleaseInfo(value: ReleaseInfo): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
      
      inline def setReleaseInfoUndefined: Self = StObject.set(x, "releaseInfo", js.undefined)
      
      inline def setTarget(value: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  trait Protocol extends StObject {
    
    /**
      * The name. e.g. `IRC server URL`.
      */
    val name: String
    
    /**
      * *macOS-only* The app’s role with respect to the type.
      * @default Editor
      */
    val role: js.UndefOr[Editor | Viewer | Shell | None] = js.undefined
    
    /**
      * The schemes. e.g. `["irc", "ircs"]`.
      */
    val schemes: js.Array[String]
  }
  object Protocol {
    
    inline def apply(name: String, schemes: js.Array[String]): Protocol = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    extension [Self <: Protocol](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRole(value: Editor | Viewer | Shell | None): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    }
  }
  
  trait ReleaseInfo extends StObject {
    
    /**
      * The release date.
      */
    var releaseDate: js.UndefOr[String] = js.undefined
    
    /**
      * The release name.
      */
    var releaseName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The release notes.
      */
    var releaseNotes: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The path to release notes file. Defaults to `release-notes-${platform}.md` (where `platform` it is current platform — `mac`, `linux` or `windows`) or `release-notes.md` in the [build resources](#MetadataDirectories-buildResources).
      */
    var releaseNotesFile: js.UndefOr[String | Null] = js.undefined
  }
  object ReleaseInfo {
    
    inline def apply(): ReleaseInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReleaseInfo]
    }
    
    extension [Self <: ReleaseInfo](x: Self) {
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
      
      inline def setReleaseNameNull: Self = StObject.set(x, "releaseName", null)
      
      inline def setReleaseNameUndefined: Self = StObject.set(x, "releaseName", js.undefined)
      
      inline def setReleaseNotes(value: String): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesFile(value: String): Self = StObject.set(x, "releaseNotesFile", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesFileNull: Self = StObject.set(x, "releaseNotesFile", null)
      
      inline def setReleaseNotesFileUndefined: Self = StObject.set(x, "releaseNotesFile", js.undefined)
      
      inline def setReleaseNotesNull: Self = StObject.set(x, "releaseNotes", null)
      
      inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    }
  }
}
