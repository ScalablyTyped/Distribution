package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is invoked in case of fired database exception triggered by a database object. */
trait SQLErrorEvent
  extends StObject
     with EventObject {
  
  /** contains the exception that is going to be fired. */
  var Reason: js.Any
}
object SQLErrorEvent {
  
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLErrorEvent]
  }
  
  @scala.inline
  implicit class SQLErrorEventMutableBuilder[Self <: SQLErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Any): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
