package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event used by a {@link XGridColumn} to notify changes in the column.
  * @since OOo 3.3
  */
trait GridColumnEvent
  extends StObject
     with EventObject {
  
  /** Contains the name of the attributes whose value changed. */
  var AttributeName: String
  
  /** Contains the index of the changed column */
  var ColumnIndex: Double
  
  /** Contains the new value */
  var NewValue: Any
  
  /** Contains the old value */
  var OldValue: Any
}
object GridColumnEvent {
  
  inline def apply(AttributeName: String, ColumnIndex: Double, NewValue: Any, OldValue: Any, Source: XInterface): GridColumnEvent = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnEvent]
  }
  
  extension [Self <: GridColumnEvent](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
  }
}
