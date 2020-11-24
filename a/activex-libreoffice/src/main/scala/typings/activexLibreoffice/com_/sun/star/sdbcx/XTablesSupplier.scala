package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XTablesSupplierOps[Self <: XTablesSupplier] (val x: Self) extends AnyVal {
    
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
    def setTables(value: XNameAccess): Self = this.set("Tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTables(value: () => XNameAccess): Self = this.set("getTables", js.Any.fromFunction0(value))
  }
}
