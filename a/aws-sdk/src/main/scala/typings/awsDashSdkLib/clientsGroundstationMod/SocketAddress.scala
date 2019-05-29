package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketAddress extends js.Object {
  /**
    * Name of a socket address.
    */
  var name: String
  /**
    * Port of a socket address.
    */
  var port: Integer
}

object SocketAddress {
  @scala.inline
  def apply(name: String, port: Integer): SocketAddress = {
    val __obj = js.Dynamic.literal(name = name, port = port)
  
    __obj.asInstanceOf[SocketAddress]
  }
}

