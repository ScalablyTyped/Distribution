package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessHost extends js.Object {
  /**
    * The type of the host.
    */
  val accept: CallType
  /**
    * The protocol of the stateless host. Between `http` and `https`.
    */
  val protocol: String
  /**
    * The url, without protocol.
    */
  val url: String
}

object StatelessHost {
  @scala.inline
  def apply(accept: CallType, protocol: String, url: String): StatelessHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatelessHost]
  }
}

