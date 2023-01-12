package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/new/cli.NewCommandArgs> */
trait OptionsNewCommandArgs extends StObject {
  
  var collection: js.UndefOr[String] = js.undefined
  
  var defaults: Boolean
  
  var `dry-run`: Boolean
  
  var force: Boolean
  
  var interactive: Boolean
}
object OptionsNewCommandArgs {
  
  inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): OptionsNewCommandArgs = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNewCommandArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsNewCommandArgs] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
