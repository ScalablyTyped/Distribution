package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  val Command: js.Any
  
  val Enabled: js.Any
}
object Enabled {
  
  @scala.inline
  def apply(Command: js.Any, Enabled: js.Any): Enabled = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: js.Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: js.Any): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
