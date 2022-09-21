package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to update data which is collected in a row. */
trait XRowUpdate
  extends StObject
     with XInterface {
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateBinaryStream(columnIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a boolean value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBoolean(columnIndex: Double, x: Boolean): Unit
  
  /**
    * updates a column with a byte value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateByte(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a byte array value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateBytes(columnIndex: Double, x: SeqEquiv[Double]): Unit
  
  /**
    * updates a column with a stream value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param length how much data should be read out of the stream
    * @throws SQLException if a database access error occurs.
    */
  def updateCharacterStream(columnIndex: Double, x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a date value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDate(columnIndex: Double, x: Date): Unit
  
  /**
    * updates a column with a double value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateDouble(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a float value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateFloat(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with an long value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateInt(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a hyper value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateLong(columnIndex: Double, x: Double): Unit
  
  /**
    * gives a nullable column a null value.
    * @param columnIndex the position of the column
    * @throws SQLException if a database access error occurs.
    */
  def updateNull(columnIndex: Double): Unit
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @param scale defines the scale which should be used to write the numeric value
    * @throws SQLException if a database access error occurs.
    */
  def updateNumericObject(columnIndex: Double, x: Any, scale: Double): Unit
  
  /**
    * updates a column with an object value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateObject(columnIndex: Double, x: Any): Unit
  
  /**
    * updates a column with a short value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateShort(columnIndex: Double, x: Double): Unit
  
  /**
    * updates a column with a string value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateString(columnIndex: Double, x: String): Unit
  
  /**
    * updates a column with a time value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTime(columnIndex: Double, x: Time): Unit
  
  /**
    * updates a column with a timestamp value.
    * @param columnIndex the position of the column
    * @param x the new column value
    * @throws SQLException if a database access error occurs.
    */
  def updateTimestamp(columnIndex: Double, x: DateTime): Unit
}
object XRowUpdate {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    updateBinaryStream: (Double, XInputStream, Double) => Unit,
    updateBoolean: (Double, Boolean) => Unit,
    updateByte: (Double, Double) => Unit,
    updateBytes: (Double, SeqEquiv[Double]) => Unit,
    updateCharacterStream: (Double, XInputStream, Double) => Unit,
    updateDate: (Double, Date) => Unit,
    updateDouble: (Double, Double) => Unit,
    updateFloat: (Double, Double) => Unit,
    updateInt: (Double, Double) => Unit,
    updateLong: (Double, Double) => Unit,
    updateNull: Double => Unit,
    updateNumericObject: (Double, Any, Double) => Unit,
    updateObject: (Double, Any) => Unit,
    updateShort: (Double, Double) => Unit,
    updateString: (Double, String) => Unit,
    updateTime: (Double, Time) => Unit,
    updateTimestamp: (Double, DateTime) => Unit
  ): XRowUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateBinaryStream = js.Any.fromFunction3(updateBinaryStream), updateBoolean = js.Any.fromFunction2(updateBoolean), updateByte = js.Any.fromFunction2(updateByte), updateBytes = js.Any.fromFunction2(updateBytes), updateCharacterStream = js.Any.fromFunction3(updateCharacterStream), updateDate = js.Any.fromFunction2(updateDate), updateDouble = js.Any.fromFunction2(updateDouble), updateFloat = js.Any.fromFunction2(updateFloat), updateInt = js.Any.fromFunction2(updateInt), updateLong = js.Any.fromFunction2(updateLong), updateNull = js.Any.fromFunction1(updateNull), updateNumericObject = js.Any.fromFunction3(updateNumericObject), updateObject = js.Any.fromFunction2(updateObject), updateShort = js.Any.fromFunction2(updateShort), updateString = js.Any.fromFunction2(updateString), updateTime = js.Any.fromFunction2(updateTime), updateTimestamp = js.Any.fromFunction2(updateTimestamp))
    __obj.asInstanceOf[XRowUpdate]
  }
  
  extension [Self <: XRowUpdate](x: Self) {
    
    inline def setUpdateBinaryStream(value: (Double, XInputStream, Double) => Unit): Self = StObject.set(x, "updateBinaryStream", js.Any.fromFunction3(value))
    
    inline def setUpdateBoolean(value: (Double, Boolean) => Unit): Self = StObject.set(x, "updateBoolean", js.Any.fromFunction2(value))
    
    inline def setUpdateByte(value: (Double, Double) => Unit): Self = StObject.set(x, "updateByte", js.Any.fromFunction2(value))
    
    inline def setUpdateBytes(value: (Double, SeqEquiv[Double]) => Unit): Self = StObject.set(x, "updateBytes", js.Any.fromFunction2(value))
    
    inline def setUpdateCharacterStream(value: (Double, XInputStream, Double) => Unit): Self = StObject.set(x, "updateCharacterStream", js.Any.fromFunction3(value))
    
    inline def setUpdateDate(value: (Double, Date) => Unit): Self = StObject.set(x, "updateDate", js.Any.fromFunction2(value))
    
    inline def setUpdateDouble(value: (Double, Double) => Unit): Self = StObject.set(x, "updateDouble", js.Any.fromFunction2(value))
    
    inline def setUpdateFloat(value: (Double, Double) => Unit): Self = StObject.set(x, "updateFloat", js.Any.fromFunction2(value))
    
    inline def setUpdateInt(value: (Double, Double) => Unit): Self = StObject.set(x, "updateInt", js.Any.fromFunction2(value))
    
    inline def setUpdateLong(value: (Double, Double) => Unit): Self = StObject.set(x, "updateLong", js.Any.fromFunction2(value))
    
    inline def setUpdateNull(value: Double => Unit): Self = StObject.set(x, "updateNull", js.Any.fromFunction1(value))
    
    inline def setUpdateNumericObject(value: (Double, Any, Double) => Unit): Self = StObject.set(x, "updateNumericObject", js.Any.fromFunction3(value))
    
    inline def setUpdateObject(value: (Double, Any) => Unit): Self = StObject.set(x, "updateObject", js.Any.fromFunction2(value))
    
    inline def setUpdateShort(value: (Double, Double) => Unit): Self = StObject.set(x, "updateShort", js.Any.fromFunction2(value))
    
    inline def setUpdateString(value: (Double, String) => Unit): Self = StObject.set(x, "updateString", js.Any.fromFunction2(value))
    
    inline def setUpdateTime(value: (Double, Time) => Unit): Self = StObject.set(x, "updateTime", js.Any.fromFunction2(value))
    
    inline def setUpdateTimestamp(value: (Double, DateTime) => Unit): Self = StObject.set(x, "updateTimestamp", js.Any.fromFunction2(value))
  }
}
