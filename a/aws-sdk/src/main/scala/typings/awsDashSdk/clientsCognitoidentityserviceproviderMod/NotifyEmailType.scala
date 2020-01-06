package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyEmailType extends js.Object {
  /**
    * The HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.native
  /**
    * The subject.
    */
  var Subject: EmailNotificationSubjectType = js.native
  /**
    * The text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.native
}

object NotifyEmailType {
  @scala.inline
  def apply(
    Subject: EmailNotificationSubjectType,
    HtmlBody: EmailNotificationBodyType = null,
    TextBody: EmailNotificationBodyType = null
  ): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject.asInstanceOf[js.Any])
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody.asInstanceOf[js.Any])
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyEmailType]
  }
}

