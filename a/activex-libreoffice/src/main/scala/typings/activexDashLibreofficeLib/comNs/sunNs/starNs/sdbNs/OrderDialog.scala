package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait OrderDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createDefault(): scala.Unit
  def createWithQuery(
    QueryComposer: XSingleSelectQueryComposer,
    RowSet: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
}

