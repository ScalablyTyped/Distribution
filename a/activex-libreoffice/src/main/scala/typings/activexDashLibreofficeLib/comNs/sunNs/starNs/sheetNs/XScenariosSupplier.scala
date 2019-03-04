package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of scenarios. */
trait XScenariosSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  val Scenarios: XScenarios
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  def getScenarios(): XScenarios
}

object XScenariosSupplier {
  @scala.inline
  def apply(
    Scenarios: XScenarios,
    acquire: js.Function0[scala.Unit],
    getScenarios: js.Function0[XScenarios],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScenariosSupplier = {
    val __obj = js.Dynamic.literal(Scenarios = Scenarios, acquire = acquire, getScenarios = getScenarios, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScenariosSupplier]
  }
}

