package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a user of the database, who has certain access rights for the objects of the database. */
trait User
  extends XUser
     with XGroupsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name of the user. */
  var Name: java.lang.String
}

