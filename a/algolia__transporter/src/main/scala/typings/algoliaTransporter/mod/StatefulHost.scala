package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @algolia/transporter.@algolia/transporter.StatelessHost & { readonly lastUpdate :number,  readonly status :@algolia/transporter.@algolia/transporter.HostStatusType} */
@js.native
trait StatefulHost extends js.Object {
  /**
    * The type of the host.
    */
  val accept: CallType = js.native
  /**
    * Holds the last time this host failed in milliseconds elapsed
    * since the UNIX epoch. This failure can be because of an
    * timeout error or a because the host is not available.
    */
  val lastUpdate: Double = js.native
  /**
    * The protocol of the stateless host. Between `http` and `https`.
    */
  val protocol: String = js.native
  /**
    * Holds the host status. Note that, depending of the `lastUpdate`
    * an host may be considered as `Up` on the transporter layer.
    */
  val status: HostStatusType = js.native
  /**
    * The url, without protocol.
    */
  val url: String = js.native
}

object StatefulHost {
  @scala.inline
  def apply(accept: CallType, lastUpdate: Double, protocol: String, status: HostStatusType, url: String): StatefulHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], lastUpdate = lastUpdate.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulHost]
  }
  @scala.inline
  implicit class StatefulHostOps[Self <: StatefulHost] (val x: Self) extends AnyVal {
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
    def setAccept(value: CallType): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdate(value: Double): Self = this.set("lastUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: HostStatusType): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

