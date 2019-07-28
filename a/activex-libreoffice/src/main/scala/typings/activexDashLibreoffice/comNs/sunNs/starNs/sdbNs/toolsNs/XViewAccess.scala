package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.toolsNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to fetch and to change the sql statements of views
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.View
  * @since OOo 3.3
  */
trait XViewAccess extends XConnectionSupplier {
  /**
    * allows to alter the SQL statement of a view
    * @param view the view to be altered
    * @param command the new SQL statement
    * @throws com::sun::star::sdbc::SQLException
    */
  def alterCommand(view: XPropertySet, command: String): Unit
  /**
    * returns the SQL statement of the view
    * @param view the table to be renamed
    * @throws com::sun::star::sdbc::SQLException
    */
  def getCommand(view: XPropertySet): String
}

object XViewAccess {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    alterCommand: (XPropertySet, String) => Unit,
    getCommand: XPropertySet => String,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewAccess = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), getCommand = js.Any.fromFunction1(getCommand), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewAccess]
  }
}

