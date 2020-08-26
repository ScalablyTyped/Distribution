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
@js.native
trait XSidebarProvider extends XInterface {
  val Decks: XDecks = js.native
  /** Get the XFrame owner */
  val Frame: XFrame = js.native
  /** Returns the sidebar object */
  val Sidebar: XSidebar = js.native
  def getDecks(): XDecks = js.native
  /** Get the XFrame owner */
  def getFrame(): XFrame = js.native
  /** Returns the sidebar object */
  def getSidebar(): XSidebar = js.native
  /** Is the sidebar visible */
  def isVisible(): Boolean = js.native
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: Boolean): Unit = js.native
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: Boolean): Unit = js.native
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
  @scala.inline
  implicit class XSidebarProviderOps[Self <: XSidebarProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecks(value: XDecks): Self = this.set("Decks", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: XFrame): Self = this.set("Frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebar(value: XSidebar): Self = this.set("Sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDecks(value: () => XDecks): Self = this.set("getDecks", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFrame(value: () => XFrame): Self = this.set("getFrame", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSidebar(value: () => XSidebar): Self = this.set("getSidebar", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = this.set("setVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setShowDecks(value: Boolean => Unit): Self = this.set("showDecks", js.Any.fromFunction1(value))
  }
  
}

