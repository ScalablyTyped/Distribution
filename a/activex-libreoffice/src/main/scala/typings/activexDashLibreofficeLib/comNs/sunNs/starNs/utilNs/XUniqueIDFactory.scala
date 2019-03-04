package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates IDs which are unique within the container. */
trait XUniqueIDFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def createUniqueID(): java.lang.String
}

object XUniqueIDFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createUniqueID: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUniqueIDFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createUniqueID = createUniqueID, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUniqueIDFactory]
  }
}

