package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * occurs in case of fired database exceptions triggered by a database form.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait ErrorEvent
  extends StObject
     with EventObject {
  
  var Reason: Any
}
object ErrorEvent {
  
  inline def apply(Reason: Any, Source: XInterface): ErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  extension [Self <: ErrorEvent](x: Self) {
    
    inline def setReason(value: Any): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
