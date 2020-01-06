package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAction extends js.Object {
  /**
    * The authentication method to use when sending data to an HTTPS endpoint.
    */
  var auth: js.UndefOr[HttpAuthorization] = js.native
  /**
    * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that match each possible value of the substituion template before traffic is allowed to your endpoint URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
  /**
    * The HTTP headers to send with the message data.
    */
  var headers: js.UndefOr[HeaderList] = js.native
  /**
    * The endpoint URL. If substitution templates are used in the URL, you must also specify a confirmationUrl. If this is a new destination, a new TopicRuleDestination is created if possible.
    */
  var url: Url = js.native
}

object HttpAction {
  @scala.inline
  def apply(url: Url, auth: HttpAuthorization = null, confirmationUrl: Url = null, headers: HeaderList = null): HttpAction = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (confirmationUrl != null) __obj.updateDynamic("confirmationUrl")(confirmationUrl.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAction]
  }
}

