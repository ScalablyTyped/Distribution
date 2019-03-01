package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to update data which is collected in a row. */
trait XRowUpdate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateBinaryStream(
    columnIndex: scala.Double,
    x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    length: scala.Double
  ): scala.Unit
  /**
    * updates a column with a boolean value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBoolean(columnIndex: scala.Double, x: scala.Boolean): scala.Unit
  /**
    * updates a column with a byte value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateByte(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * updates a column with a byte array value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBytes(columnIndex: scala.Double, x: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateCharacterStream(
    columnIndex: scala.Double,
    x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    length: scala.Double
  ): scala.Unit
  /**
    * updates a column with a date value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDate(columnIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /**
    * updates a column with a double value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDouble(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * updates a column with a float value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateFloat(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * updates a column with an long value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateInt(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * updates a column with a hyper value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateLong(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * gives a nullable column a null value.
    * @param columnIndex the position of the column
    * @throws SQLException if a database access error occurs.
    */
  def updateNull(columnIndex: scala.Double): scala.Unit
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param scale defines the scale which should be used to write the numeric value
    * @throws SQLException if a database access error occurs.
    */
  def updateNumericObject(columnIndex: scala.Double, x: js.Any, scale: scala.Double): scala.Unit
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateObject(columnIndex: scala.Double, x: js.Any): scala.Unit
  /**
    * updates a column with a short value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateShort(columnIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * updates a column with a string value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateString(columnIndex: scala.Double, x: java.lang.String): scala.Unit
  /**
    * updates a column with a time value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTime(columnIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /**
    * updates a column with a timestamp value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTimestamp(columnIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime): scala.Unit
}

object XRowUpdate {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateBinaryStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateBoolean: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    updateByte: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateBytes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    updateCharacterStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateDate: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    updateDouble: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateFloat: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateInt: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateLong: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateNull: js.Function1[scala.Double, scala.Unit],
    updateNumericObject: js.Function3[scala.Double, js.Any, scala.Double, scala.Unit],
    updateObject: js.Function2[scala.Double, js.Any, scala.Unit],
    updateShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    updateString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    updateTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    updateTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ]
  ): XRowUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("updateBinaryStream")(updateBinaryStream)
    __obj.updateDynamic("updateBoolean")(updateBoolean)
    __obj.updateDynamic("updateByte")(updateByte)
    __obj.updateDynamic("updateBytes")(updateBytes)
    __obj.updateDynamic("updateCharacterStream")(updateCharacterStream)
    __obj.updateDynamic("updateDate")(updateDate)
    __obj.updateDynamic("updateDouble")(updateDouble)
    __obj.updateDynamic("updateFloat")(updateFloat)
    __obj.updateDynamic("updateInt")(updateInt)
    __obj.updateDynamic("updateLong")(updateLong)
    __obj.updateDynamic("updateNull")(updateNull)
    __obj.updateDynamic("updateNumericObject")(updateNumericObject)
    __obj.updateDynamic("updateObject")(updateObject)
    __obj.updateDynamic("updateShort")(updateShort)
    __obj.updateDynamic("updateString")(updateString)
    __obj.updateDynamic("updateTime")(updateTime)
    __obj.updateDynamic("updateTimestamp")(updateTimestamp)
    __obj.asInstanceOf[XRowUpdate]
  }
}

