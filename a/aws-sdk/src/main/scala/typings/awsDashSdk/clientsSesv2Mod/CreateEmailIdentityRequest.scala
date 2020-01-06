package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEmailIdentityRequest extends js.Object {
  /**
    * If your request includes this object, Amazon SES configures the identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, as opposed to the default method, Easy DKIM. You can only specify this object if the email identity is a domain, as opposed to an address.
    */
  var DkimSigningAttributes: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.DkimSigningAttributes] = js.native
  /**
    * The email address or domain that you want to verify.
    */
  var EmailIdentity: Identity = js.native
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEmailIdentityRequest {
  @scala.inline
  def apply(EmailIdentity: Identity, DkimSigningAttributes: DkimSigningAttributes = null, Tags: TagList = null): CreateEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    if (DkimSigningAttributes != null) __obj.updateDynamic("DkimSigningAttributes")(DkimSigningAttributes.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEmailIdentityRequest]
  }
}

