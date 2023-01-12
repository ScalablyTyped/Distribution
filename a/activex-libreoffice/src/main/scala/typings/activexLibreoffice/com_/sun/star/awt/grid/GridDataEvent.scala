package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to notify changes in the data represented by an {@link XMutableGridDataModel} .
  *
  * Effectively, a `GridDataEvent` denotes a continuous two-dimensional cell range within a grid's data model, which is affected by a certain change.
  * @see XMutableGridDataModel
  * @see XGridDataListener
  * @since OOo 3.3
  */
trait GridDataEvent
  extends StObject
     with EventObject {
  
  /**
    * denotes the first column affected by a change.
    *
    * If `FirstColumn` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstColumn: Double
  
  /**
    * denotes the first row affected by a change.
    *
    * If `FirstRow` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstRow: Double
  
  /** denotes the last column affected by a change */
  var LastColumn: Double
  
  /** denotes the last row affected by a change */
  var LastRow: Double
}
object GridDataEvent {
  
  inline def apply(FirstColumn: Double, FirstRow: Double, LastColumn: Double, LastRow: Double, Source: XInterface): GridDataEvent = {
    val __obj = js.Dynamic.literal(FirstColumn = FirstColumn.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], LastColumn = LastColumn.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDataEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridDataEvent] (val x: Self) extends AnyVal {
    
    inline def setFirstColumn(value: Double): Self = StObject.set(x, "FirstColumn", value.asInstanceOf[js.Any])
    
    inline def setFirstRow(value: Double): Self = StObject.set(x, "FirstRow", value.asInstanceOf[js.Any])
    
    inline def setLastColumn(value: Double): Self = StObject.set(x, "LastColumn", value.asInstanceOf[js.Any])
    
    inline def setLastRow(value: Double): Self = StObject.set(x, "LastRow", value.asInstanceOf[js.Any])
  }
}
