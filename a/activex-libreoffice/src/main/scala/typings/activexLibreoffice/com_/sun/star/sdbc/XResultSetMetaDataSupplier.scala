package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the meta data of a result set.
  *
  * The number, types, and properties of a {@link ResultSet} 's columns are provided by the {@link com.sun.star.sdbc.XResultSetMetaData} interface
  * returned by the {@link com.sun.star.sdbc.XResultSetMetaDataSupplier.getMetaData()} method.
  */
trait XResultSetMetaDataSupplier
  extends StObject
     with XInterface {
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XResultSetMetaData
  
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XResultSetMetaData
}
object XResultSetMetaDataSupplier {
  
  @scala.inline
  def apply(
    MetaData: XResultSetMetaData,
    acquire: () => Unit,
    getMetaData: () => XResultSetMetaData,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultSetMetaDataSupplier = {
    val __obj = js.Dynamic.literal(MetaData = MetaData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMetaData = js.Any.fromFunction0(getMetaData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultSetMetaDataSupplier]
  }
  
  @scala.inline
  implicit class XResultSetMetaDataSupplierMutableBuilder[Self <: XResultSetMetaDataSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMetaData(value: () => XResultSetMetaData): Self = StObject.set(x, "getMetaData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMetaData(value: XResultSetMetaData): Self = StObject.set(x, "MetaData", value.asInstanceOf[js.Any])
  }
}
