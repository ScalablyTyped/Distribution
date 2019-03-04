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
    acquire: js.Function0[scala.Unit],
    alterCommand: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      java.lang.String, 
      scala.Unit
    ],
    getCommand: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      java.lang.String
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XViewAccess = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = acquire, alterCommand = alterCommand, getCommand = getCommand, initialize = initialize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XViewAccess]
  }
}

