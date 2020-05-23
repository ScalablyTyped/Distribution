package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ColumnIndex = ColumnIndex.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnEvent]
  }
}

