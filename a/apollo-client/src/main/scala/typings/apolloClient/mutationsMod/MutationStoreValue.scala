package typings.apolloClient.mutationsMod

import typings.graphql.astMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationStoreValue extends js.Object {
  var error: Error | Null
  var loading: Boolean
  var mutation: DocumentNode
  var variables: js.Object
}

object MutationStoreValue {
  @scala.inline
  def apply(loading: Boolean, mutation: DocumentNode, variables: js.Object, error: Error = null): MutationStoreValue = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationStoreValue]
  }
}

