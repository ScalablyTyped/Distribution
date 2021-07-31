package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** adjustment event emitted by adjustable objects. */
trait AdjustmentEvent
  extends StObject
     with EventObject {
  
  /** contains the type of the adjustment event. */
  var Type: AdjustmentType
  
  /** contains the current value in the adjustment event. */
  var Value: Double
}
object AdjustmentEvent {
  
  @scala.inline
  def apply(Source: XInterface, Type: AdjustmentType, Value: Double): AdjustmentEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustmentEvent]
  }
  
  @scala.inline
  implicit class AdjustmentEventMutableBuilder[Self <: AdjustmentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AdjustmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
