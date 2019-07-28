package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MutationId extends js.Object {
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Any] = js.undefined
}

object Anon_MutationId {
  @scala.inline
  def apply(mutationId: String, optimisticResponse: js.Any = null): Anon_MutationId = {
    val __obj = js.Dynamic.literal(mutationId = mutationId)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse)
    __obj.asInstanceOf[Anon_MutationId]
  }
}

