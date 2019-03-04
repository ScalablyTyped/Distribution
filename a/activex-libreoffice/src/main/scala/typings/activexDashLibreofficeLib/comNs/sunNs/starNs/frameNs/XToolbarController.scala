package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions with a more sophisticated user interface. ;  A typical example for toolbar controller is a
  * font chooser on a toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait XToolbarController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** notifies a component that a single click has been made on the toolbar item. */
  def click(): scala.Unit
  /**
    * requests to create an item window which can be added to the toolbar.
    * @param Parent a {@link com.sun.star.awt.XWindow} which must be used as a parent for the requested item window.
    * @returns a {@link com.sun.star.awt.XWindow} which can be added to a toolbar. The reference must be empty if a component does not want to provide an item w
    */
  def createItemWindow(Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * requests to create a pop-up window for additional functions.
    * @returns a {@link com.sun.star.awt.XWindow} which provides additional functions to the user. The reference must be empty if component does not want to pro
    */
  def createPopupWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** notifies a component that a double click has been made on the toolbar item. */
  def doubleClick(): scala.Unit
  /**
    * provides a function to execute the command which is bound to the toolbar controller.
    * @param KeyModifier a combination of {@link com.sun.star.awt.KeyModifier} value that represent the current state of the modifier keys.  This function is
    */
  def execute(KeyModifier: scala.Double): scala.Unit
}

object XToolbarController {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    click: js.Function0[scala.Unit],
    createItemWindow: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
    ],
    createPopupWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    doubleClick: js.Function0[scala.Unit],
    execute: js.Function1[scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XToolbarController = {
    val __obj = js.Dynamic.literal(acquire = acquire, click = click, createItemWindow = createItemWindow, createPopupWindow = createPopupWindow, doubleClick = doubleClick, execute = execute, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XToolbarController]
  }
}

