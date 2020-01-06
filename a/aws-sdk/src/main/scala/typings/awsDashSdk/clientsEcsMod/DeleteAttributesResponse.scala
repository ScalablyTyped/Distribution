package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAttributesResponse extends js.Object {
  /**
    * A list of attribute objects that were successfully deleted from your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.native
}

object DeleteAttributesResponse {
  @scala.inline
  def apply(attributes: Attributes = null): DeleteAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAttributesResponse]
  }
}

