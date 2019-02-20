package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a single item in a data pilot field. */
trait DataPilotItem
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies whether the item is hidden. */
  var IsHidden: scala.Boolean
  /**
    * specifies the item's position in its field if sorting is manual.
    * @since OOo 2.4
    */
  var Position: scala.Double
  /** specifies whether the item is showing detail. */
  var ShowDetail: scala.Boolean
}

