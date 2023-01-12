package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  val Checked: Any
  
  val Command: Any
}
object Checked {
  
  inline def apply(Checked: Any, Command: Any): Checked = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Any): Self = StObject.set(x, "Checked", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Any): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
  }
}
