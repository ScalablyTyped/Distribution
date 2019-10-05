package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * The DNS hostname of the cache node.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * The port number that the cache engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, Port: Int | scala.Double = null): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

