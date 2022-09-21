package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/generate/cli.GenerateCommandArgs> */
trait OptionsGenerateCommandArg extends StObject {
  
  var defaults: Boolean
  
  var `dry-run`: Boolean
  
  var force: Boolean
  
  var interactive: Boolean
  
  var schematic: js.UndefOr[String] = js.undefined
}
object OptionsGenerateCommandArg {
  
  inline def apply(defaults: Boolean, `dry-run`: Boolean, force: Boolean, interactive: Boolean): OptionsGenerateCommandArg = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.updateDynamic("dry-run")(`dry-run`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsGenerateCommandArg]
  }
  
  extension [Self <: OptionsGenerateCommandArg](x: Self) {
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def `setDry-run`(value: Boolean): Self = StObject.set(x, "dry-run", value.asInstanceOf[js.Any])
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setSchematic(value: String): Self = StObject.set(x, "schematic", value.asInstanceOf[js.Any])
    
    inline def setSchematicUndefined: Self = StObject.set(x, "schematic", js.undefined)
  }
}
