package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeouts extends js.Object {
  /**
    * The timeout to stablish a connection with the server.
    */
  val connect: Double
  /**
    * The timeout to receive the response on read requests.
    */
  val read: Double
  /**
    * The timeout to receive the response on write requests.
    */
  val write: Double
}

object Timeouts {
  @scala.inline
  def apply(connect: Double, read: Double, write: Double): Timeouts = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timeouts]
  }
}

