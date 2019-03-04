package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for the deletion of more than one row at a time. */
trait XDeleteRows
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * deletes one or more rows identified by their bookmarks.
    * @param rows list of bookmarks identifying the rows.
    * @returns an array of update counts containing one element for each row. The array is ordered according to the order in which bookmarks were given.
    * @throws com::sun::star::sdbc::SQLException if a fatal error occurs, for instance, the connection gets lost if bookmarks are used which do not belong to t
    */
  def deleteRows(rows: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): activexDashInteropLib.SafeArray[scala.Double]
}

object XDeleteRows {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    deleteRows: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[scala.Double]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDeleteRows = {
    val __obj = js.Dynamic.literal(acquire = acquire, deleteRows = deleteRows, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDeleteRows]
  }
}

