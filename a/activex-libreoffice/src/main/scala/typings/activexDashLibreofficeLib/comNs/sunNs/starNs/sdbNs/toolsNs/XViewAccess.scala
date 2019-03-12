package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

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
  def alterCommand(view: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, command: java.lang.String): scala.Unit
  /**
    * returns the SQL statement of the view
    * @param view the table to be renamed
    * @throws com::sun::star::sdbc::SQLException
    */
  def getCommand(view: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): java.lang.String
}

object XViewAccess {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    acquire: () => scala.Unit,
    alterCommand: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, java.lang.String) => scala.Unit,
    getCommand: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => java.lang.String,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XViewAccess = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), getCommand = js.Any.fromFunction1(getCommand), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XViewAccess]
  }
}

