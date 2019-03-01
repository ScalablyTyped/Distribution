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
    acquire: js.Function0[scala.Unit],
    getBaseTypeName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BaseTypeName")(BaseTypeName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBaseTypeName")(getBaseTypeName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XRef]
  }
}

