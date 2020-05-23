package typings.activexLibreoffice.com_.sun.star.sdb.tools

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to rename table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @since OOo 3.3
  */
trait XTableRename extends XConnectionSupplier {
  /**
    * rename the given table to the new name
    * @param table the table to be renamed
    * @param newName the new name of the table
    * @throws com::sun::star::sdbc::SQLException
    */
  def rename(table: XPropertySet, newName: String): Unit
}

object XTableRename {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    rename: (XPropertySet, String) => Unit
  ): XTableRename = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rename = js.Any.fromFunction2(rename))
    __obj.asInstanceOf[XTableRename]
  }
}

