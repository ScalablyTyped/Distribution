package typings.apolloClient.watchQueryOptionsMod

import typings.graphql.astMod.DocumentNode
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreQueryOptions[TVariables, K /* <: /* keyof TVariables */ String */] extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[DocumentNode] = js.undefined
  var variables: js.UndefOr[Pick[TVariables, K]] = js.undefined
}

object FetchMoreQueryOptions {
  @scala.inline
  def apply[TVariables, K](context: js.Any = null, query: DocumentNode = null, variables: Pick[TVariables, K] = null): FetchMoreQueryOptions[TVariables, K] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMoreQueryOptions[TVariables, K]]
  }
}

