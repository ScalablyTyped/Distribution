package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages columns within the object.
  *
  * The values used are relative. So it is not necessary to know the width of the object. The sum of the relative width values depends on the object and
  * is defined in "ReferenceValue."
  */
trait XTextColumns extends XInterface {
  /** @returns the number of columns. */
  var ColumnCount: Double
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  var Columns: SafeArray[TextColumn]
  /** @returns the sum of all values.  As described above, the width values are relative. */
  val ReferenceValue: Double
  /** @returns the number of columns. */
  def getColumnCount(): Double
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  def getColumns(): SafeArray[TextColumn]
  /** @returns the sum of all values.  As described above, the width values are relative. */
  def getReferenceValue(): Double
  /**
    * sets the number of columns.
    *
    * The minimum is 1 column.
    */
  def setColumnCount(nColumns: Double): Unit
  /**
    * sets the descriptors of all columns.
    *
    * The number of members in the sequence must be the same as the number of columns of the object.
    * @see TextColumn
    */
  def setColumns(Columns: SeqEquiv[TextColumn]): Unit
}

object XTextColumns {
  @scala.inline
  def apply(
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    ReferenceValue: Double,
    acquire: () => Unit,
    getColumnCount: () => Double,
    getColumns: () => SafeArray[TextColumn],
    getReferenceValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColumnCount: Double => Unit,
    setColumns: SeqEquiv[TextColumn] => Unit
  ): XTextColumns = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, Columns = Columns, ReferenceValue = ReferenceValue, acquire = js.Any.fromFunction0(acquire), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), getReferenceValue = js.Any.fromFunction0(getReferenceValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumnCount = js.Any.fromFunction1(setColumnCount), setColumns = js.Any.fromFunction1(setColumns))
  
    __obj.asInstanceOf[XTextColumns]
  }
}

