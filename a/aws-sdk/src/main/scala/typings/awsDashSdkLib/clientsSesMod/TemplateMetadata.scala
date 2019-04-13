package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMetadata extends js.Object {
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.undefined
}

object TemplateMetadata {
  @scala.inline
  def apply(CreatedTimestamp: Timestamp = null, Name: TemplateName = null): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[TemplateMetadata]
  }
}

