package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a text event. */
@js.native
trait TextEvent extends EventObject {
  
  /** This is a dummy field only. Please ignore. */
  var dummy1: Double = js.native
}
object TextEvent {
  
  @scala.inline
  def apply(Source: XInterface, dummy1: Double): TextEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], dummy1 = dummy1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEvent]
  }
  
  @scala.inline
  implicit class TextEventMutableBuilder[Self <: TextEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDummy1(value: Double): Self = StObject.set(x, "dummy1", value.asInstanceOf[js.Any])
  }
}
