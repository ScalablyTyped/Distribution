package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatelessHost extends js.Object {
  /**
    * The type of the host.
    */
  val accept: CallType = js.native
  /**
    * The protocol of the stateless host. Between `http` and `https`.
    */
  val protocol: String = js.native
  /**
    * The url, without protocol.
    */
  val url: String = js.native
}

object StatelessHost {
  @scala.inline
  def apply(accept: CallType, protocol: String, url: String): StatelessHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessHost]
  }
  @scala.inline
  implicit class StatelessHostOps[Self <: StatelessHost] (val x: Self) extends AnyVal {
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
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

