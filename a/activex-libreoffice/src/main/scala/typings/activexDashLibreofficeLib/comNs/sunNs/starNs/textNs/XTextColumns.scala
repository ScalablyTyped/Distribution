package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages columns within the object.
  *
  * The values used are relative. So it is not necessary to know the width of the object. The sum of the relative width values depends on the object and
  * is defined in "ReferenceValue."
  */
trait XTextColumns
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the number of columns. */
  var ColumnCount: scala.Double
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  var Columns: activexDashInteropLib.SafeArray[TextColumn]
  /** @returns the sum of all values.  As described above, the width values are relative. */
  val ReferenceValue: scala.Double
  /** @returns the number of columns. */
  def getColumnCount(): scala.Double
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  def getColumns(): activexDashInteropLib.SafeArray[TextColumn]
  /** @returns the sum of all values.  As described above, the width values are relative. */
  def getReferenceValue(): scala.Double
  /**
    * sets the number of columns.
    *
    * The minimum is 1 column.
    */
  def setColumnCount(nColumns: scala.Double): scala.Unit
  /**
    * sets the descriptors of all columns.
    *
    * The number of members in the sequence must be the same as the number of columns of the object.
    * @see TextColumn
    */
  def setColumns(Columns: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TextColumn]): scala.Unit
}

