package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchMoreQueryOptions[TVariables, K /* <: String */] extends js.Object {
  var query: js.UndefOr[DocumentNode] = js.undefined
  var variables: js.UndefOr[Pick[TVariables, K]] = js.undefined
}

object FetchMoreQueryOptions {
  @scala.inline
  def apply[TVariables, K /* <: String */](query: DocumentNode = null, variables: Pick[TVariables, K] = null): FetchMoreQueryOptions[TVariables, K] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMoreQueryOptions[TVariables, K]]
  }
}

