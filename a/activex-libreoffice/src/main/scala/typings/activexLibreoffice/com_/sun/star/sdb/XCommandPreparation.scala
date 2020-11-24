package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XPreparedStatement
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for preparation of commands.
  *
  * A command could be a table, query, or any kind of SQL statement prepared by the user.
  */
@js.native
trait XCommandPreparation extends XInterface {
  
  /**
    * creates a {@link com.sun.star.sdbc.PreparedStatement} object for sending parameterized SQL statements to the database.
    *
    * A SQL statement with or without IN parameters can be pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to
    * efficiently execute this statement multiple times.
    * @param command the command to be prepared. Any SQL statement.
    * @param commandType kind of the command {@link com.sun.star.sdb.CommandType}
    * @returns the {@link PreparedStatement} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def prepareCommand(command: String, commandType: Double): XPreparedStatement = js.native
}
object XCommandPreparation {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    prepareCommand: (String, Double) => XPreparedStatement,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandPreparation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), prepareCommand = js.Any.fromFunction2(prepareCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCommandPreparation]
  }
  
  @scala.inline
  implicit class XCommandPreparationOps[Self <: XCommandPreparation] (val x: Self) extends AnyVal {
    
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
    def setPrepareCommand(value: (String, Double) => XPreparedStatement): Self = this.set("prepareCommand", js.Any.fromFunction2(value))
  }
}
