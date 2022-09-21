package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/config/cli.ConfigCommandArgs> */
trait OptionsConfigCommandArgs extends StObject {
  
  var global: js.UndefOr[Boolean] = js.undefined
  
  var `json-path`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object OptionsConfigCommandArgs {
  
  inline def apply(): OptionsConfigCommandArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsConfigCommandArgs]
  }
  
  extension [Self <: OptionsConfigCommandArgs](x: Self) {
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def `setJson-path`(value: String): Self = StObject.set(x, "json-path", value.asInstanceOf[js.Any])
    
    inline def `setJson-pathUndefined`: Self = StObject.set(x, "json-path", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
