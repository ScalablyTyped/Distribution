package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecatedindicates the type of change action on the data source. */
trait ChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * indicates the type of change.
    * @see com.sun.star.sdbc.ChangeAction
    */
  var Action: scala.Double
  /** indicates the number of rows affected by the change. */
  var Rows: scala.Double
}

object ChangeEvent {
  @scala.inline
  def apply(
    Action: scala.Double,
    Rows: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Rows = Rows, Source = Source)
  
    __obj.asInstanceOf[ChangeEvent]
  }
}

