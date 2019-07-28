package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.gridNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridColumn} to notify changes in the column.
  * @since OOo 3.3
  */
trait GridColumnEvent extends EventObject {
  /** Contains the name of the attributes whose value changed. */
  var AttributeName: String
  /** Contains the index of the changed column */
  var ColumnIndex: Double
  /** Contains the new value */
  var NewValue: js.Any
  /** Contains the old value */
  var OldValue: js.Any
}

object GridColumnEvent {
  @scala.inline
  def apply(AttributeName: String, ColumnIndex: Double, NewValue: js.Any, OldValue: js.Any, Source: XInterface): GridColumnEvent = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, ColumnIndex = ColumnIndex, NewValue = NewValue, OldValue = OldValue, Source = Source)
  
    __obj.asInstanceOf[GridColumnEvent]
  }
}

