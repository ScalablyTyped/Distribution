package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface to create a {@link com.sun.star.sdbc.ResultSet} based on the object providing the interface. */
trait XResultSetAccess extends XInterface {
  /**
    * returns a new {@link com.sun.star.sdbc.ResultSet} based on the object.
    * @returns the new created {@link ResultSet} object
    */
  def createResultSet(): XResultSet
}

object XResultSetAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createResultSet: () => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultSetAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createResultSet = js.Any.fromFunction0(createResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultSetAccess]
  }
}

