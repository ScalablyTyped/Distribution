package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.XGraphics
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.util.XUpdatable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XComponent
     with XInitialization
     with XStatusListener
     with XUpdatable {
  
  /**
    * is called by a status bar if the user clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def click(aPos: Point): Unit
  
  /**
    * is called by a status bar if a command event is available for a controller.
    * @param aPos the current mouse position in pixel.
    * @param nCommand describes which command has been invoked. ;  See {@link com.sun.star.awt.Command} for possible values.
    * @param bMouseEvent `TRUE` if the command is based on a mouse event, otherwise `FALSE` .
    * @param aData for future use only.
    */
  def command(aPos: Point, nCommand: Double, bMouseEvent: Boolean, aData: Any): Unit
  
  /**
    * is called by a status bar if the user double-clicked with mouse into the field of the corresponding control.
    * @param aPos the current mouse position in pixel.
    */
  def doubleClick(aPos: Point): Unit
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been pressed. If the controller has captured the mouse
    * input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonDown(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse button has been released. If the controller has captured the
    * mouse input this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseButtonUp(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the mouse position is within the controller and a mouse has been moved. If the controller has captured the mouse input
    * this function is also called when the mouse position is not within the controller.
    * @param aMouseEvent current information about the mouse pointer.
    * @returns return `TRUE` if the event should not be processed and `FALSE` if the event should be processed by the status bar.
    */
  def mouseMove(aMouseEvent: MouseEvent): Boolean
  
  /**
    * is called by a status bar if the controller has to update the visual representation.
    * @param xGraphics a reference to a {@link com.sun.star.awt.XGraphics} which has to be used to update the visual representation.
    * @param OutputRectangle a {@link com.sun.star.awt.Rectangle} which determine the output rectangle for all drawing operations
    * @param nStyle reserved for future use.
    */
  def paint(xGraphics: XGraphics, OutputRectangle: Rectangle, nStyle: Double): Unit
}
object XStatusbarController {
  
  inline def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    click: Point => Unit,
    command: (Point, Double, Boolean, Any) => Unit,
    dispose: () => Unit,
    disposing: EventObject => Unit,
    doubleClick: Point => Unit,
    initialize: SeqEquiv[Any] => Unit,
    mouseButtonDown: MouseEvent => Boolean,
    mouseButtonUp: MouseEvent => Boolean,
    mouseMove: MouseEvent => Boolean,
    paint: (XGraphics, Rectangle, Double) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    statusChanged: FeatureStateEvent => Unit,
    update: () => Unit
  ): XStatusbarController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), click = js.Any.fromFunction1(click), command = js.Any.fromFunction4(command), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), doubleClick = js.Any.fromFunction1(doubleClick), initialize = js.Any.fromFunction1(initialize), mouseButtonDown = js.Any.fromFunction1(mouseButtonDown), mouseButtonUp = js.Any.fromFunction1(mouseButtonUp), mouseMove = js.Any.fromFunction1(mouseMove), paint = js.Any.fromFunction3(paint), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), statusChanged = js.Any.fromFunction1(statusChanged), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XStatusbarController]
  }
  
  extension [Self <: XStatusbarController](x: Self) {
    
    inline def setClick(value: Point => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setCommand(value: (Point, Double, Boolean, Any) => Unit): Self = StObject.set(x, "command", js.Any.fromFunction4(value))
    
    inline def setDoubleClick(value: Point => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
    
    inline def setMouseButtonDown(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseButtonDown", js.Any.fromFunction1(value))
    
    inline def setMouseButtonUp(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseButtonUp", js.Any.fromFunction1(value))
    
    inline def setMouseMove(value: MouseEvent => Boolean): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1(value))
    
    inline def setPaint(value: (XGraphics, Rectangle, Double) => Unit): Self = StObject.set(x, "paint", js.Any.fromFunction3(value))
  }
}
