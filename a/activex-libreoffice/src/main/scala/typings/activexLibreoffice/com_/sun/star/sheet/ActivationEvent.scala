package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a change of the active sheet. The new active sheet is given with this event.
  * @since OOo 2.0
  */
trait ActivationEvent extends EventObject {
  /** specifies the new active {@link Spreadsheet} . */
  var ActiveSheet: XSpreadsheet
}

object ActivationEvent {
  @scala.inline
  def apply(ActiveSheet: XSpreadsheet, Source: XInterface): ActivationEvent = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationEvent]
  }
}

