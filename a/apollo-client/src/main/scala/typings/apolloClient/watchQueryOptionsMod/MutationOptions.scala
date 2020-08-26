package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[T, TVariables] extends MutationBaseOptions[T, TVariables] {
  var context: js.UndefOr[js.Any] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var mutation: DocumentNode = js.native
}

object MutationOptions {
  @scala.inline
  def apply[T, TVariables](mutation: DocumentNode): MutationOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[T, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self <: MutationOptions[_, _], T, TVariables] (val x: Self with (MutationOptions[T, TVariables])) extends AnyVal {
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
    def setMutation(value: DocumentNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
  }
  
}

