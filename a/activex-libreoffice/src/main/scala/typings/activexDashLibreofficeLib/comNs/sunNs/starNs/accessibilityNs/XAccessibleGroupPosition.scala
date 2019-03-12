package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGroupPosition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getGroupPosition(accoject: js.Any): stdLib.SafeArray[scala.Double]
  def getObjectLink(accoject: js.Any): java.lang.String
}

object XAccessibleGroupPosition {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getGroupPosition: js.Any => stdLib.SafeArray[scala.Double],
    getObjectLink: js.Any => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGroupPosition = js.Any.fromFunction1(getGroupPosition), getObjectLink = js.Any.fromFunction1(getObjectLink), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
}

