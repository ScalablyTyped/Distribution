package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  /**
    * The port that is used by the Listener.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The protocol that is used by the Listener.
    */
  var Protocol: js.UndefOr[String] = js.native
}

object Listener {
  @scala.inline
  def apply(Port: Int | Double = null, Protocol: String = null): Listener = {
    val __obj = js.Dynamic.literal()
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}

