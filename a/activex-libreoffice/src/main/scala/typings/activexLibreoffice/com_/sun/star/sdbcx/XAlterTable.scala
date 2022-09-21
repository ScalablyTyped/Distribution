package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for creating and appending new objects to a specific container. */
trait XAlterTable
  extends StObject
     with XInterface {
  
  /**
    * is intended to alter an existing column identified by its position. This operation must be atomic, in that it is done in one step.s
    * @param index the position of the column to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote an existing column.
    */
  def alterColumnByIndex(index: Double, descriptor: XPropertySet): Unit
  
  /**
    * is intended to alter an existing column identified by its name. This operation must be atomic, in that it is done in one step.s
    * @param colName the column name which to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterColumnByName(colName: String, descriptor: XPropertySet): Unit
}
object XAlterTable {
  
  inline def apply(
    acquire: () => Unit,
    alterColumnByIndex: (Double, XPropertySet) => Unit,
    alterColumnByName: (String, XPropertySet) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAlterTable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alterColumnByIndex = js.Any.fromFunction2(alterColumnByIndex), alterColumnByName = js.Any.fromFunction2(alterColumnByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAlterTable]
  }
  
  extension [Self <: XAlterTable](x: Self) {
    
    inline def setAlterColumnByIndex(value: (Double, XPropertySet) => Unit): Self = StObject.set(x, "alterColumnByIndex", js.Any.fromFunction2(value))
    
    inline def setAlterColumnByName(value: (String, XPropertySet) => Unit): Self = StObject.set(x, "alterColumnByName", js.Any.fromFunction2(value))
  }
}
