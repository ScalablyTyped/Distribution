package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * The DNS hostname of the cache node.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The port number that the cache engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.native
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, Port: Int | scala.Double = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

