package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forward extends StObject {
  
  var Cancel: Boolean
  
  val Forward: Any
}
object Forward {
  
  inline def apply(Cancel: Boolean, Forward: Any): Forward = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Forward] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Any): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
  }
}
