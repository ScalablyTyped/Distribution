package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @algolia/transporter.@algolia/transporter.StatelessHost & { readonly lastUpdate  :number,  readonly status  :@algolia/transporter.@algolia/transporter.HostStatusType} */
trait StatefulHost extends js.Object {
  /**
    * The type of the host.
    */
  val accept: CallType
  /**
    * Holds the last time this host failed in milliseconds elapsed
    * since the UNIX epoch. This failure can be because of an
    * timeout error or a because the host is not available.
    */
  val lastUpdate: Double
  /**
    * The protocol of the stateless host. Between `http` and `https`.
    */
  val protocol: String
  /**
    * Holds the host status. Note that, depending of the `lastUpdate`
    * an host may be considered as `Up` on the transporter layer.
    */
  val status: HostStatusType
  /**
    * The url, without protocol.
    */
  val url: String
}

object StatefulHost {
  @scala.inline
  def apply(accept: CallType, lastUpdate: Double, protocol: String, status: HostStatusType, url: String): StatefulHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], lastUpdate = lastUpdate.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulHost]
  }
}

