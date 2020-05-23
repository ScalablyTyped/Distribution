package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window owner is responsible to handle resize/move requests sent by the window. It is also responsible to validate tracking rectangle size.
  */
trait XHatchWindowController extends XInterface {
  def activated(): Unit
  /**
    * returns the closest valid rectangle to the provided one.
    * @param aRect a new selected position and size of the tracking rectangle
    * @returns the closest valid position and size to the provided one
    */
  def calcAdjustedRectangle(aRect: Rectangle): Rectangle
  def deactivated(): Unit
  /**
    * requests window owner to resize/move the window.
    * @param aRect the new requested position and size of the window
    */
  def requestPositioning(aRect: Rectangle): Unit
}

object XHatchWindowController {
  @scala.inline
  def apply(
    acquire: () => Unit,
    activated: () => Unit,
    calcAdjustedRectangle: Rectangle => Rectangle,
    deactivated: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestPositioning: Rectangle => Unit
  ): XHatchWindowController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction0(activated), calcAdjustedRectangle = js.Any.fromFunction1(calcAdjustedRectangle), deactivated = js.Any.fromFunction0(deactivated), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestPositioning = js.Any.fromFunction1(requestPositioning))
    __obj.asInstanceOf[XHatchWindowController]
  }
}

