package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forward extends StObject {
  
  var Cancel: Boolean
  
  val Forward: js.Any
}
object Forward {
  
  inline def apply(Cancel: Boolean, Forward: js.Any): Forward = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forward]
  }
  
  extension [Self <: Forward](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setForward(value: js.Any): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
  }
}
