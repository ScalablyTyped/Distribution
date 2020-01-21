package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMutationId extends js.Object {
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Any] = js.undefined
}

object AnonMutationId {
  @scala.inline
  def apply(mutationId: String, optimisticResponse: js.Any = null): AnonMutationId = {
    val __obj = js.Dynamic.literal(mutationId = mutationId.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMutationId]
  }
}

