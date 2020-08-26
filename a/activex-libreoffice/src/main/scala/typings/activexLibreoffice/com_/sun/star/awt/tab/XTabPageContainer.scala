package typings.activexLibreoffice.com_.sun.star.awt.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to a control that displays tab pages.
  * @see UnoControlTabPageContainer
  * @since OOo 3.4
  */
@js.native
trait XTabPageContainer extends js.Object {
  /** Specifies the ID of the current active tab page. */
  var ActiveTabPageID: Double = js.native
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  val TabPageCount: Double = js.native
  /**
    * Adds a listener for the TabPageActivedEvent posted after the tab page was activated.
    * @param listener the listener to add.
    */
  def addTabPageContainerListener(listener: XTabPageContainerListener): Unit = js.native
  /**
    * Returns tab page for the given index.
    * @param tabPageIndex - index of the tab page in the IndexContainer.
    * @returns tab page which has tabPageIndex.
    */
  def getTabPage(tabPageIndex: Double): XTabPage = js.native
  /**
    * Returns tab page for the given ID.
    * @param tabPageID - ID of the tab page.
    * @returns tab page which has tabPageID.
    */
  def getTabPageByID(tabPageID: Double): XTabPage = js.native
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  def getTabPageCount(): Double = js.native
  /**
    * Checks whether a tab page is activated.
    * @param tabPageIndex the tab page to be checked.
    * @returns `TRUE` if tab page is activated, else `FALSE` .
    */
  def isTabPageActive(tabPageIndex: Double): Boolean = js.native
  /**
    * Removes a listener previously added with addTabPageListener().
    * @param listener the listener to remove.
    */
  def removeTabPageContainerListener(listener: XTabPageContainerListener): Unit = js.native
}

object XTabPageContainer {
  @scala.inline
  def apply(
    ActiveTabPageID: Double,
    TabPageCount: Double,
    addTabPageContainerListener: XTabPageContainerListener => Unit,
    getTabPage: Double => XTabPage,
    getTabPageByID: Double => XTabPage,
    getTabPageCount: () => Double,
    isTabPageActive: Double => Boolean,
    removeTabPageContainerListener: XTabPageContainerListener => Unit
  ): XTabPageContainer = {
    val __obj = js.Dynamic.literal(ActiveTabPageID = ActiveTabPageID.asInstanceOf[js.Any], TabPageCount = TabPageCount.asInstanceOf[js.Any], addTabPageContainerListener = js.Any.fromFunction1(addTabPageContainerListener), getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = js.Any.fromFunction0(getTabPageCount), isTabPageActive = js.Any.fromFunction1(isTabPageActive), removeTabPageContainerListener = js.Any.fromFunction1(removeTabPageContainerListener))
    __obj.asInstanceOf[XTabPageContainer]
  }
  @scala.inline
  implicit class XTabPageContainerOps[Self <: XTabPageContainer] (val x: Self) extends AnyVal {
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
    def setActiveTabPageID(value: Double): Self = this.set("ActiveTabPageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabPageCount(value: Double): Self = this.set("TabPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTabPageContainerListener(value: XTabPageContainerListener => Unit): Self = this.set("addTabPageContainerListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabPage(value: Double => XTabPage): Self = this.set("getTabPage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabPageByID(value: Double => XTabPage): Self = this.set("getTabPageByID", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTabPageCount(value: () => Double): Self = this.set("getTabPageCount", js.Any.fromFunction0(value))
    @scala.inline
    def setIsTabPageActive(value: Double => Boolean): Self = this.set("isTabPageActive", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTabPageContainerListener(value: XTabPageContainerListener => Unit): Self = this.set("removeTabPageContainerListener", js.Any.fromFunction1(value))
  }
  
}

