package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** indicates the type of change action on the data source. */
trait RowChangeEvent
  extends StObject
     with EventObject {
  
  /**
    * indicates the type of change.
    * @see com.sun.star.sdb.RowChangeAction
    */
  var Action: Double
  
  /** indicates the number of rows affected by the change. */
  var Rows: Double
}
object RowChangeEvent {
  
  @scala.inline
  def apply(Action: Double, Rows: Double, Source: XInterface): RowChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowChangeEvent]
  }
  
  @scala.inline
  implicit class RowChangeEventMutableBuilder[Self <: RowChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Double): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
  }
}
