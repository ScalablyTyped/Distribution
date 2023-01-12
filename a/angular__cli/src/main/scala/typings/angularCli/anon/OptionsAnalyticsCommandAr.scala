package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/analytics/settings/cli.AnalyticsCommandArgs> */
trait OptionsAnalyticsCommandAr extends StObject {
  
  var global: Boolean
}
object OptionsAnalyticsCommandAr {
  
  inline def apply(global: Boolean): OptionsAnalyticsCommandAr = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnalyticsCommandAr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsAnalyticsCommandAr] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
