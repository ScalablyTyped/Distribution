package typings.angularCli

import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandArgs
import typings.angularCli.srcCommandBuilderSchematicsCommandModuleMod.SchematicsCommandModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsAddCliMod {
  
  @JSImport("@angular/cli/src/commands/add/cli", JSImport.Default)
  @js.native
  open class default () extends AddCommadModule
  
  @js.native
  trait AddCommadModule extends SchematicsCommandModule {
    
    @JSName("describe")
    var describe_AddCommadModule: String = js.native
    
    /* private */ var executeSchematic: Any = js.native
    
    /* private */ var findProjectVersion: Any = js.native
    
    /* private */ var getCollectionName: Any = js.native
    
    /* private */ var hasMismatchedPeer: Any = js.native
    
    /* private */ var isPackageInstalled: Any = js.native
    
    /* private */ var isProjectVersionValid: Any = js.native
    
    @JSName("longDescriptionPath")
    var longDescriptionPath_AddCommadModule: String = js.native
    
    /* private */ var rootRequire: Any = js.native
    
    /* private */ val schematicName: Any = js.native
  }
  
  trait AddCommandArgs
    extends StObject
       with SchematicsCommandArgs {
    
    var collection: String
    
    var registry: js.UndefOr[String] = js.undefined
    
    var `skip-confirmation`: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object AddCommandArgs {
    
    inline def apply(collection: String, defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): AddCommandArgs = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
      __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddCommandArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddCommandArgs] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def `setSkip-confirmation`(value: Boolean): Self = StObject.set(x, "skip-confirmation", value.asInstanceOf[js.Any])
      
      inline def `setSkip-confirmationUndefined`: Self = StObject.set(x, "skip-confirmation", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
