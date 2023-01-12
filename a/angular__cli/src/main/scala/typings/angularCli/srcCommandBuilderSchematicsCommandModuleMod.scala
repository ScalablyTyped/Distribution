package typings.angularCli

import typings.angularCli.anon.CollectionName
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandModule
import typings.angularCli.srcCommandBuilderUtilitiesJsonSchemaMod.Option
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Collection
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderSchematicsCommandModuleMod {
  
  @JSImport("@angular/cli/src/command-builder/schematics-command-module", "DEFAULT_SCHEMATICS_COLLECTION")
  @js.native
  val DEFAULT_SCHEMATICS_COLLECTION: /* "@schematics/angular" */ String = js.native
  
  /* note: abstract class */ @JSImport("@angular/cli/src/command-builder/schematics-command-module", "SchematicsCommandModule")
  @js.native
  open class SchematicsCommandModule protected () extends CommandModule[SchematicsCommandArgs] {
    def this(context: CommandContext) = this()
    
    /* protected */ val allowPrivateSchematics: Boolean = js.native
    
    /* private */ var defaultProjectDeprecationWarningShown: Any = js.native
    
    /* protected */ def getOrCreateWorkflowForBuilder(collectionName: String): Any = js.native
    
    /* protected */ def getOrCreateWorkflowForExecution(collectionName: String, options: SchematicsExecutionOptions): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWorkflow */ Any
      ] = js.native
    
    /* private */ var getProjectName: Any = js.native
    
    /* private */ var getResolvePaths: Any = js.native
    
    /* protected */ def getSchematicCollections(): js.Promise[Set[String]] = js.native
    
    /** Get schematic schema options.*/
    /* protected */ def getSchematicOptions(
      collection: Collection[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemCollectionDescription */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileSystemSchematicDescription */ Any
        ],
      schematicName: String,
      workflow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWorkflow */ Any
    ): js.Promise[js.Array[Option]] = js.native
    
    /* protected */ def parseSchematicInfo(): js.Tuple2[/* collectionName */ js.UndefOr[String], /* schematicName */ js.UndefOr[String]] = js.native
    /* protected */ def parseSchematicInfo(schematic: String): js.Tuple2[/* collectionName */ js.UndefOr[String], /* schematicName */ js.UndefOr[String]] = js.native
    
    /* protected */ def runSchematic(options: CollectionName): js.Promise[Double] = js.native
  }
  
  trait SchematicsCommandArgs extends StObject {
    
    var defaults: Boolean
    
    var `dry-run`: Boolean
    
    var force: Boolean
    
    var interactive: Boolean
  }
  object SchematicsCommandArgs {
    
    inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): SchematicsCommandArgs = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
      __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchematicsCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchematicsCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/command-builder/schematics-command-module.SchematicsCommandArgs> */
  trait SchematicsExecutionOptions extends StObject {
    
    var defaults: Boolean
    
    var `dry-run`: Boolean
    
    var force: Boolean
    
    var interactive: Boolean
    
    var packageRegistry: js.UndefOr[String] = js.undefined
  }
  object SchematicsExecutionOptions {
    
    inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): SchematicsExecutionOptions = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
      __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchematicsExecutionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchematicsExecutionOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setPackageRegistry(value: String): Self = StObject.set(x, "packageRegistry", value.asInstanceOf[js.Any])
      
      inline def setPackageRegistryUndefined: Self = StObject.set(x, "packageRegistry", js.undefined)
    }
  }
}
