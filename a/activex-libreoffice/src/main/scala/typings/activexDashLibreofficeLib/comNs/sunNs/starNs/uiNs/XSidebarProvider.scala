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

