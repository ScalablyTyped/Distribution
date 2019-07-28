package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGetAccFlowTo extends XInterface {
  def getAccFlowTo(aXShape: js.Any, nType: Double): SafeArray[_]
}

object XAccessibleGetAccFlowTo {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAccFlowTo: (js.Any, Double) => SafeArray[_],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
}

