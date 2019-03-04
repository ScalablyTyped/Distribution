package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the renaming of definition objects. ;
  *
  * This is a very desirable feature which is not supported by all databases. There is no standard SQL statement provided for this feature.
  */
trait XRename
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * is intended to alter the name of a object.
    * @param newName the new name
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def rename(newName: java.lang.String): scala.Unit
}

object XRename {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rename: js.Function1[java.lang.String, scala.Unit]
  ): XRename = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, rename = rename)
  
    __obj.asInstanceOf[XRename]
  }
}

