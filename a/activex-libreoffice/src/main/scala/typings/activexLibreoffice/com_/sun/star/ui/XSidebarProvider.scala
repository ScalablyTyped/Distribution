package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the sidebar
  * @since LibreOffice 5.1
  */
trait XSidebarProvider extends XInterface {
  val Decks: XDecks
  /** Get the XFrame owner */
  val Frame: XFrame
  /** Returns the sidebar object */
  val Sidebar: XSidebar
  def getDecks(): XDecks
  /** Get the XFrame owner */
  def getFrame(): XFrame
  /** Returns the sidebar object */
  def getSidebar(): XSidebar
  /** Is the sidebar visible */
  def isVisible(): Boolean
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: Boolean): Unit
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: Boolean): Unit
}

object XSidebarProvider {
  @scala.inline
  def apply(
    Decks: XDecks,
    Frame: XFrame,
    Sidebar: XSidebar,
    acquire: () => Unit,
    getDecks: () => XDecks,
    getFrame: () => XFrame,
    getSidebar: () => XSidebar,
    isVisible: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setVisible: Boolean => Unit,
    showDecks: Boolean => Unit
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal(Decks = Decks.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecks = js.Any.fromFunction0(getDecks), getFrame = js.Any.fromFunction0(getFrame), getSidebar = js.Any.fromFunction0(getSidebar), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVisible = js.Any.fromFunction1(setVisible), showDecks = js.Any.fromFunction1(showDecks))
    __obj.asInstanceOf[XSidebarProvider]
  }
}

