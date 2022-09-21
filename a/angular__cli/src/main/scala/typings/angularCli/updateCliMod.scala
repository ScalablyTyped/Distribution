package typings.angularCli

import typings.angularCli.anon.OptionsUpdateCommandArgs
import typings.angularCli.commandModuleMod.CommandContext
import typings.angularCli.commandModuleMod.CommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateCliMod {
  
  @JSImport("@angular/cli/src/commands/update/cli", "UpdateCommandModule")
  @js.native
  open class UpdateCommandModule protected () extends CommandModule[UpdateCommandArgs] {
    def this(context: CommandContext) = this()
    
    /**
      * Checks if the current installed CLI version is older or newer than a compatible version.
      * @returns the version to install or null when there is no update to install.
      */
    /* private */ var checkCLIVersion: Any = js.native
    
    /* private */ var checkCleanGit: Any = js.native
    
    /**
      * @return Whether or not the commit was successful.
      */
    /* private */ var commit: Any = js.native
    
    @JSName("describe")
    var describe_UpdateCommandModule: String = js.native
    
    /**
      * @return Whether or not the migration was performed successfully.
      */
    /* private */ var executeMigration: Any = js.native
    
    /**
      * @return Whether or not the migrations were performed successfully.
      */
    /* private */ var executeMigrations: Any = js.native
    
    /* private */ var executePackageMigrations: Any = js.native
    
    /* private */ var executeSchematic: Any = js.native
    
    /* private */ var getCLIUpdateRunnerVersion: Any = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_UpdateCommandModule: String = js.native
    
    /* private */ var migrateOnly: Any = js.native
    
    /* private */ var packageManagerForce: Any = js.native
    
    def run(options: OptionsUpdateCommandArgs): js.Promise[Double | Unit] = js.native
    
    /* private */ var runTempBinary: Any = js.native
    
    /* private */ var updatePackagesAndMigrate: Any = js.native
  }
  
  trait UpdateCommandArgs extends StObject {
    
    var `allow-dirty`: Boolean
    
    var `create-commits`: Boolean
    
    var force: Boolean
    
    var from: js.UndefOr[String] = js.undefined
    
    var `migrate-only`: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var next: Boolean
    
    var packages: js.UndefOr[js.Array[String]] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var verbose: Boolean
  }
  object UpdateCommandArgs {
    
    inline def apply(`allow-dirty`: Boolean, `create-commits`: Boolean, force: Boolean, next: Boolean, verbose: Boolean): UpdateCommandArgs = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("allow-dirty")(`allow-dirty`.asInstanceOf[js.Any])
      __obj.updateDynamic("create-commits")(`create-commits`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateCommandArgs]
    }
    
    extension [Self <: UpdateCommandArgs](x: Self) {
      
      inline def `setAllow-dirty`(value: Boolean): Self = StObject.set(x, "allow-dirty", value.asInstanceOf[js.Any])
      
      inline def `setCreate-commits`(value: Boolean): Self = StObject.set(x, "create-commits", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def `setMigrate-only`(value: Boolean): Self = StObject.set(x, "migrate-only", value.asInstanceOf[js.Any])
      
      inline def `setMigrate-onlyUndefined`: Self = StObject.set(x, "migrate-only", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
      
      inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
