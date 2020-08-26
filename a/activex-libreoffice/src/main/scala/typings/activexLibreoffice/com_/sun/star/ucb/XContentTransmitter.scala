package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @author Dirk Voelzke
  * @deprecated Deprecated
  * @see
  * @version 1.0
  */
@js.native
trait XContentTransmitter extends XInterface {
  def transmit(Source: String, Destination: String, Flags: Double): Unit = js.native
}

object XContentTransmitter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    transmit: (String, String, Double) => Unit
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transmit = js.Any.fromFunction3(transmit))
    __obj.asInstanceOf[XContentTransmitter]
  }
  @scala.inline
  implicit class XContentTransmitterOps[Self <: XContentTransmitter] (val x: Self) extends AnyVal {
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
    def setTransmit(value: (String, String, Double) => Unit): Self = this.set("transmit", js.Any.fromFunction3(value))
  }
  
}

