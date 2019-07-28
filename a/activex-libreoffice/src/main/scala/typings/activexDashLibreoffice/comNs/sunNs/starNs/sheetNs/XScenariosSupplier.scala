package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of scenarios. */
trait XScenariosSupplier extends XInterface {
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
    acquire: () => Unit,
    getScenarios: () => XScenarios,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScenariosSupplier = {
    val __obj = js.Dynamic.literal(Scenarios = Scenarios, acquire = js.Any.fromFunction0(acquire), getScenarios = js.Any.fromFunction0(getScenarios), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScenariosSupplier]
  }
}

