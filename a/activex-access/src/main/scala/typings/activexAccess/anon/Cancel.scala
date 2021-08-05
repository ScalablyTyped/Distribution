package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var Cancel: Double
}
object Cancel {
  
  inline def apply(Cancel: Double): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  extension [Self <: Cancel](x: Self) {
    
    inline def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
