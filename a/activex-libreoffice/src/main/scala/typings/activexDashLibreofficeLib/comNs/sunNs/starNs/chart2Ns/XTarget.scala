package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTarget
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def addDrawElement(): scala.Unit
}

object XTarget {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addDrawElement: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDrawElement = js.Any.fromFunction0(addDrawElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTarget]
  }
}

