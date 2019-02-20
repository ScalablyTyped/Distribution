package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a reference to a single cell. */
trait SingleReference extends js.Object {
  /** is the absolute column number. */
  var Column: scala.Double
  /**
    * contains flags.
    * @see ReferenceFlags
    */
  var Flags: scala.Double
  /** is the relative column number. */
  var RelativeColumn: scala.Double
  /** is the relative row number. */
  var RelativeRow: scala.Double
  /** is the relative sheet number. */
  var RelativeSheet: scala.Double
  /** is the absolute row number. */
  var Row: scala.Double
  /** is the absolute sheet number. */
  var Sheet: scala.Double
}

