package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecatedindicates the type of change action on the data source. */
trait ChangeEvent
  extends StObject
     with EventObject {
  
  /**
    * indicates the type of change.
    * @see com.sun.star.sdbc.ChangeAction
    */
  var Action: Double
  
  /** indicates the number of rows affected by the change. */
  var Rows: Double
}
object ChangeEvent {
  
  @scala.inline
  def apply(Action: Double, Rows: Double, Source: XInterface): ChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Double): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
