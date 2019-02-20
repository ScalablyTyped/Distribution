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

