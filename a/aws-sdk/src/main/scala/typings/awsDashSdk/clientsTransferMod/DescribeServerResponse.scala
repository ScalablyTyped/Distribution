package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServerResponse extends js.Object {
  /**
    * An array containing the properties of the server with the ServerID you specified.
    */
  var Server: DescribedServer
}

object DescribeServerResponse {
  @scala.inline
  def apply(Server: DescribedServer): DescribeServerResponse = {
    val __obj = js.Dynamic.literal(Server = Server)
  
    __obj.asInstanceOf[DescribeServerResponse]
  }
}

