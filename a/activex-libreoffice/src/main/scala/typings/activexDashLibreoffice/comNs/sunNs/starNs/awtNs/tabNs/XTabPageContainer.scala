package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to a control that displays tab pages.
  * @see UnoControlTabPageContainer
  * @since OOo 3.4
  */
trait XTabPageContainer extends js.Object {
  /** Specifies the ID of the current active tab page. */
  var ActiveTabPageID: Double
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  val TabPageCount: Double
  /**
    * Adds a listener for the TabPageActivedEvent posted after the tab page was activated.
    * @param listener the listener to add.
    */
  def addTabPageContainerListener(listener: XTabPageContainerListener): Unit
  /**
    * Returns tab page for the given index.
    * @param tabPageIndex - index of the tab page in the IndexContainer.
    * @returns tab page which has tabPageIndex.
    */
  def getTabPage(tabPageIndex: Double): XTabPage
  /**
    * Returns tab page for the given ID.
    * @param tabPageID - ID of the tab page.
    * @returns tab page which has tabPageID.
    */
  def getTabPageByID(tabPageID: Double): XTabPage
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  def getTabPageCount(): Double
  /**
    * Checks whether a tab page is activated.
    * @param tabPageIndex the tab page to be checked.
    * @returns `TRUE` if tab page is activated, else `FALSE` .
    */
  def isTabPageActive(tabPageIndex: Double): Boolean
  /**
    * Removes a listener previously added with addTabPageListener().
    * @param listener the listener to remove.
    */
  def removeTabPageContainerListener(listener: XTabPageContainerListener): Unit
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
    val __obj = js.Dynamic.literal(ActiveTabPageID = ActiveTabPageID, TabPageCount = TabPageCount, addTabPageContainerListener = js.Any.fromFunction1(addTabPageContainerListener), getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = js.Any.fromFunction0(getTabPageCount), isTabPageActive = js.Any.fromFunction1(isTabPageActive), removeTabPageContainerListener = js.Any.fromFunction1(removeTabPageContainerListener))
  
    __obj.asInstanceOf[XTabPageContainer]
  }
}

