package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateMetadata extends js.Object {
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
}

object TemplateMetadata {
  @scala.inline
  def apply(CreatedTimestamp: Timestamp = null, Name: TemplateName = null): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateMetadata]
  }
}

