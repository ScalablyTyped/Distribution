package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event used by a {@link XGridColumn} to notify changes in the column.
  * @since OOo 3.3
  */
@js.native
trait GridColumnEvent extends EventObject {
  
  /** Contains the name of the attributes whose value changed. */
  var AttributeName: String = js.native
  
  /** Contains the index of the changed column */
  var ColumnIndex: Double = js.native
  
  /** Contains the new value */
  var NewValue: js.Any = js.native
  
  /** Contains the old value */
  var OldValue: js.Any = js.native
}
object GridColumnEvent {
  
  @scala.inline
  def apply(AttributeName: String, ColumnIndex: Double, NewValue: js.Any, OldValue: js.Any, Source: XInterface): GridColumnEvent = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnEvent]
  }
  
  @scala.inline
  implicit class GridColumnEventMutableBuilder[Self <: GridColumnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
  }
}
