package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsUpdateSchematicSchemaMod {
  
  @js.native
  sealed trait PackageManager extends StObject
  @JSImport("@angular/cli/src/commands/update/schematic/schema", "PackageManager")
  @js.native
  object PackageManager extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PackageManager & String] = js.native
    
    @js.native
    sealed trait Cnpm
      extends StObject
         with PackageManager
    /* "cnpm" */ val Cnpm: typings.angularCli.srcCommandsUpdateSchematicSchemaMod.PackageManager.Cnpm & String = js.native
    
    @js.native
    sealed trait Npm
      extends StObject
         with PackageManager
    /* "npm" */ val Npm: typings.angularCli.srcCommandsUpdateSchematicSchemaMod.PackageManager.Npm & String = js.native
    
    @js.native
    sealed trait Pnpm
      extends StObject
         with PackageManager
    /* "pnpm" */ val Pnpm: typings.angularCli.srcCommandsUpdateSchematicSchemaMod.PackageManager.Pnpm & String = js.native
    
    @js.native
    sealed trait Yarn
      extends StObject
         with PackageManager
    /* "yarn" */ val Yarn: typings.angularCli.srcCommandsUpdateSchematicSchemaMod.PackageManager.Yarn & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * When false (the default), reports an error if installed packages are incompatible with
      * the update.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When using `--migrateOnly` for a single package, the version of that package from which
      * to migrate.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * Perform a migration, but do not update the installed version.
      */
    var migrateOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update to the latest version, including beta and RCs.
      */
    var next: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The preferred package manager configuration files to use for registry settings.
      */
    var packageManager: js.UndefOr[PackageManager] = js.undefined
    
    /**
      * The package or packages to update.
      */
    var packages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The npm registry to use.
      */
    var registry: js.UndefOr[String] = js.undefined
    
    /**
      * When using `--migrateOnly` for a single package, the version of that package to which to
      * migrate.
      */
    var to: js.UndefOr[String] = js.undefined
    
    /**
      * Display additional details during the update process.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMigrateOnly(value: Boolean): Self = StObject.set(x, "migrateOnly", value.asInstanceOf[js.Any])
      
      inline def setMigrateOnlyUndefined: Self = StObject.set(x, "migrateOnly", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
      
      inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
