package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGroupPosition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getGroupPosition(accoject: js.Any): activexDashInteropLib.SafeArray[scala.Double]
  def getObjectLink(accoject: js.Any): java.lang.String
}

object XAccessibleGroupPosition {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getGroupPosition: js.Function1[js.Any, activexDashInteropLib.SafeArray[scala.Double]],
    getObjectLink: js.Function1[js.Any, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = acquire, getGroupPosition = getGroupPosition, getObjectLink = getObjectLink, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
}

