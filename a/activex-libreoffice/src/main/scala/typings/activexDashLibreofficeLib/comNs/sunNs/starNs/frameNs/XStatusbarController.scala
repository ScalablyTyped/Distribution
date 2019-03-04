package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to be implemented by a component offering a more complex user interface to users within a status bar.
  *
  * A generic status bar field is represented as a simple text field. A status bar controller can be added to a Statusbar and provide information or
  * functions with a more sophisticated user interface. ;  A typical example for status bar controller is a zoom chooser. It shows the current zoom and
  * provides general zoom levels on a pop-up menu that can be activated by a mouse action for context menus.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait XStatusbarController
  extends XStatusListener
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XUpdatable {
  /**
    * is called by a status bar if the user clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def click(aPos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /**
    * is called by a status bar if a command event is available for a controller.
    * @param aPos the current mouse position in pixel.
    * @param nCommand describes which command has been invoked. ;  See {@link com.sun.star.awt.Command} for possible values.
    * @param bMouseEvent `TRUE` if the command is based on a mouse event, otherwise `FALSE` .
    * @param aData for future use only.
    */
  def command(
    aPos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    nCommand: scala.Double,
    bMouseEvent: scala.Boolean,
    aData: js.Any
  ): scala.Unit
  /**
    * is called by a status bar if the user double-clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def doubleClick(aPos: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been pressed. If the controller has captured the mouse
    * input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonDown(aMouseEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent): scala.Boolean
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been released. If the controller has captured the
    * mouse input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonUp(aMouseEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent): scala.Boolean
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse has been moved. If the controller has captured the mouse input
    * this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseMove(aMouseEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent): scala.Boolean
  /**
    * is called by a status bar if the controller has to update the visual representation.
    * @param xGraphics a reference to a {@link com.sun.star.awt.XGraphics} which has to be used to update the visual representation.
    * @param OutputRectangle a {@link com.sun.star.awt.Rectangle} which determine the output rectangle for all drawing operations
    * @param nStyle reserved for future use.
    */
  def paint(
    xGraphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    OutputRectangle: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    nStyle: scala.Double
  ): scala.Unit
}

object XStatusbarController {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    click: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    command: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Double, 
      scala.Boolean, 
      js.Any, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    doubleClick: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    mouseButtonDown: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    mouseButtonUp: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    mouseMove: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent, scala.Boolean],
    paint: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, 
      scala.Double, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    statusChanged: js.Function1[FeatureStateEvent, scala.Unit],
    update: js.Function0[scala.Unit]
  ): XStatusbarController = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, click = click, command = command, dispose = dispose, disposing = disposing, doubleClick = doubleClick, initialize = initialize, mouseButtonDown = mouseButtonDown, mouseButtonUp = mouseButtonUp, mouseMove = mouseMove, paint = paint, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, statusChanged = statusChanged, update = update)
  
    __obj.asInstanceOf[XStatusbarController]
  }
}

