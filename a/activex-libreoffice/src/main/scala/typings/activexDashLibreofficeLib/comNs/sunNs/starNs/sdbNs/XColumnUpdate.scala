package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to update data which is collected in a row. */
trait XColumnUpdate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBinaryStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, length: scala.Double): scala.Unit
  /**
    * updates a column with a boolean value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBoolean(x: scala.Boolean): scala.Unit
  /**
    * updates a column with a byte value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateByte(x: scala.Double): scala.Unit
  /**
    * updates a column with a byte array value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBytes(x: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateCharacterStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, length: scala.Double): scala.Unit
  /**
    * updates a column with a Date value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDate(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /**
    * updates a column with a double value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDouble(x: scala.Double): scala.Unit
  /**
    * updates a column with a float value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateFloat(x: scala.Double): scala.Unit
  /**
    * updates a column with a long value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateInt(x: scala.Double): scala.Unit
  /**
    * updates a column with a hyper value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateLong(x: scala.Double): scala.Unit
  /**
    * gives a nullable column a null value.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNull(): scala.Unit
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @param scale the scale
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNumericObject(x: js.Any, scale: scala.Double): scala.Unit
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateObject(x: js.Any): scala.Unit
  /**
    * updates a column with a short value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateShort(x: scala.Double): scala.Unit
  /**
    * updates a column with a string value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateString(x: java.lang.String): scala.Unit
  /**
    * updates a column with a Time value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTime(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /**
    * updates a column with a Timestamp value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTimestamp(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime): scala.Unit
}

object XColumnUpdate {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateBinaryStream: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateBoolean: js.Function1[scala.Boolean, scala.Unit],
    updateByte: js.Function1[scala.Double, scala.Unit],
    updateBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    updateCharacterStream: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    updateDate: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    updateDouble: js.Function1[scala.Double, scala.Unit],
    updateFloat: js.Function1[scala.Double, scala.Unit],
    updateInt: js.Function1[scala.Double, scala.Unit],
    updateLong: js.Function1[scala.Double, scala.Unit],
    updateNull: js.Function0[scala.Unit],
    updateNumericObject: js.Function2[js.Any, scala.Double, scala.Unit],
    updateObject: js.Function1[js.Any, scala.Unit],
    updateShort: js.Function1[scala.Double, scala.Unit],
    updateString: js.Function1[java.lang.String, scala.Unit],
    updateTime: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    updateTimestamp: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, scala.Unit]
  ): XColumnUpdate = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, updateBinaryStream = updateBinaryStream, updateBoolean = updateBoolean, updateByte = updateByte, updateBytes = updateBytes, updateCharacterStream = updateCharacterStream, updateDate = updateDate, updateDouble = updateDouble, updateFloat = updateFloat, updateInt = updateInt, updateLong = updateLong, updateNull = updateNull, updateNumericObject = updateNumericObject, updateObject = updateObject, updateShort = updateShort, updateString = updateString, updateTime = updateTime, updateTimestamp = updateTimestamp)
  
    __obj.asInstanceOf[XColumnUpdate]
  }
}

