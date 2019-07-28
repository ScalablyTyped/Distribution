package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyEmailType extends js.Object {
  /**
    * The HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
  /**
    * The subject.
    */
  var Subject: EmailNotificationSubjectType
  /**
    * The text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
}

object NotifyEmailType {
  @scala.inline
  def apply(
    Subject: EmailNotificationSubjectType,
    HtmlBody: EmailNotificationBodyType = null,
    TextBody: EmailNotificationBodyType = null
  ): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    if (TextBody != null) __obj.updateDynamic("TextBody")(TextBody)
    __obj.asInstanceOf[NotifyEmailType]
  }
}

