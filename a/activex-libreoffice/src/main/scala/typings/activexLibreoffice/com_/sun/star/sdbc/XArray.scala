package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for mapping the SQL type {@link com.sun.star.sdbc.DataType.ARRAY} .
  *
  * By default, an `Array` is a transaction duration reference to an SQL array. By default, an `Array` is implemented using a SQL LOCATOR(array)
  * internally.
  */
@js.native
trait XArray extends XInterface {
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  val BaseType: Double = js.native
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: String = js.native
  /**
    * retrieves the contents of the SQL array designated by this `Array` object, using the specified `typeMap` for type map customizations.
    *
    * If the base type of the array does not match a user-defined type in `typeMap` , the standard mapping is used instead.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an sequence that contains the ordered elements of the SQL array designated by this object.
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArray(typeMap: XNameAccess): SafeArray[_] = js.native
  /**
    * returns an array containing a slice of the SQL array, beginning with the specified `index` and containing up to `count` successive elements of the SQL
    * array.
    * @param index is the array index of the first element to retrieve; the first element is at index 1.
    * @param count is the number of successive SQL array elements to retrieve.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing up to `count` consecutive elements of the SQL array, beginning with element `index` .
    * @throws SQLException if an error occurs while attempting to access the array.
    */
  def getArrayAtIndex(index: Double, count: Double, typeMap: XNameAccess): SafeArray[_] = js.native
  /**
    * returns the SDBC type of the elements in the array designated by this `Array` object.
    * @returns a constant from the SDBC types that is the type code for the elements in the array designated by this Array object.
    * @throws SQLException if a database access error occurs.
    */
  def getBaseType(): Double = js.native
  /**
    * returns the SQL type name of the elements in the array designated by this `Array` object.
    *
    * If the elements are a built-in type, it returns the database-specific type name of the elements. If the elements are a user-defined type (UDT), this
    * method returns the fully-qualified SQL type name.
    * @returns a String that is the database-specific name for a built-in base type or the fully-qualified SQL type name for a base type that is a UDT
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): String = js.native
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
  def getResultSet(typeMap: XNameAccess): XResultSet = js.native
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
  def getResultSetAtIndex(index: Double, count: Double, typeMap: XNameAccess): XResultSet = js.native
}

object XArray {
  @scala.inline
  def apply(
    BaseType: Double,
    BaseTypeName: String,
    acquire: () => Unit,
    getArray: XNameAccess => SafeArray[_],
    getArrayAtIndex: (Double, Double, XNameAccess) => SafeArray[_],
    getBaseType: () => Double,
    getBaseTypeName: () => String,
    getResultSet: XNameAccess => XResultSet,
    getResultSetAtIndex: (Double, Double, XNameAccess) => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XArray = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], BaseTypeName = BaseTypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction1(getArray), getArrayAtIndex = js.Any.fromFunction3(getArrayAtIndex), getBaseType = js.Any.fromFunction0(getBaseType), getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getResultSet = js.Any.fromFunction1(getResultSet), getResultSetAtIndex = js.Any.fromFunction3(getResultSetAtIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XArray]
  }
  @scala.inline
  implicit class XArrayOps[Self <: XArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseType(value: Double): Self = this.set("BaseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseTypeName(value: String): Self = this.set("BaseTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetArray(value: XNameAccess => SafeArray[_]): Self = this.set("getArray", js.Any.fromFunction1(value))
    @scala.inline
    def setGetArrayAtIndex(value: (Double, Double, XNameAccess) => SafeArray[_]): Self = this.set("getArrayAtIndex", js.Any.fromFunction3(value))
    @scala.inline
    def setGetBaseType(value: () => Double): Self = this.set("getBaseType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBaseTypeName(value: () => String): Self = this.set("getBaseTypeName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResultSet(value: XNameAccess => XResultSet): Self = this.set("getResultSet", js.Any.fromFunction1(value))
    @scala.inline
    def setGetResultSetAtIndex(value: (Double, Double, XNameAccess) => XResultSet): Self = this.set("getResultSetAtIndex", js.Any.fromFunction3(value))
  }
  
}

