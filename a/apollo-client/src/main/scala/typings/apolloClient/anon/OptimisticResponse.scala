package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticResponse extends js.Object {
  var mutationId: String = js.native
  var optimisticResponse: js.UndefOr[js.Any] = js.native
}

object OptimisticResponse {
  @scala.inline
  def apply(mutationId: String): OptimisticResponse = {
    val __obj = js.Dynamic.literal(mutationId = mutationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
  @scala.inline
  implicit class OptimisticResponseOps[Self <: OptimisticResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMutationId(value: String): Self = this.set("mutationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimisticResponse(value: js.Any): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
  }
  
}

