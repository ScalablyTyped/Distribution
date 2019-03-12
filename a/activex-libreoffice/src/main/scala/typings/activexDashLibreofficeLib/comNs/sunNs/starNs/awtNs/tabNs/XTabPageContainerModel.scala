package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an interface for a {@link UnoControlTabPageContainerModel} .
  * @since OOo 3.4
  */
trait XTabPageContainerModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer {
  /**
    * creates a TabPageModel which can be inserted into the container.
    * @param TabPageID the id of the tab page
    */
  def createTabPage(TabPageID: scala.Double): XTabPageModel
  /**
    * creates a TabPageModel which can be inserted into the container, by loading it from a user interface resource file.
    * @param TabPageID the id of the tab page
    * @param ResourceURL the URL of the user interface resource to load
    */
  def loadTabPage(TabPageID: scala.Double, ResourceURL: java.lang.String): XTabPageModel
}

object XTabPageContainerModel {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    createTabPage: scala.Double => XTabPageModel,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertByIndex: (scala.Double, js.Any) => scala.Unit,
    loadTabPage: (scala.Double, java.lang.String) => XTabPageModel,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByIndex: scala.Double => scala.Unit,
    removeContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    replaceByIndex: (scala.Double, js.Any) => scala.Unit
  ): XTabPageContainerModel = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), createTabPage = js.Any.fromFunction1(createTabPage), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex))
  
    __obj.asInstanceOf[XTabPageContainerModel]
  }
}

