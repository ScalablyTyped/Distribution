package typings.angularCompilerCli

import typings.angularCompilerCli.configurationMod.NgccConfiguration
import typings.angularCompilerCli.dependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.angularCompilerCli.srcTypesMod.PathSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointManifestMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point_manifest", "EntryPointManifest")
  @js.native
  open class EntryPointManifest protected () extends StObject {
    def this(fs: FileSystem, config: NgccConfiguration, logger: Logger) = this()
    
    /* private */ var computeLockFileHash: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getEntryPointManifestPath: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Try to get the entry-point info from a manifest file for the given `basePath` if it exists and
      * is not out of date.
      *
      * Reasons for the manifest to be out of date are:
      *
      * * the file does not exist
      * * the ngcc version has changed
      * * the package lock-file (i.e. yarn.lock or package-lock.json) has changed
      * * the project configuration has changed
      * * one or more entry-points in the manifest are not valid
      *
      * @param basePath The path that would contain the entry-points and the manifest file.
      * @returns an array of entry-point information for all entry-points found below the given
      * `basePath` or `null` if the manifest was out of date.
      */
    def readEntryPointsUsingManifest(basePath: AbsoluteFsPath): js.Array[EntryPointWithDependencies] | Null = js.native
    
    /**
      * Write a manifest file at the given `basePath`.
      *
      * The manifest includes the current ngcc version and hashes of the package lock-file and current
      * project config. These will be used to check whether the manifest file is out of date. See
      * `readEntryPointsUsingManifest()`.
      *
      * @param basePath The path where the manifest file is to be written.
      * @param entryPoints A collection of entry-points to record in the manifest.
      */
    def writeEntryPointManifest(basePath: AbsoluteFsPath, entryPoints: js.Array[EntryPointWithDependencies]): Unit = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point_manifest", "InvalidatingEntryPointManifest")
  @js.native
  open class InvalidatingEntryPointManifest protected () extends EntryPointManifest {
    def this(fs: FileSystem, config: NgccConfiguration, logger: Logger) = this()
  }
  
  trait EntryPointManifestFile extends StObject {
    
    var configFileHash: String
    
    var entryPointPaths: js.Array[EntryPointPaths]
    
    var lockFileHash: String
    
    var ngccVersion: String
  }
  object EntryPointManifestFile {
    
    inline def apply(
      configFileHash: String,
      entryPointPaths: js.Array[EntryPointPaths],
      lockFileHash: String,
      ngccVersion: String
    ): EntryPointManifestFile = {
      val __obj = js.Dynamic.literal(configFileHash = configFileHash.asInstanceOf[js.Any], entryPointPaths = entryPointPaths.asInstanceOf[js.Any], lockFileHash = lockFileHash.asInstanceOf[js.Any], ngccVersion = ngccVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPointManifestFile]
    }
    
    extension [Self <: EntryPointManifestFile](x: Self) {
      
      inline def setConfigFileHash(value: String): Self = StObject.set(x, "configFileHash", value.asInstanceOf[js.Any])
      
      inline def setEntryPointPaths(value: js.Array[EntryPointPaths]): Self = StObject.set(x, "entryPointPaths", value.asInstanceOf[js.Any])
      
      inline def setEntryPointPathsVarargs(value: EntryPointPaths*): Self = StObject.set(x, "entryPointPaths", js.Array(value*))
      
      inline def setLockFileHash(value: String): Self = StObject.set(x, "lockFileHash", value.asInstanceOf[js.Any])
      
      inline def setNgccVersion(value: String): Self = StObject.set(x, "ngccVersion", value.asInstanceOf[js.Any])
    }
  }
  
  type EntryPointPaths = js.Tuple5[
    String, 
    String, 
    js.UndefOr[js.Array[AbsoluteFsPath]], 
    js.UndefOr[js.Array[AbsoluteFsPath | PathSegment]], 
    js.UndefOr[js.Array[AbsoluteFsPath]]
  ]
  
  /* Inlined {[ Property in @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/entry_point.PackageJsonFormatProperties as '${Property}_ivy_ngcc' ]:? string} */
  trait NewEntryPointPropertiesMap extends StObject {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var es2015: js.UndefOr[String] = js.undefined
    
    var esm2015: js.UndefOr[String] = js.undefined
    
    var esm5: js.UndefOr[String] = js.undefined
    
    var fesm2015: js.UndefOr[String] = js.undefined
    
    var fesm5: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var types: js.UndefOr[String] = js.undefined
    
    @JSName("typings")
    var typings_ : js.UndefOr[String] = js.undefined
  }
  object NewEntryPointPropertiesMap {
    
    inline def apply(): NewEntryPointPropertiesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewEntryPointPropertiesMap]
    }
    
    extension [Self <: NewEntryPointPropertiesMap](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setEs2015(value: String): Self = StObject.set(x, "es2015", value.asInstanceOf[js.Any])
      
      inline def setEs2015Undefined: Self = StObject.set(x, "es2015", js.undefined)
      
      inline def setEsm2015(value: String): Self = StObject.set(x, "esm2015", value.asInstanceOf[js.Any])
      
      inline def setEsm2015Undefined: Self = StObject.set(x, "esm2015", js.undefined)
      
      inline def setEsm5(value: String): Self = StObject.set(x, "esm5", value.asInstanceOf[js.Any])
      
      inline def setEsm5Undefined: Self = StObject.set(x, "esm5", js.undefined)
      
      inline def setFesm2015(value: String): Self = StObject.set(x, "fesm2015", value.asInstanceOf[js.Any])
      
      inline def setFesm2015Undefined: Self = StObject.set(x, "fesm2015", js.undefined)
      
      inline def setFesm5(value: String): Self = StObject.set(x, "fesm5", value.asInstanceOf[js.Any])
      
      inline def setFesm5Undefined: Self = StObject.set(x, "fesm5", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypings_(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypings_Undefined: Self = StObject.set(x, "typings", js.undefined)
    }
  }
}
