package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Action = Action, Rows = Rows, Source = Source)
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

