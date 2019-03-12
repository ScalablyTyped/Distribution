package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGetAccFlowTo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getAccFlowTo(aXShape: js.Any, nType: scala.Double): stdLib.SafeArray[_]
}

object XAccessibleGetAccFlowTo {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getAccFlowTo: (js.Any, scala.Double) => stdLib.SafeArray[_],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
}

