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
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    createTabPage: js.Function1[scala.Double, XTabPageModel],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    loadTabPage: js.Function2[scala.Double, java.lang.String, XTabPageModel],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XTabPageContainerModel = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, addContainerListener = addContainerListener, createTabPage = createTabPage, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, insertByIndex = insertByIndex, loadTabPage = loadTabPage, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, removeContainerListener = removeContainerListener, replaceByIndex = replaceByIndex)
  
    __obj.asInstanceOf[XTabPageContainerModel]
  }
}

