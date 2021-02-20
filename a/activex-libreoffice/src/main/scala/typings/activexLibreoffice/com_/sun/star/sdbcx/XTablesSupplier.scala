package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of tables, typically used for a database definition object. */
@js.native
trait XTablesSupplier extends XInterface {
  
  /**
    * returns the container of tables.
    * @returns the tables
    */
  val Tables: XNameAccess = js.native
  
  /**
    * returns the container of tables.
    * @returns the tables
    */
  def getTables(): XNameAccess = js.native
}
object XTablesSupplier {
  
  @scala.inline
  def apply(
    Tables: XNameAccess,
    acquire: () => Unit,
    getTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTablesSupplier = {
    val __obj = js.Dynamic.literal(Tables = Tables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTablesSupplier]
  }
  
  @scala.inline
  implicit class XTablesSupplierMutableBuilder[Self <: XTablesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTables(value: () => XNameAccess): Self = StObject.set(x, "getTables", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTables(value: XNameAccess): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
  }
}
