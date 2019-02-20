package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link ColumnDescriptorControl} . */
trait ColumnDescriptorControlModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel {
  /** specifies the connection to a database. */
  var ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double
  /** specifies the column descriptor where the values will be stored in. */
  var Column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
}

