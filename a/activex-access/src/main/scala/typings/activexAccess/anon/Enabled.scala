package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  val Command: js.Any
  
  val Enabled: js.Any
}
object Enabled {
  
  inline def apply(Command: js.Any, Enabled: js.Any): Enabled = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setCommand(value: js.Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: js.Any): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
