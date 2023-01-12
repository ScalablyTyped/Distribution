package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliBooleans.`false`
import typings.angularCompilerCli.angularCompilerCliBooleans.`true`
import typings.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typings.angularCompilerCli.ngccSrcWritingFileWriterMod.FileWriter
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.std.Omit
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcNgccOptionsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/ngcc_options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearTsConfigCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTsConfigCache")().asInstanceOf[Unit]
  
  inline def getMaxNumberOfWorkers(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxNumberOfWorkers")().asInstanceOf[Double]
  
  inline def getSharedSetup(options: NgccOptions): SharedSetup & RequiredNgccOptions & OptionalNgccOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getSharedSetup")(options.asInstanceOf[js.Any]).asInstanceOf[SharedSetup & RequiredNgccOptions & OptionalNgccOptions]
  
  /* Inlined std.Omit<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions, 'async'> & {  async :true} */
  trait AsyncNgccOptions
    extends StObject
       with NgccOptions {
    
    var async: `true`
    
    var basePath: String
    
    var compileAllFormats: js.UndefOr[Boolean] = js.undefined
    
    var createNewEntryPointFormats: js.UndefOr[Boolean] = js.undefined
    
    var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.undefined
    
    var errorOnFailedEntryPoint: js.UndefOr[Boolean] = js.undefined
    
    var fileSystem: js.UndefOr[FileSystem] = js.undefined
    
    var findEntryPointsFromTsConfigProgram: js.UndefOr[Boolean] = js.undefined
    
    var invalidateEntryPointManifest: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    var pathMappings: js.UndefOr[PathMappings] = js.undefined
    
    var propertiesToConsider: js.UndefOr[js.Array[String]] = js.undefined
    
    var targetEntryPointPath: js.UndefOr[String] = js.undefined
    
    var tsConfigPath: js.UndefOr[String | Null] = js.undefined
    
    var typingsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncNgccOptions {
    
    inline def apply(basePath: String): AsyncNgccOptions = {
      val __obj = js.Dynamic.literal(async = true, basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncNgccOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncNgccOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setCompileAllFormats(value: Boolean): Self = StObject.set(x, "compileAllFormats", value.asInstanceOf[js.Any])
      
      inline def setCompileAllFormatsUndefined: Self = StObject.set(x, "compileAllFormats", js.undefined)
      
      inline def setCreateNewEntryPointFormats(value: Boolean): Self = StObject.set(x, "createNewEntryPointFormats", value.asInstanceOf[js.Any])
      
      inline def setCreateNewEntryPointFormatsUndefined: Self = StObject.set(x, "createNewEntryPointFormats", js.undefined)
      
      inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      inline def setEnableI18nLegacyMessageIdFormatUndefined: Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", js.undefined)
      
      inline def setErrorOnFailedEntryPoint(value: Boolean): Self = StObject.set(x, "errorOnFailedEntryPoint", value.asInstanceOf[js.Any])
      
      inline def setErrorOnFailedEntryPointUndefined: Self = StObject.set(x, "errorOnFailedEntryPoint", js.undefined)
      
      inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
      
      inline def setFindEntryPointsFromTsConfigProgram(value: Boolean): Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", value.asInstanceOf[js.Any])
      
      inline def setFindEntryPointsFromTsConfigProgramUndefined: Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", js.undefined)
      
      inline def setInvalidateEntryPointManifest(value: Boolean): Self = StObject.set(x, "invalidateEntryPointManifest", value.asInstanceOf[js.Any])
      
      inline def setInvalidateEntryPointManifestUndefined: Self = StObject.set(x, "invalidateEntryPointManifest", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPathMappings(value: PathMappings): Self = StObject.set(x, "pathMappings", value.asInstanceOf[js.Any])
      
      inline def setPathMappingsUndefined: Self = StObject.set(x, "pathMappings", js.undefined)
      
      inline def setPropertiesToConsider(value: js.Array[String]): Self = StObject.set(x, "propertiesToConsider", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToConsiderUndefined: Self = StObject.set(x, "propertiesToConsider", js.undefined)
      
      inline def setPropertiesToConsiderVarargs(value: String*): Self = StObject.set(x, "propertiesToConsider", js.Array(value*))
      
      inline def setTargetEntryPointPath(value: String): Self = StObject.set(x, "targetEntryPointPath", value.asInstanceOf[js.Any])
      
      inline def setTargetEntryPointPathUndefined: Self = StObject.set(x, "targetEntryPointPath", js.undefined)
      
      inline def setTsConfigPath(value: String): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsConfigPathNull: Self = StObject.set(x, "tsConfigPath", null)
      
      inline def setTsConfigPathUndefined: Self = StObject.set(x, "tsConfigPath", js.undefined)
      
      inline def setTypingsOnly(value: Boolean): Self = StObject.set(x, "typingsOnly", value.asInstanceOf[js.Any])
      
      inline def setTypingsOnlyUndefined: Self = StObject.set(x, "typingsOnly", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions
    - typings.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions
  */
  trait NgccOptions extends StObject
  object NgccOptions {
    
    inline def AsyncNgccOptions(basePath: String): typings.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions = {
      val __obj = js.Dynamic.literal(async = true, basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions]
    }
    
    inline def SyncNgccOptions(basePath: String): typings.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.targetEntryPointPath
    - typings.angularCompilerCli.angularCompilerCliStrings.tsConfigPath
    - typings.angularCompilerCli.angularCompilerCliStrings.pathMappings
    - typings.angularCompilerCli.angularCompilerCliStrings.findEntryPointsFromTsConfigProgram
  */
  trait OptionalNgccOptionKeys extends StObject
  object OptionalNgccOptionKeys {
    
    inline def findEntryPointsFromTsConfigProgram: typings.angularCompilerCli.angularCompilerCliStrings.findEntryPointsFromTsConfigProgram = "findEntryPointsFromTsConfigProgram".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.findEntryPointsFromTsConfigProgram]
    
    inline def pathMappings: typings.angularCompilerCli.angularCompilerCliStrings.pathMappings = "pathMappings".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.pathMappings]
    
    inline def targetEntryPointPath: typings.angularCompilerCli.angularCompilerCliStrings.targetEntryPointPath = "targetEntryPointPath".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.targetEntryPointPath]
    
    inline def tsConfigPath: typings.angularCompilerCli.angularCompilerCliStrings.tsConfigPath = "tsConfigPath".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.tsConfigPath]
  }
  
  /* Inlined std.Pick<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.NgccOptions, @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.OptionalNgccOptionKeys> */
  trait OptionalNgccOptions extends StObject {
    
    var findEntryPointsFromTsConfigProgram: js.UndefOr[Any] = js.undefined
    
    var pathMappings: js.UndefOr[Any] = js.undefined
    
    var targetEntryPointPath: js.UndefOr[Any] = js.undefined
    
    var tsConfigPath: js.UndefOr[Any] = js.undefined
  }
  object OptionalNgccOptions {
    
    inline def apply(): OptionalNgccOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalNgccOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionalNgccOptions] (val x: Self) extends AnyVal {
      
      inline def setFindEntryPointsFromTsConfigProgram(value: Any): Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", value.asInstanceOf[js.Any])
      
      inline def setFindEntryPointsFromTsConfigProgramUndefined: Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", js.undefined)
      
      inline def setPathMappings(value: Any): Self = StObject.set(x, "pathMappings", value.asInstanceOf[js.Any])
      
      inline def setPathMappingsUndefined: Self = StObject.set(x, "pathMappings", js.undefined)
      
      inline def setTargetEntryPointPath(value: Any): Self = StObject.set(x, "targetEntryPointPath", value.asInstanceOf[js.Any])
      
      inline def setTargetEntryPointPathUndefined: Self = StObject.set(x, "targetEntryPointPath", js.undefined)
      
      inline def setTsConfigPath(value: Any): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsConfigPathUndefined: Self = StObject.set(x, "tsConfigPath", js.undefined)
    }
  }
  
  type RequiredNgccOptions = Required[Omit[NgccOptions, OptionalNgccOptionKeys]]
  
  trait SharedSetup extends StObject {
    
    var absBasePath: AbsoluteFsPath
    
    var fileSystem: FileSystem
    
    def getFileWriter(pkgJsonUpdater: PackageJsonUpdater): FileWriter
    
    var projectPath: AbsoluteFsPath
    
    var tsConfig: ParsedConfiguration | Null
  }
  object SharedSetup {
    
    inline def apply(
      absBasePath: AbsoluteFsPath,
      fileSystem: FileSystem,
      getFileWriter: PackageJsonUpdater => FileWriter,
      projectPath: AbsoluteFsPath
    ): SharedSetup = {
      val __obj = js.Dynamic.literal(absBasePath = absBasePath.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], getFileWriter = js.Any.fromFunction1(getFileWriter), projectPath = projectPath.asInstanceOf[js.Any], tsConfig = null)
      __obj.asInstanceOf[SharedSetup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedSetup] (val x: Self) extends AnyVal {
      
      inline def setAbsBasePath(value: AbsoluteFsPath): Self = StObject.set(x, "absBasePath", value.asInstanceOf[js.Any])
      
      inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setGetFileWriter(value: PackageJsonUpdater => FileWriter): Self = StObject.set(x, "getFileWriter", js.Any.fromFunction1(value))
      
      inline def setProjectPath(value: AbsoluteFsPath): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
      
      inline def setTsConfig(value: ParsedConfiguration): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigNull: Self = StObject.set(x, "tsConfig", null)
    }
  }
  
  trait SyncNgccOptions
    extends StObject
       with NgccOptions {
    
    /**
      * Whether the compilation should run and return asynchronously. Allowing asynchronous execution
      * may speed up the compilation by utilizing multiple CPU cores (if available).
      *
      * Default: `false` (i.e. run synchronously)
      */
    var async: js.UndefOr[`false`] = js.undefined
    
    /** The absolute path to the `node_modules` folder that contains the packages to process. */
    var basePath: String
    
    /**
      * Whether to process all formats specified by (`propertiesToConsider`)  or to stop processing
      * this entry-point at the first matching format.
      *
      * Defaults to `true`, but is forced to `false` if `typingsOnly` is `true`.
      */
    var compileAllFormats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to create new entry-points bundles rather than overwriting the original files.
      */
    var createNewEntryPointFormats: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render `$localize` messages with legacy format ids.
      *
      * The default value is `true`. Only set this to `false` if you do not want legacy message ids to
      * be rendered. For example, if you are not using legacy message ids in your translation files
      * AND are not doing compile-time inlining of translations, in which case the extra message ids
      * would add unwanted size to the final source bundle.
      *
      * It is safe to leave this set to true if you are doing compile-time inlining because the extra
      * legacy message ids will all be stripped during translation.
      */
    var enableI18nLegacyMessageIdFormat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true in order to terminate immediately with an error code if an entry-point fails to be
      * processed.
      *
      * If `targetEntryPointPath` is provided then this property is always true and cannot be
      * changed. Otherwise the default is false.
      *
      * When set to false, ngcc will continue to process entry-points after a failure. In which case it
      * will log an error and resume processing other entry-points.
      */
    var errorOnFailedEntryPoint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a file-system service that will be used by ngcc for all file interactions.
      */
    var fileSystem: js.UndefOr[FileSystem] = js.undefined
    
    /**
      * Use the program defined in the loaded tsconfig.json (if available - see
      * `tsConfigPath` option) to identify the entry-points that should be processed.
      * If this is set to `true` then only the entry-points reachable from the given
      * program (and their dependencies) will be processed.
      */
    var findEntryPointsFromTsConfigProgram: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to invalidate any entry-point manifest file that is on disk. Instead, walk the
      * directory tree looking for entry-points, and then write a new entry-point manifest, if
      * possible.
      *
      * Default: `false` (i.e. the manifest will be used if available)
      */
    var invalidateEntryPointManifest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a logger that will be called with log messages.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Paths mapping configuration (`paths` and `baseUrl`), as found in `ts.CompilerOptions`.
      * These are used to resolve paths to locally built Angular libraries.
      *
      * Note that `pathMappings` specified here take precedence over any `pathMappings` loaded from a
      * TS config file.
      */
    var pathMappings: js.UndefOr[PathMappings] = js.undefined
    
    /**
      * Which entry-point properties in the package.json to consider when processing an entry-point.
      * Each property should hold a path to the particular bundle format for the entry-point.
      * Defaults to all the properties in the package.json.
      */
    var propertiesToConsider: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The path to the primary package to be processed. If not absolute then it must be relative to
      * `basePath`.
      *
      * All its dependencies will need to be processed too.
      *
      * If this property is provided then `errorOnFailedEntryPoint` is forced to true.
      */
    var targetEntryPointPath: js.UndefOr[String] = js.undefined
    
    /**
      * An absolute path to a TS config file (e.g. `tsconfig.json`) or a directory containing one, that
      * will be used to configure module resolution with things like path mappings, if not specified
      * explicitly via the `pathMappings` property to `mainNgcc`.
      *
      * If `undefined`, ngcc will attempt to load a `tsconfig.json` file from the directory above the
      * `basePath`.
      *
      * If `null`, ngcc will not attempt to load any TS config file at all.
      */
    var tsConfigPath: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to only process the typings files for this entry-point.
      *
      * This is useful when running ngcc only to provide typings files to downstream tooling such as
      * the Angular Language Service or ng-packagr. Defaults to `false`.
      *
      * If this is set to `true` then `compileAllFormats` is forced to `false`.
      */
    var typingsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object SyncNgccOptions {
    
    inline def apply(basePath: String): SyncNgccOptions = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncNgccOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncNgccOptions] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setCompileAllFormats(value: Boolean): Self = StObject.set(x, "compileAllFormats", value.asInstanceOf[js.Any])
      
      inline def setCompileAllFormatsUndefined: Self = StObject.set(x, "compileAllFormats", js.undefined)
      
      inline def setCreateNewEntryPointFormats(value: Boolean): Self = StObject.set(x, "createNewEntryPointFormats", value.asInstanceOf[js.Any])
      
      inline def setCreateNewEntryPointFormatsUndefined: Self = StObject.set(x, "createNewEntryPointFormats", js.undefined)
      
      inline def setEnableI18nLegacyMessageIdFormat(value: Boolean): Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", value.asInstanceOf[js.Any])
      
      inline def setEnableI18nLegacyMessageIdFormatUndefined: Self = StObject.set(x, "enableI18nLegacyMessageIdFormat", js.undefined)
      
      inline def setErrorOnFailedEntryPoint(value: Boolean): Self = StObject.set(x, "errorOnFailedEntryPoint", value.asInstanceOf[js.Any])
      
      inline def setErrorOnFailedEntryPointUndefined: Self = StObject.set(x, "errorOnFailedEntryPoint", js.undefined)
      
      inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setFileSystemUndefined: Self = StObject.set(x, "fileSystem", js.undefined)
      
      inline def setFindEntryPointsFromTsConfigProgram(value: Boolean): Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", value.asInstanceOf[js.Any])
      
      inline def setFindEntryPointsFromTsConfigProgramUndefined: Self = StObject.set(x, "findEntryPointsFromTsConfigProgram", js.undefined)
      
      inline def setInvalidateEntryPointManifest(value: Boolean): Self = StObject.set(x, "invalidateEntryPointManifest", value.asInstanceOf[js.Any])
      
      inline def setInvalidateEntryPointManifestUndefined: Self = StObject.set(x, "invalidateEntryPointManifest", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPathMappings(value: PathMappings): Self = StObject.set(x, "pathMappings", value.asInstanceOf[js.Any])
      
      inline def setPathMappingsUndefined: Self = StObject.set(x, "pathMappings", js.undefined)
      
      inline def setPropertiesToConsider(value: js.Array[String]): Self = StObject.set(x, "propertiesToConsider", value.asInstanceOf[js.Any])
      
      inline def setPropertiesToConsiderUndefined: Self = StObject.set(x, "propertiesToConsider", js.undefined)
      
      inline def setPropertiesToConsiderVarargs(value: String*): Self = StObject.set(x, "propertiesToConsider", js.Array(value*))
      
      inline def setTargetEntryPointPath(value: String): Self = StObject.set(x, "targetEntryPointPath", value.asInstanceOf[js.Any])
      
      inline def setTargetEntryPointPathUndefined: Self = StObject.set(x, "targetEntryPointPath", js.undefined)
      
      inline def setTsConfigPath(value: String): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsConfigPathNull: Self = StObject.set(x, "tsConfigPath", null)
      
      inline def setTsConfigPathUndefined: Self = StObject.set(x, "tsConfigPath", js.undefined)
      
      inline def setTypingsOnly(value: Boolean): Self = StObject.set(x, "typingsOnly", value.asInstanceOf[js.Any])
      
      inline def setTypingsOnlyUndefined: Self = StObject.set(x, "typingsOnly", js.undefined)
    }
  }
}
