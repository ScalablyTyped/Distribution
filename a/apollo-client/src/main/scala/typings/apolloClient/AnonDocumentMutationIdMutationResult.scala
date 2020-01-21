package typings.apolloClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.storeMod.QueryWithUpdater
import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentMutationIdMutationResult extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var result: ExecutionResult[ExecutionResultDataDefault]
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object AnonDocumentMutationIdMutationResult {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[ExecutionResultDataDefault],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit = null
  ): AnonDocumentMutationIdMutationResult = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[AnonDocumentMutationIdMutationResult]
  }
}

