package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to data definition beans from a connected database. */
@js.native
trait XDataDefinitionSupplier extends XInterface {
  
  /**
    * returns at least the container of tables related to the given connection.
    * @param connection the related connection
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByConnection(connection: XConnection): XTablesSupplier = js.native
  
  /**
    * returns at least the container of tables related to the given Database URL.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @param info a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByURL(url: String, info: SeqEquiv[PropertyValue]): XTablesSupplier = js.native
}
object XDataDefinitionSupplier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDataDefinitionByConnection: XConnection => XTablesSupplier,
    getDataDefinitionByURL: (String, SeqEquiv[PropertyValue]) => XTablesSupplier,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataDefinitionSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataDefinitionByConnection = js.Any.fromFunction1(getDataDefinitionByConnection), getDataDefinitionByURL = js.Any.fromFunction2(getDataDefinitionByURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataDefinitionSupplier]
  }
  
  @scala.inline
  implicit class XDataDefinitionSupplierOps[Self <: XDataDefinitionSupplier] (val x: Self) extends AnyVal {
    
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
    def setGetDataDefinitionByConnection(value: XConnection => XTablesSupplier): Self = this.set("getDataDefinitionByConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataDefinitionByURL(value: (String, SeqEquiv[PropertyValue]) => XTablesSupplier): Self = this.set("getDataDefinitionByURL", js.Any.fromFunction2(value))
  }
}
