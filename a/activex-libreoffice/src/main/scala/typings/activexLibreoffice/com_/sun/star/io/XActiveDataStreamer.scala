package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read and write the corresponding stream.
  *
  * If you want to allow control from outside, also implement the {@link XActiveDataControl} interface.
  */
@js.native
trait XActiveDataStreamer extends XInterface {
  /** @returns the plugged stream. */
  var Stream: XStream = js.native
  /** @returns the plugged stream. */
  def getStream(): XStream = js.native
  /**
    * plugs the input/output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setStream(aStream: XStream): Unit = js.native
}

object XActiveDataStreamer {
  @scala.inline
  def apply(
    Stream: XStream,
    acquire: () => Unit,
    getStream: () => XStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStream: XStream => Unit
  ): XActiveDataStreamer = {
    val __obj = js.Dynamic.literal(Stream = Stream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStream = js.Any.fromFunction0(getStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStream = js.Any.fromFunction1(setStream))
    __obj.asInstanceOf[XActiveDataStreamer]
  }
  @scala.inline
  implicit class XActiveDataStreamerOps[Self <: XActiveDataStreamer] (val x: Self) extends AnyVal {
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
    def setStream(value: XStream): Self = this.set("Stream", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStream(value: () => XStream): Self = this.set("getStream", js.Any.fromFunction0(value))
    @scala.inline
    def setSetStream(value: XStream => Unit): Self = this.set("setStream", js.Any.fromFunction1(value))
  }
  
}

