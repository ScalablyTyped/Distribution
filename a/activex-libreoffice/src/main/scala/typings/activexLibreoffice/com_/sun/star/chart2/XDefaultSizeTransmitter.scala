package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to set a default size. This size will be used in case no further information si available. */
@js.native
trait XDefaultSizeTransmitter extends XInterface {
  /**
    * set a default size
    * @param aSize100ThMm specifies a size in hundredth mm.
    */
  def setDefaultSize(aSize100ThMm: Size): Unit = js.native
}

object XDefaultSizeTransmitter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultSize: Size => Unit
  ): XDefaultSizeTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultSize = js.Any.fromFunction1(setDefaultSize))
    __obj.asInstanceOf[XDefaultSizeTransmitter]
  }
  @scala.inline
  implicit class XDefaultSizeTransmitterOps[Self <: XDefaultSizeTransmitter] (val x: Self) extends AnyVal {
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
    def setSetDefaultSize(value: Size => Unit): Self = this.set("setDefaultSize", js.Any.fromFunction1(value))
  }
  
}

