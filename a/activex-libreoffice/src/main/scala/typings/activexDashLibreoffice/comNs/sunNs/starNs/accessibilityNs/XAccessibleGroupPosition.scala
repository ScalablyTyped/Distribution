package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGroupPosition extends XInterface {
  def getGroupPosition(accoject: js.Any): SafeArray[Double]
  def getObjectLink(accoject: js.Any): String
}

object XAccessibleGroupPosition {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getGroupPosition: js.Any => SafeArray[Double],
    getObjectLink: js.Any => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getGroupPosition = js.Any.fromFunction1(getGroupPosition), getObjectLink = js.Any.fromFunction1(getObjectLink), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
}

