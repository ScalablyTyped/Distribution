package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface enables the object to handle numbering rules.
  * @see com.sun.star.text.NumberingRules
  */
trait XNumberingRulesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  val NumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  def getNumberingRules(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XNumberingRulesSupplier {
  @scala.inline
  def apply(
    NumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getNumberingRules: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNumberingRulesSupplier = {
    val __obj = js.Dynamic.literal(NumberingRules = NumberingRules, acquire = acquire, getNumberingRules = getNumberingRules, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNumberingRulesSupplier]
  }
}

