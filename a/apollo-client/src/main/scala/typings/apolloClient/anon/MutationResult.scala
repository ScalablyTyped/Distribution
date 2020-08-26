package typings.apolloClient.anon

import typings.apolloLink.typesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResult[T] extends js.Object {
  var mutationResult: FetchResult[T, Record[String, _], Record[String, _]] = js.native
  var queryName: js.UndefOr[String] = js.native
  var queryVariables: Record[String, _] = js.native
}

object MutationResult {
  @scala.inline
  def apply[T](
    mutationResult: FetchResult[T, Record[String, _], Record[String, _]],
    queryVariables: Record[String, _]
  ): MutationResult[T] = {
    val __obj = js.Dynamic.literal(mutationResult = mutationResult.asInstanceOf[js.Any], queryVariables = queryVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[T]]
  }
  @scala.inline
  implicit class MutationResultOps[Self <: MutationResult[_], T] (val x: Self with MutationResult[T]) extends AnyVal {
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
    def setMutationResult(value: FetchResult[T, Record[String, _], Record[String, _]]): Self = this.set("mutationResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryVariables(value: Record[String, _]): Self = this.set("queryVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryName(value: String): Self = this.set("queryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryName: Self = this.set("queryName", js.undefined)
  }
  
}

