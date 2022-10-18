package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompilerCli.anon.ProcessedNgccPackageConfi
import typings.angularCompilerCli.anon.RequiredProcessLockingCon
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.PackageJsonFormatPropertiesMap
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesConfigurationMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/configuration", "DEFAULT_NGCC_CONFIG")
  @js.native
  val DEFAULT_NGCC_CONFIG: NgccProjectConfig = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/configuration", "NgccConfiguration")
  @js.native
  open class NgccConfiguration protected () extends StObject {
    def this(fs: ReadonlyFileSystem, baseDir: AbsoluteFsPath) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var computeHash: Any = js.native
    
    /* private */ var defaultConfig: Any = js.native
    
    /* private */ var evalSrcFile: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Get the configuration options for locking the ngcc process.
      */
    def getLockingConfig(): RequiredProcessLockingCon = js.native
    
    /**
      * Get a configuration for the given `version` of a package at `packagePath`.
      *
      * @param packageName The name of the package whose config we want.
      * @param packagePath The path to the package whose config we want.
      * @param version The version of the package whose config we want, or `null` if the package's
      * package.json did not exist or was invalid.
      */
    def getPackageConfig(packageName: String, packagePath: AbsoluteFsPath): ProcessedNgccPackageConfi = js.native
    def getPackageConfig(packageName: String, packagePath: AbsoluteFsPath, version: String): ProcessedNgccPackageConfi = js.native
    
    /* private */ var getRawPackageConfig: Any = js.native
    
    val hash: String = js.native
    
    val hashAlgorithm: String = js.native
    
    /* private */ var loadPackageConfig: Any = js.native
    
    /* private */ var loadProjectConfig: Any = js.native
    
    /* private */ var projectConfig: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/configuration", "PartiallyProcessedConfig")
  @js.native
  open class PartiallyProcessedConfig protected () extends StObject {
    def this(projectConfig: NgccProjectConfig) = this()
    
    /**
      * Registers the configuration for a particular version of the provided package.
      */
    /* private */ var addPackageConfig: Any = js.native
    
    /**
      * Finds the configuration for a particular version of the provided package.
      */
    def findPackageConfig(packageName: String): VersionedPackageConfig | Null = js.native
    def findPackageConfig(packageName: String, version: String): VersionedPackageConfig | Null = js.native
    
    /**
      * Name of hash algorithm used to generate hashes of the configuration.
      *
      * Defaults to `sha256`.
      */
    var hashAlgorithm: String = js.native
    
    /**
      * Options that control how locking the process is handled.
      */
    var locking: ProcessLockingConfiguration = js.native
    
    /**
      * The packages that are configured by this project config, keyed by package name.
      */
    var packages: Map[String, js.Array[VersionedPackageConfig]] = js.native
    
    /* private */ var splitNameAndVersion: Any = js.native
    
    /**
      * Converts the configuration into a JSON representation that is used to compute a hash of the
      * configuration.
      */
    def toJson(): String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/configuration.RawNgccPackageConfig, 'entryPoints'> ]: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/configuration.RawNgccPackageConfig[P]} */ @JSImport("@angular/compiler-cli/ngcc/src/packages/configuration", "ProcessedNgccPackageConfig")
  @js.native
  open class ProcessedNgccPackageConfig protected () extends StObject {
    def this(
      fs: PathManipulation,
      packagePath: AbsoluteFsPath,
      hasEntryPointsIgnorableDeepImportMatchers: RawNgccPackageConfig
    ) = this()
    
    /**
      * The entry-points to configure for this package.
      *
      * In contrast to `RawNgccPackageConfig`, the paths are absolute and take the path of the specific
      * instance of the package into account.
      */
    var entryPoints: Map[AbsoluteFsPath, NgccEntryPointConfig] = js.native
    
    /**
      * A collection of regexes that match deep imports to ignore, for this package, rather than
      * displaying a warning.
      */
    var ignorableDeepImportMatchers: js.Array[js.RegExp] = js.native
    
    /**
      * The absolute path to this instance of the package.
      * Note that there may be multiple instances of a package inside a project in nested
      * `node_modules/`. For example, one at `<project-root>/node_modules/some-package/` and one at
      * `<project-root>/node_modules/other-package/node_modules/some-package/`.
      */
    var packagePath: AbsoluteFsPath = js.native
  }
  
  trait NgccEntryPointConfig extends StObject {
    
    /**
      * Enabling this option for an entrypoint tells ngcc that deep imports might be used for the files
      * it contains, and that it should generate private re-exports alongside the NgModule of all the
      * directives/pipes it makes available in support of those imports.
      */
    var generateDeepReexports: js.UndefOr[Boolean] = js.undefined
    
    /** Do not process (or even acknowledge the existence of) this entry-point, if true. */
    var ignore: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Normally, ngcc will skip compilation of entrypoints that contain imports that can't be resolved
      * or understood. If this option is specified, ngcc will proceed with compiling the entrypoint
      * even in the face of such missing dependencies.
      */
    var ignoreMissingDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This property, if provided, holds values that will override equivalent properties in an
      * entry-point's package.json file.
      */
    var `override`: js.UndefOr[PackageJsonFormatPropertiesMap] = js.undefined
  }
  object NgccEntryPointConfig {
    
    inline def apply(): NgccEntryPointConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgccEntryPointConfig]
    }
    
    extension [Self <: NgccEntryPointConfig](x: Self) {
      
      inline def setGenerateDeepReexports(value: Boolean): Self = StObject.set(x, "generateDeepReexports", value.asInstanceOf[js.Any])
      
      inline def setGenerateDeepReexportsUndefined: Self = StObject.set(x, "generateDeepReexports", js.undefined)
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingDependencies(value: Boolean): Self = StObject.set(x, "ignoreMissingDependencies", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingDependenciesUndefined: Self = StObject.set(x, "ignoreMissingDependencies", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setOverride(value: PackageJsonFormatPropertiesMap): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait NgccProjectConfig extends StObject {
    
    /**
      * Name of hash algorithm used to generate hashes of the configuration.
      *
      * Defaults to `sha256`.
      */
    var hashAlgorithm: js.UndefOr[String] = js.undefined
    
    /**
      * Options that control how locking the process is handled.
      */
    var locking: js.UndefOr[ProcessLockingConfiguration] = js.undefined
    
    /**
      * The packages that are configured by this project config.
      */
    var packages: js.UndefOr[StringDictionary[js.UndefOr[RawNgccPackageConfig]]] = js.undefined
  }
  object NgccProjectConfig {
    
    inline def apply(): NgccProjectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgccProjectConfig]
    }
    
    extension [Self <: NgccProjectConfig](x: Self) {
      
      inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setLocking(value: ProcessLockingConfiguration): Self = StObject.set(x, "locking", value.asInstanceOf[js.Any])
      
      inline def setLockingUndefined: Self = StObject.set(x, "locking", js.undefined)
      
      inline def setPackages(value: StringDictionary[js.UndefOr[RawNgccPackageConfig]]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    }
  }
  
  trait ProcessLockingConfiguration extends StObject {
    
    /**
      * The number of times the AsyncLocker will attempt to lock the process before failing.
      * Defaults to 500.
      */
    var retryAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds between attempts to lock the process.
      * Defaults to 500ms.
      * */
    var retryDelay: js.UndefOr[Double] = js.undefined
  }
  object ProcessLockingConfiguration {
    
    inline def apply(): ProcessLockingConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessLockingConfiguration]
    }
    
    extension [Self <: ProcessLockingConfiguration](x: Self) {
      
      inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
      
      inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
    }
  }
  
  trait RawNgccPackageConfig extends StObject {
    
    /**
      * The entry-points to configure for this package.
      *
      * In the config file the keys are paths relative to the package path.
      */
    var entryPoints: js.UndefOr[StringDictionary[NgccEntryPointConfig]] = js.undefined
    
    /**
      * A collection of regexes that match deep imports to ignore, for this package, rather than
      * displaying a warning.
      */
    var ignorableDeepImportMatchers: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  }
  object RawNgccPackageConfig {
    
    inline def apply(): RawNgccPackageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawNgccPackageConfig]
    }
    
    extension [Self <: RawNgccPackageConfig](x: Self) {
      
      inline def setEntryPoints(value: StringDictionary[NgccEntryPointConfig]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
      
      inline def setIgnorableDeepImportMatchers(value: js.Array[js.RegExp]): Self = StObject.set(x, "ignorableDeepImportMatchers", value.asInstanceOf[js.Any])
      
      inline def setIgnorableDeepImportMatchersUndefined: Self = StObject.set(x, "ignorableDeepImportMatchers", js.undefined)
      
      inline def setIgnorableDeepImportMatchersVarargs(value: js.RegExp*): Self = StObject.set(x, "ignorableDeepImportMatchers", js.Array(value*))
    }
  }
  
  trait VersionedPackageConfig
    extends StObject
       with RawNgccPackageConfig {
    
    var versionRange: String
  }
  object VersionedPackageConfig {
    
    inline def apply(versionRange: String): VersionedPackageConfig = {
      val __obj = js.Dynamic.literal(versionRange = versionRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionedPackageConfig]
    }
    
    extension [Self <: VersionedPackageConfig](x: Self) {
      
      inline def setVersionRange(value: String): Self = StObject.set(x, "versionRange", value.asInstanceOf[js.Any])
    }
  }
}
