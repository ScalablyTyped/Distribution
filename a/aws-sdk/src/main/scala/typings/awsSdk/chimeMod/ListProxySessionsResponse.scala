package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProxySessionsResponse extends js.Object {
  var NextToken: js.UndefOr[NextTokenString] = js.native
  var ProxySessions: js.UndefOr[typings.awsSdk.chimeMod.ProxySessions] = js.native
}

object ListProxySessionsResponse {
  @scala.inline
  def apply(NextToken: NextTokenString = null, ProxySessions: ProxySessions = null): ListProxySessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProxySessions != null) __obj.updateDynamic("ProxySessions")(ProxySessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProxySessionsResponse]
  }
}

