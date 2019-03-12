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
    acquire: () => scala.Unit,
    getDecks: () => XDecks,
    getFrame: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    getSidebar: () => XSidebar,
    isVisible: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    showDecks: scala.Boolean => scala.Unit
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal(Decks = Decks, Frame = Frame, Sidebar = Sidebar, acquire = js.Any.fromFunction0(acquire), getDecks = js.Any.fromFunction0(getDecks), getFrame = js.Any.fromFunction0(getFrame), getSidebar = js.Any.fromFunction0(getSidebar), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVisible = js.Any.fromFunction1(setVisible), showDecks = js.Any.fromFunction1(showDecks))
  
    __obj.asInstanceOf[XSidebarProvider]
  }
}

