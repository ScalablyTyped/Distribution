package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XGridColumn} to notify changes in the column.
  * @since OOo 3.3
  */
trait GridColumnEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** Contains the name of the attributes whose value changed. */
  var AttributeName: java.lang.String
  /** Contains the index of the changed column */
  var ColumnIndex: scala.Double
  /** Contains the new value */
  var NewValue: js.Any
  /** Contains the old value */
  var OldValue: js.Any
}

object GridColumnEvent {
  @scala.inline
  def apply(
    AttributeName: java.lang.String,
    ColumnIndex: scala.Double,
    NewValue: js.Any,
    OldValue: js.Any,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): GridColumnEvent = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, ColumnIndex = ColumnIndex, NewValue = NewValue, OldValue = OldValue, Source = Source)
  
    __obj.asInstanceOf[GridColumnEvent]
  }
}

