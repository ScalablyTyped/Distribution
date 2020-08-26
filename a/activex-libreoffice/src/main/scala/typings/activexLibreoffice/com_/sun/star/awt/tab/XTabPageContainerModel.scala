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
@js.native
trait XTabPageContainerModel
  extends XIndexContainer
     with XContainer {
  /**
    * creates a TabPageModel which can be inserted into the container.
    * @param TabPageID the id of the tab page
    */
  def createTabPage(TabPageID: Double): XTabPageModel = js.native
  /**
    * creates a TabPageModel which can be inserted into the container, by loading it from a user interface resource file.
    * @param TabPageID the id of the tab page
    * @param ResourceURL the URL of the user interface resource to load
    */
  def loadTabPage(TabPageID: Double, ResourceURL: String): XTabPageModel = js.native
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
  @scala.inline
  implicit class XTabPageContainerModelOps[Self <: XTabPageContainerModel] (val x: Self) extends AnyVal {
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
    def setCreateTabPage(value: Double => XTabPageModel): Self = this.set("createTabPage", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadTabPage(value: (Double, String) => XTabPageModel): Self = this.set("loadTabPage", js.Any.fromFunction2(value))
  }
  
}

