package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/cli.@angular/cli/src/command-builder/command-module.Options<@angular/cli.@angular/cli/src/commands/run/cli.RunCommandArgs> */
trait OptionsRunCommandArgs extends StObject {
  
  var target: String
}
object OptionsRunCommandArgs {
  
  inline def apply(target: String): OptionsRunCommandArgs = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsRunCommandArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsRunCommandArgs] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
