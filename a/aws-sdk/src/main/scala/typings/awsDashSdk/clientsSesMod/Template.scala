package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /**
    * The HTML body of the email.
    */
  var HtmlPart: js.UndefOr[typings.awsDashSdk.clientsSesMod.HtmlPart] = js.undefined
  /**
    * The subject line of the email.
    */
  var SubjectPart: js.UndefOr[typings.awsDashSdk.clientsSesMod.SubjectPart] = js.undefined
  /**
    * The name of the template. You will refer to this name when you send email using the SendTemplatedEmail or SendBulkTemplatedEmail operations.
    */
  var TemplateName: typings.awsDashSdk.clientsSesMod.TemplateName
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var TextPart: js.UndefOr[typings.awsDashSdk.clientsSesMod.TextPart] = js.undefined
}

object Template {
  @scala.inline
  def apply(
    TemplateName: TemplateName,
    HtmlPart: HtmlPart = null,
    SubjectPart: SubjectPart = null,
    TextPart: TextPart = null
  ): Template = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (SubjectPart != null) __obj.updateDynamic("SubjectPart")(SubjectPart)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    __obj.asInstanceOf[Template]
  }
}

