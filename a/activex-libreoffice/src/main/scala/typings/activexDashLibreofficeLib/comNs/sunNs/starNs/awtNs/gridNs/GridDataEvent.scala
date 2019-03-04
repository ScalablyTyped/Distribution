package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to notify changes in the data represented by an {@link XMutableGridDataModel} .
  *
  * Effectively, a `GridDataEvent` denotes a continuous two-dimensional cell range within a grid's data model, which is affected by a certain change.
  * @see XMutableGridDataModel
  * @see XGridDataListener
  * @since OOo 3.3
  */
trait GridDataEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * denotes the first column affected by a change.
    *
    * If `FirstColumn` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstColumn: scala.Double
  /**
    * denotes the first row affected by a change.
    *
    * If `FirstRow` is -1, the listener should assume that all rows of a grid's data model are affected.
    */
  var FirstRow: scala.Double
  /** denotes the last column affected by a change */
  var LastColumn: scala.Double
  /** denotes the last row affected by a change */
  var LastRow: scala.Double
}

object GridDataEvent {
  @scala.inline
  def apply(
    FirstColumn: scala.Double,
    FirstRow: scala.Double,
    LastColumn: scala.Double,
    LastRow: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): GridDataEvent = {
    val __obj = js.Dynamic.literal(FirstColumn = FirstColumn, FirstRow = FirstRow, LastColumn = LastColumn, LastRow = LastRow, Source = Source)
  
    __obj.asInstanceOf[GridDataEvent]
  }
}

