package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for mapping the SQL type {@link com.sun.star.sdbc.DataType.ARRAY} .
  *
  * By default, an `Array` is a transaction duration reference to an SQL array. By default, an `Array` is implemented using a SQL LOCATOR(array)
  * internally.
  */
trait XArray
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  val BaseType: scala.Double
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: java.lang.String
  /**
    * retrieves the contents of the SQL array designated by this `Array` object, using the specified `typeMap` for type map customizations.
    *
    * If the base type of the array does not match a user-defined type in `typeMap` , the standard mapping is used instead.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an sequence that contains the ordered elements of the SQL array designated by this object.
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArray(typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess): stdLib.SafeArray[_]
  /**
    * returns an array containing a slice of the SQL array, beginning with the specified `index` and containing up to `count` successive elements of the SQL
    * array.
    * @param index is the array index of the first element to retrieve; the first element is at index 1.
    * @param count is the number of successive SQL array elements to retrieve.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing up to `count` consecutive elements of the SQL array, beginning with element `index` .
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArrayAtIndex(
    index: scala.Double,
    count: scala.Double,
    typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  ): stdLib.SafeArray[_]
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  def getBaseType(): scala.Double
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): java.lang.String
  /**
    * returns a result set that contains the elements of the array designated by this `Array` object and uses the given `typeMap` to map the array elements.
    * If the base type of the array does not match a user-defined type in `typeMap` or the `typeMap` is `NULL` , the connection type mapping is used
    * instead.
    *
    * The result set contains one row for each array element, with two columns in each row. The second column stores the element value; the first column
    * stores the index into the array for that element (with the first array element being at index 1). The rows are in ascending order corresponding to the
    * order of the indices.
    * @param typeMap contains mapping of SQL user-defined types to classes in the UNO programming language
    * @returns a {@link ResultSet} object containing one row for each of the elements in the array designated by this Array object, with the rows in ascending o
    * @throws SQLException if a database access error occurs.
    */
  def getResultSet(typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess): XResultSet
  /**
    * returns a result set holding the elements of the subarray that starts at index `index` and contains up to `count` successive elements. This method
    * uses the given `typeMap` to map the array elements. If the base type of the array does not match a user-defined type in `typeMap` or the `typeMap` is
    * `NULL` , the connection type mapping is used instead.
    *
    * The result set contains one row for each array element, with two columns in each row. The second column stores the element value; the first column
    * stores the index into the array for that element (with the first array element being at index 1). The rows are in ascending order corresponding to the
    * order of the indices.
    * @param index the array index of the first element to retrieve; the first element is at index 1.
    * @param count the number of successive SQL array elements to retrieve,
    * @param typeMap the Map object that contains the mapping of SQL type names to classes in the UNO programming language.
    * @returns a {@link ResultSet} object containing up to count consecutive elements of the SQL array designated by this Array object, starting at index index.
    * @throws SQLException if a database access error occurs.
    */
  def getResultSetAtIndex(
    index: scala.Double,
    count: scala.Double,
    typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  ): XResultSet
}

object XArray {
  @scala.inline
  def apply(
    BaseType: scala.Double,
    BaseTypeName: java.lang.String,
    acquire: () => scala.Unit,
    getArray: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => stdLib.SafeArray[_],
    getArrayAtIndex: (scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess) => stdLib.SafeArray[_],
    getBaseType: () => scala.Double,
    getBaseTypeName: () => java.lang.String,
    getResultSet: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => XResultSet,
    getResultSetAtIndex: (scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess) => XResultSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XArray = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, BaseTypeName = BaseTypeName, acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction1(getArray), getArrayAtIndex = js.Any.fromFunction3(getArrayAtIndex), getBaseType = js.Any.fromFunction0(getBaseType), getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getResultSet = js.Any.fromFunction1(getResultSet), getResultSetAtIndex = js.Any.fromFunction3(getResultSetAtIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XArray]
  }
}

