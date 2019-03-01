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

object XTextColumns {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    Columns: activexDashInteropLib.SafeArray[TextColumn],
    ReferenceValue: scala.Double,
    acquire: js.Function0[scala.Unit],
    getColumnCount: js.Function0[scala.Double],
    getColumns: js.Function0[activexDashInteropLib.SafeArray[TextColumn]],
    getReferenceValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setColumnCount: js.Function1[scala.Double, scala.Unit],
    setColumns: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TextColumn], scala.Unit]
  ): XTextColumns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnCount")(ColumnCount)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("ReferenceValue")(ReferenceValue)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getColumnCount")(getColumnCount)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getReferenceValue")(getReferenceValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setColumnCount")(setColumnCount)
    __obj.updateDynamic("setColumns")(setColumns)
    __obj.asInstanceOf[XTextColumns]
  }
}

