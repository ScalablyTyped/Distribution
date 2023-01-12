package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  val Command: Any
  
  val Enabled: Any
}
object Enabled {
  
  inline def apply(Command: Any, Enabled: Any): Enabled = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Any): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
