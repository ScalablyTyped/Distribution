package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticResponse extends js.Object {
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Any] = js.undefined
}

object OptimisticResponse {
  @scala.inline
  def apply(mutationId: String, optimisticResponse: js.Any = null): OptimisticResponse = {
    val __obj = js.Dynamic.literal(mutationId = mutationId.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
}

