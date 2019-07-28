package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAttributesResponse extends js.Object {
  /**
    * The attributes applied to your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
}

object PutAttributesResponse {
  @scala.inline
  def apply(attributes: Attributes = null): PutAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[PutAttributesResponse]
  }
}

