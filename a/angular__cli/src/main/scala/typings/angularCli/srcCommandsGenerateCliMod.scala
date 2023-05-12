package typings.angularCli

import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandArgs
import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsGenerateCliMod {
  
  @JSImport("@angular/cli/src/commands/generate/cli", JSImport.Default)
  @js.native
  open class default () extends GenerateCommandModule
  
  trait GenerateCommandArgs
    extends StObject
       with SchematicsCommandArgs {
    
    var schematic: js.UndefOr[String] = js.undefined
  }
  object GenerateCommandArgs {
    
    inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): GenerateCommandArgs = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
      __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setSchematic(value: String): Self = StObject.set(x, "schematic", value.asInstanceOf[js.Any])
      
      inline def setSchematicUndefined: Self = StObject.set(x, "schematic", js.undefined)
    }
  }
  
  @js.native
  trait GenerateCommandModule extends SchematicsCommandModule {
    
    var aliases: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("describe")
    var describe_GenerateCommandModule: String = js.native
    
    /**
      * Generate an aliases string array to be passed to the command builder.
      *
      * @example `[component]` or `[@schematics/angular:component]`.
      */
    /* private */ var generateCommandAliasesStrings: Any = js.native
    
    /**
      * Generate a command string to be passed to the command builder.
      *
      * @example `component [name]` or `@schematics/angular:component [name]`.
      */
    /* private */ var generateCommandString: Any = js.native
    
    /* private */ var getCollectionNames: Any = js.native
    
    /**
      * Get schematics that can to be registered as subcommands.
      */
    /* private */ var getSchematics: Any = js.native
    
    /**
      * Get schematics that should to be registered as subcommands.
      *
      * @returns a sorted list of schematic that needs to be registered as subcommands.
      */
    /* private */ var getSchematicsToRegister: Any = js.native
    
    /* private */ var listSchematicAliases: Any = js.native
    
    /* private */ var shouldAddCollectionNameAsPartOfCommand: Any = js.native
  }
}
