package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkEmailDestination extends js.Object {
  var Destination: typings.awsDashSdk.clientsSesMod.Destination = js.native
  /**
    * A list of tags, in the form of name/value pairs, to apply to an email that you send using SendBulkTemplatedEmail. Tags correspond to characteristics of the email that you define, so that you can publish email sending events.
    */
  var ReplacementTags: js.UndefOr[MessageTagList] = js.native
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[TemplateData] = js.native
}

object BulkEmailDestination {
  @scala.inline
  def apply(
    Destination: Destination,
    ReplacementTags: MessageTagList = null,
    ReplacementTemplateData: TemplateData = null
  ): BulkEmailDestination = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    if (ReplacementTags != null) __obj.updateDynamic("ReplacementTags")(ReplacementTags.asInstanceOf[js.Any])
    if (ReplacementTemplateData != null) __obj.updateDynamic("ReplacementTemplateData")(ReplacementTemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkEmailDestination]
  }
}

