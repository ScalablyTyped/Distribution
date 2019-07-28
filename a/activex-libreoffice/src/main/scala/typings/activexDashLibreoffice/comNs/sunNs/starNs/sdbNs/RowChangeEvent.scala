package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates the type of change action on the data source. */
trait RowChangeEvent extends EventObject {
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
    val __obj = js.Dynamic.literal(Action = Action, Rows = Rows, Source = Source)
  
    __obj.asInstanceOf[RowChangeEvent]
  }
}

