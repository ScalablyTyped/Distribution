package typings.activexLibreoffice.com_.sun.star.sdb

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
trait XColumnUpdate
  extends StObject
     with XInterface {
  
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBinaryStream(x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a boolean value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBoolean(x: Boolean): Unit
  
  /**
    * updates a column with a byte value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateByte(x: Double): Unit
  
  /**
    * updates a column with a byte array value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateBytes(x: SeqEquiv[Double]): Unit
  
  /**
    * updates a column with a stream value.
    * @param x the new column value
    * @param length the length of the stream
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateCharacterStream(x: XInputStream, length: Double): Unit
  
  /**
    * updates a column with a Date value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDate(x: Date): Unit
  
  /**
    * updates a column with a double value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateDouble(x: Double): Unit
  
  /**
    * updates a column with a float value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateFloat(x: Double): Unit
  
  /**
    * updates a column with a long value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateInt(x: Double): Unit
  
  /**
    * updates a column with a hyper value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateLong(x: Double): Unit
  
  /**
    * gives a nullable column a null value.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNull(): Unit
  
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @param scale the scale
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateNumericObject(x: js.Any, scale: Double): Unit
  
  /**
    * updates a column with an Object value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateObject(x: js.Any): Unit
  
  /**
    * updates a column with a short value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateShort(x: Double): Unit
  
  /**
    * updates a column with a string value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateString(x: String): Unit
  
  /**
    * updates a column with a Time value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTime(x: Time): Unit
  
  /**
    * updates a column with a Timestamp value.
    * @param x the new column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def updateTimestamp(x: DateTime): Unit
}
object XColumnUpdate {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateBinaryStream: (XInputStream, Double) => Unit,
    updateBoolean: Boolean => Unit,
    updateByte: Double => Unit,
    updateBytes: SeqEquiv[Double] => Unit,
    updateCharacterStream: (XInputStream, Double) => Unit,
    updateDate: Date => Unit,
    updateDouble: Double => Unit,
    updateFloat: Double => Unit,
    updateInt: Double => Unit,
    updateLong: Double => Unit,
    updateNull: () => Unit,
    updateNumericObject: (js.Any, Double) => Unit,
    updateObject: js.Any => Unit,
    updateShort: Double => Unit,
    updateString: String => Unit,
    updateTime: Time => Unit,
    updateTimestamp: DateTime => Unit
  ): XColumnUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateBinaryStream = js.Any.fromFunction2(updateBinaryStream), updateBoolean = js.Any.fromFunction1(updateBoolean), updateByte = js.Any.fromFunction1(updateByte), updateBytes = js.Any.fromFunction1(updateBytes), updateCharacterStream = js.Any.fromFunction2(updateCharacterStream), updateDate = js.Any.fromFunction1(updateDate), updateDouble = js.Any.fromFunction1(updateDouble), updateFloat = js.Any.fromFunction1(updateFloat), updateInt = js.Any.fromFunction1(updateInt), updateLong = js.Any.fromFunction1(updateLong), updateNull = js.Any.fromFunction0(updateNull), updateNumericObject = js.Any.fromFunction2(updateNumericObject), updateObject = js.Any.fromFunction1(updateObject), updateShort = js.Any.fromFunction1(updateShort), updateString = js.Any.fromFunction1(updateString), updateTime = js.Any.fromFunction1(updateTime), updateTimestamp = js.Any.fromFunction1(updateTimestamp))
    __obj.asInstanceOf[XColumnUpdate]
  }
  
  extension [Self <: XColumnUpdate](x: Self) {
    
    inline def setUpdateBinaryStream(value: (XInputStream, Double) => Unit): Self = StObject.set(x, "updateBinaryStream", js.Any.fromFunction2(value))
    
    inline def setUpdateBoolean(value: Boolean => Unit): Self = StObject.set(x, "updateBoolean", js.Any.fromFunction1(value))
    
    inline def setUpdateByte(value: Double => Unit): Self = StObject.set(x, "updateByte", js.Any.fromFunction1(value))
    
    inline def setUpdateBytes(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "updateBytes", js.Any.fromFunction1(value))
    
    inline def setUpdateCharacterStream(value: (XInputStream, Double) => Unit): Self = StObject.set(x, "updateCharacterStream", js.Any.fromFunction2(value))
    
    inline def setUpdateDate(value: Date => Unit): Self = StObject.set(x, "updateDate", js.Any.fromFunction1(value))
    
    inline def setUpdateDouble(value: Double => Unit): Self = StObject.set(x, "updateDouble", js.Any.fromFunction1(value))
    
    inline def setUpdateFloat(value: Double => Unit): Self = StObject.set(x, "updateFloat", js.Any.fromFunction1(value))
    
    inline def setUpdateInt(value: Double => Unit): Self = StObject.set(x, "updateInt", js.Any.fromFunction1(value))
    
    inline def setUpdateLong(value: Double => Unit): Self = StObject.set(x, "updateLong", js.Any.fromFunction1(value))
    
    inline def setUpdateNull(value: () => Unit): Self = StObject.set(x, "updateNull", js.Any.fromFunction0(value))
    
    inline def setUpdateNumericObject(value: (js.Any, Double) => Unit): Self = StObject.set(x, "updateNumericObject", js.Any.fromFunction2(value))
    
    inline def setUpdateObject(value: js.Any => Unit): Self = StObject.set(x, "updateObject", js.Any.fromFunction1(value))
    
    inline def setUpdateShort(value: Double => Unit): Self = StObject.set(x, "updateShort", js.Any.fromFunction1(value))
    
    inline def setUpdateString(value: String => Unit): Self = StObject.set(x, "updateString", js.Any.fromFunction1(value))
    
    inline def setUpdateTime(value: Time => Unit): Self = StObject.set(x, "updateTime", js.Any.fromFunction1(value))
    
    inline def setUpdateTimestamp(value: DateTime => Unit): Self = StObject.set(x, "updateTimestamp", js.Any.fromFunction1(value))
  }
}
