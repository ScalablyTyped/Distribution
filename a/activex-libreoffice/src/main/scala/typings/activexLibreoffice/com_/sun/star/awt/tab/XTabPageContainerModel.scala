package typings.activexLibreoffice.com_.sun.star.awt.tab

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an interface for a {@link UnoControlTabPageContainerModel} .
  * @since OOo 3.4
  */
trait XTabPageContainerModel
  extends XIndexContainer
     with XContainer {
  /**
    * creates a TabPageModel which can be inserted into the container.
    * @param TabPageID the id of the tab page
    */
  def createTabPage(TabPageID: Double): XTabPageModel
  /**
    * creates a TabPageModel which can be inserted into the container, by loading it from a user interface resource file.
    * @param TabPageID the id of the tab page
    * @param ResourceURL the URL of the user interface resource to load
    */
  def loadTabPage(TabPageID: Double, ResourceURL: String): XTabPageModel
}

object XTabPageContainerModel {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    createTabPage: Double => XTabPageModel,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertByIndex: (Double, js.Any) => Unit,
    loadTabPage: (Double, String) => XTabPageModel,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    removeContainerListener: XContainerListener => Unit,
    replaceByIndex: (Double, js.Any) => Unit
  ): XTabPageContainerModel = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), createTabPage = js.Any.fromFunction1(createTabPage), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex))
    __obj.asInstanceOf[XTabPageContainerModel]
  }
}

