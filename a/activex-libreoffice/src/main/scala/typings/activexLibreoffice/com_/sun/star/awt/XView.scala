package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to attach an output device to the object.
  *
  * This kind of object is called view-object.
  */
@js.native
trait XView extends XInterface {
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  var Graphics: XGraphics = js.native
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  val Size: typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /**
    * draws the object at the specified position.
    *
    * If the output should be clipped, the caller has to set the clipping region.
    */
  def draw(nX: Double, nY: Double): Unit = js.native
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  def getGraphics(): XGraphics = js.native
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  def getSize(): typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /** sets the output device. */
  def setGraphics(aDevice: XGraphics): Boolean = js.native
  /**
    * sets the zoom factor.
    *
    * The zoom factor only affects the content of the view, not the size.
    */
  def setZoom(fZoomX: Double, fZoomY: Double): Unit = js.native
}

object XView {
  @scala.inline
  def apply(
    Graphics: XGraphics,
    Size: Size,
    acquire: () => Unit,
    draw: (Double, Double) => Unit,
    getGraphics: () => XGraphics,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setGraphics: XGraphics => Boolean,
    setZoom: (Double, Double) => Unit
  ): XView = {
    val __obj = js.Dynamic.literal(Graphics = Graphics.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), draw = js.Any.fromFunction2(draw), getGraphics = js.Any.fromFunction0(getGraphics), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGraphics = js.Any.fromFunction1(setGraphics), setZoom = js.Any.fromFunction2(setZoom))
    __obj.asInstanceOf[XView]
  }
  @scala.inline
  implicit class XViewOps[Self <: XView] (val x: Self) extends AnyVal {
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
    def setGraphics(value: XGraphics): Self = this.set("Graphics", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraw(value: (Double, Double) => Unit): Self = this.set("draw", js.Any.fromFunction2(value))
    @scala.inline
    def setGetGraphics(value: () => XGraphics): Self = this.set("getGraphics", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => Size): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetGraphics(value: XGraphics => Boolean): Self = this.set("setGraphics", js.Any.fromFunction1(value))
    @scala.inline
    def setSetZoom(value: (Double, Double) => Unit): Self = this.set("setZoom", js.Any.fromFunction2(value))
  }
  
}

