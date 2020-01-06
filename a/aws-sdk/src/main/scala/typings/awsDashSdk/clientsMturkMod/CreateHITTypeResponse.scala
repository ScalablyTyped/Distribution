package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHITTypeResponse extends js.Object {
  /**
    *  The ID of the newly registered HIT type.
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
}

object CreateHITTypeResponse {
  @scala.inline
  def apply(HITTypeId: EntityId = null): CreateHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (HITTypeId != null) __obj.updateDynamic("HITTypeId")(HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHITTypeResponse]
  }
}

