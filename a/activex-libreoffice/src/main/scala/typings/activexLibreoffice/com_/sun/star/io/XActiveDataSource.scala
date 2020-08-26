package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be implemented if the class should be able to write into an output stream.
  * @see XActiveDataControl.
  */
@js.native
trait XActiveDataSource extends XInterface {
  /** @returns the plugged stream. */
  var OutputStream: XOutputStream = js.native
  /** @returns the plugged stream. */
  def getOutputStream(): XOutputStream = js.native
  /**
    * plugs the output stream.
    *
    * If {@link XConnectable} is also implemented, this method should query **aStream** for a {@link XConnectable} and connect both.
    */
  def setOutputStream(aStream: XOutputStream): Unit = js.native
}

object XActiveDataSource {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit
  ): XActiveDataSource = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream))
    __obj.asInstanceOf[XActiveDataSource]
  }
  @scala.inline
  implicit class XActiveDataSourceOps[Self <: XActiveDataSource] (val x: Self) extends AnyVal {
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
    def setOutputStream(value: XOutputStream): Self = this.set("OutputStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetOutputStream(value: () => XOutputStream): Self = this.set("getOutputStream", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOutputStream(value: XOutputStream => Unit): Self = this.set("setOutputStream", js.Any.fromFunction1(value))
  }
  
}

