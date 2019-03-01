package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the sidebar
  * @since LibreOffice 5.1
  */
trait XSidebarProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Decks: XDecks
  /** Get the XFrame owner */
  val Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame
  /** Returns the sidebar object */
  val Sidebar: XSidebar
  def getDecks(): XDecks
  /** Get the XFrame owner */
  def getFrame(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame
  /** Returns the sidebar object */
  def getSidebar(): XSidebar
  /** Is the sidebar visible */
  def isVisible(): scala.Boolean
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: scala.Boolean): scala.Unit
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: scala.Boolean): scala.Unit
}

object XSidebarProvider {
  @scala.inline
  def apply(
    Decks: XDecks,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Sidebar: XSidebar,
    acquire: js.Function0[scala.Unit],
    getDecks: js.Function0[XDecks],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getSidebar: js.Function0[XSidebar],
    isVisible: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    showDecks: js.Function1[scala.Boolean, scala.Unit]
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Decks")(Decks)
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("Sidebar")(Sidebar)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDecks")(getDecks)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getSidebar")(getSidebar)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("showDecks")(showDecks)
    __obj.asInstanceOf[XSidebarProvider]
  }
}

