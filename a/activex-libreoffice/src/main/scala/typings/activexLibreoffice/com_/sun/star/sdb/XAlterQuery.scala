package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to alter the command of a query. */
@js.native
trait XAlterQuery extends XInterface {
  
  /**
    * is intended to alter the command of a query object.
    * @param command the SQL statement
    * @param useEscapeProcessing `TRUE` when escape processing should be used
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterCommand(command: String, useEscapeProcessing: Boolean): Unit = js.native
}
object XAlterQuery {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    alterCommand: (String, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAlterQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAlterQuery]
  }
  
  @scala.inline
  implicit class XAlterQueryOps[Self <: XAlterQuery] (val x: Self) extends AnyVal {
    
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
    def setAlterCommand(value: (String, Boolean) => Unit): Self = this.set("alterCommand", js.Any.fromFunction2(value))
  }
}
