package typings.activexLibreoffice.com_.sun.star.media

import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides an easy access to a stream images using their position in the time. */
@js.native
trait XFrameGrabber extends js.Object {
  /**
    * returns the image of the underlying stream at a given position
    * @param fMediaTime the time in seconds of the image to get. This time has to be a positive value inferior to the stream duration.
    */
  def grabFrame(fMediaTime: Double): XGraphic = js.native
}

object XFrameGrabber {
  @scala.inline
  def apply(grabFrame: Double => XGraphic): XFrameGrabber = {
    val __obj = js.Dynamic.literal(grabFrame = js.Any.fromFunction1(grabFrame))
    __obj.asInstanceOf[XFrameGrabber]
  }
  @scala.inline
  implicit class XFrameGrabberOps[Self <: XFrameGrabber] (val x: Self) extends AnyVal {
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
    def setGrabFrame(value: Double => XGraphic): Self = this.set("grabFrame", js.Any.fromFunction1(value))
  }
  
}

