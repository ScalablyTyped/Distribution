package typings.apolloClient.mutationsMod

import typings.graphql.astMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationStoreValue extends js.Object {
  var error: Error | Null = js.native
  var loading: Boolean = js.native
  var mutation: DocumentNode = js.native
  var variables: js.Object = js.native
}

object MutationStoreValue {
  @scala.inline
  def apply(loading: Boolean, mutation: DocumentNode, variables: js.Object): MutationStoreValue = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationStoreValue]
  }
  @scala.inline
  implicit class MutationStoreValueOps[Self <: MutationStoreValue] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutation(value: DocumentNode): Self = this.set("mutation", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
  }
  
}

