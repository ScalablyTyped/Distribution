package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to data definition beans from a connected database. */
trait XDataDefinitionSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns at least the container of tables related to the given connection.
    * @param connection the related connection
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByConnection(connection: XConnection): XTablesSupplier
  
  /**
    * returns at least the container of tables related to the given Database URL.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @param info a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByURL(url: String, info: SeqEquiv[PropertyValue]): XTablesSupplier
}
object XDataDefinitionSupplier {
  
  inline def apply(
    acquire: () => Unit,
    getDataDefinitionByConnection: XConnection => XTablesSupplier,
    getDataDefinitionByURL: (String, SeqEquiv[PropertyValue]) => XTablesSupplier,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataDefinitionSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataDefinitionByConnection = js.Any.fromFunction1(getDataDefinitionByConnection), getDataDefinitionByURL = js.Any.fromFunction2(getDataDefinitionByURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataDefinitionSupplier]
  }
  
  extension [Self <: XDataDefinitionSupplier](x: Self) {
    
    inline def setGetDataDefinitionByConnection(value: XConnection => XTablesSupplier): Self = StObject.set(x, "getDataDefinitionByConnection", js.Any.fromFunction1(value))
    
    inline def setGetDataDefinitionByURL(value: (String, SeqEquiv[PropertyValue]) => XTablesSupplier): Self = StObject.set(x, "getDataDefinitionByURL", js.Any.fromFunction2(value))
  }
}
