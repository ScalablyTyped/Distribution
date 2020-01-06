package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectActionConfig extends js.Object {
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain #{host}.
    */
  var Host: js.UndefOr[RedirectActionHost] = js.native
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
    */
  var Path: js.UndefOr[RedirectActionPath] = js.native
  /**
    * The port. You can specify a value from 1 to 65535 or #{port}.
    */
  var Port: js.UndefOr[RedirectActionPort] = js.native
  /**
    * The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
    */
  var Protocol: js.UndefOr[RedirectActionProtocol] = js.native
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?", as it is automatically added. You can specify any of the reserved keywords.
    */
  var Query: js.UndefOr[RedirectActionQuery] = js.native
  /**
    * The HTTP redirect code. The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
    */
  var StatusCode: RedirectActionStatusCodeEnum = js.native
}

object RedirectActionConfig {
  @scala.inline
  def apply(
    StatusCode: RedirectActionStatusCodeEnum,
    Host: RedirectActionHost = null,
    Path: RedirectActionPath = null,
    Port: RedirectActionPort = null,
    Protocol: RedirectActionProtocol = null,
    Query: RedirectActionQuery = null
  ): RedirectActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (Query != null) __obj.updateDynamic("Query")(Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectActionConfig]
  }
}

