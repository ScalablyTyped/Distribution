package typings.angularCli

import typings.angularCli.srcCommandBuilderCommandModuleMod.CommandContext
import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandArgs
import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsNewCliMod {
  
  @JSImport("@angular/cli/src/commands/new/cli", "NewCommandModule")
  @js.native
  open class NewCommandModule protected () extends SchematicsCommandModule {
    def this(context: CommandContext) = this()
    
    @JSName("aliases")
    var aliases_NewCommandModule: String = js.native
    
    @JSName("describe")
    var describe_NewCommandModule: String = js.native
    
    /** Find a collection from config that has an `ng-new` schematic. */
    /* private */ var getCollectionFromConfig: Any = js.native
    
    /* private */ val schematicName: Any = js.native
  }
  
  trait NewCommandArgs
    extends StObject
       with SchematicsCommandArgs {
    
    var collection: js.UndefOr[String] = js.undefined
  }
  object NewCommandArgs {
    
    inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): NewCommandArgs = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
      __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    }
  }
}
