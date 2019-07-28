package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * The DNS address of the Cluster.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * The port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}

object Endpoint {
  @scala.inline
  def apply(Address: String = null, Port: js.UndefOr[Integer] = js.undefined): Endpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[Endpoint]
  }
}

