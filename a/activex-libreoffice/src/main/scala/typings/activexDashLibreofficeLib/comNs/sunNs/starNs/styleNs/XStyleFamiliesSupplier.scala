package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the style families within the container document. */
trait XStyleFamiliesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XStyleFamiliesSupplier {
  @scala.inline
  def apply(
    StyleFamilies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getStyleFamilies: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStyleFamiliesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StyleFamilies")(StyleFamilies)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getStyleFamilies")(getStyleFamilies)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
}

