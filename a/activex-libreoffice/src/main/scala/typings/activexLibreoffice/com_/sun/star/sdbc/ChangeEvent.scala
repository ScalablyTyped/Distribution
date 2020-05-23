package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecatedindicates the type of change action on the data source. */
trait ChangeEvent extends EventObject {
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
}

