package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

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
  var ActiveTabPageID: scala.Double
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  val TabPageCount: scala.Double
  /**
    * Adds a listener for the TabPageActivedEvent posted after the tab page was activated.
    * @param listener the listener to add.
    */
  def addTabPageContainerListener(listener: XTabPageContainerListener): scala.Unit
  /**
    * Returns tab page for the given index.
    * @param tabPageIndex - index of the tab page in the IndexContainer.
    * @returns tab page which has tabPageIndex.
    */
  def getTabPage(tabPageIndex: scala.Double): XTabPage
  /**
    * Returns tab page for the given ID.
    * @param tabPageID - ID of the tab page.
    * @returns tab page which has tabPageID.
    */
  def getTabPageByID(tabPageID: scala.Double): XTabPage
  /**
    * Returns the number of tab pages.
    * @returns the number of tab pages.
    */
  def getTabPageCount(): scala.Double
  /**
    * Checks whether a tab page is activated.
    * @param tabPageIndex the tab page to be checked.
    * @returns `TRUE` if tab page is activated, else `FALSE` .
    */
  def isTabPageActive(tabPageIndex: scala.Double): scala.Boolean
  /**
    * Removes a listener previously added with addTabPageListener().
    * @param listener the listener to remove.
    */
  def removeTabPageContainerListener(listener: XTabPageContainerListener): scala.Unit
}

