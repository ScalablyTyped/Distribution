package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for the custom mapping of SQL user-defined types.
  *
  * This interface must be implemented by a service that is registered in a type mapping. It is expected that this interface will normally be implemented
  * by a tool. The methods in this interface are called by the driver and are never called by a programmer directly.
  */
trait XSQLData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the fully-qualified name of the SQL user-defined type that this object represents.
    *
    * This method is called by the SDBC driver to get the name of the UDT instance that is being mapped to this instance of SQLData.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  val SQLTypeName: java.lang.String
  /**
    * returns the fully-qualified name of the SQL user-defined type that this object represents.
    *
    * This method is called by the SDBC driver to get the name of the UDT instance that is being mapped to this instance of SQLData.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  def getSQLTypeName(): java.lang.String
  /**
    * populates this object with data read from the database.
    *
    * The implementation of the method must follow this protocol: ;  It must read each of the attributes or elements of the SQL type from the given input
    * stream. This is done by calling a method of the input stream to read each item, in the order that they appear in the SQL definition of the type. The
    * method `readSQL` then assigns the data to appropriate fields or elements (of this or other objects). ;  Specifically, it must call the appropriate
    * `XSQLInput.readXXX` method(s) to do the following: for a Distinct Type, read its single data element; for a Structured Type, read a value for each
    * attribute of the SQL type.
    *
    * The SDBC driver initializes the input stream with a type map before calling this method, which is used by the appropriate `SQLInput.readXXX` method on
    * the stream.
    * @param stream the input SQL data stream
    * @param typeName the SQL type of the value on the data stream
    * @see com.sun.star.sdbc.XSQLInput
    * @throws SQLException if a database access error occurs.
    */
  def readSQL(stream: XSQLInput, typeName: java.lang.String): scala.Unit
  /**
    * writes this object to the given SQL data stream.
    *
    * The implementation of the method must follow this protocol: ;  It must write each of the attributes of the SQL type to the given output stream. This
    * is done by calling a method of the output stream to write each item, in the order that they appear in the SQL definition of the type. Specifically, it
    * must call the appropriate `XSQLOutput.writeXXX` method(s) to do the following: ;  for a Distinct Type, write its single data element; for a Structured
    * Type, write a value for each attribute of the SQL type.
    * @param stream the output SQL data stream
    * @see com.sun.star.sdbc.XSQLOutput
    * @throws SQLException if a database access error occurs.
    */
  def writeSQL(stream: XSQLOutput): scala.Unit
}

