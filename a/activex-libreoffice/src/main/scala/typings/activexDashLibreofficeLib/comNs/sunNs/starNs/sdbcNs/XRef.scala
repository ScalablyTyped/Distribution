package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the reference to a SQL structured type value in the database. A Ref can be saved to persistent storage. A Ref is dereferenced by passing it as a
  * parameter to a SQL statement and executing the statement.
  */
trait XRef
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: java.lang.String
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): java.lang.String
}

object XRef {
  @scala.inline
  def apply(
    BaseTypeName: java.lang.String,
    acquire: () => scala.Unit,
    getBaseTypeName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XRef = {
    val __obj = js.Dynamic.literal(BaseTypeName = BaseTypeName, acquire = js.Any.fromFunction0(acquire), getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XRef]
  }
}

