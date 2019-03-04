package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Panels of a Deck.
  * @since LibreOffice 5.1
  */
trait XPanels
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** The deck Id that contains the Panels */
  val DeckId: java.lang.String
  /** The deck Id that contains the Panels */
  def getDeckId(): java.lang.String
}

object XPanels {
  @scala.inline
  def apply(
    Count: scala.Double,
    DeckId: java.lang.String,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getDeckId: js.Function0[java.lang.String],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPanels = {
    val __obj = js.Dynamic.literal(Count = Count, DeckId = DeckId, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getDeckId = getDeckId, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPanels]
  }
}

