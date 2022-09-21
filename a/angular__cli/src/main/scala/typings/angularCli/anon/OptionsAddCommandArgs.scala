package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/add/cli.AddCommandArgs> */
trait OptionsAddCommandArgs extends StObject {
  
  var collection: String
  
  var defaults: Boolean
  
  var `dry-run`: Boolean
  
  var force: Boolean
  
  var interactive: Boolean
  
  var registry: js.UndefOr[String] = js.undefined
  
  var `skip-confirmation`: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object OptionsAddCommandArgs {
  
  inline def apply(collection: String, defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): OptionsAddCommandArgs = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAddCommandArgs]
  }
  
  extension [Self <: OptionsAddCommandArgs](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def `setSkip-confirmation`(value: Boolean): Self = StObject.set(x, "skip-confirmation", value.asInstanceOf[js.Any])
    
    inline def `setSkip-confirmationUndefined`: Self = StObject.set(x, "skip-confirmation", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
