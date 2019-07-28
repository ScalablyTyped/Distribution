package typings.apolloDashClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
import typings.apolloDashClient.dataStoreMod.QueryWithUpdater
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentMutationIdMutationResult extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var result: ExecutionResult[ExecutionResultDataDefault]
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object Anon_DocumentMutationIdMutationResult {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    result: ExecutionResult[ExecutionResultDataDefault],
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit = null
  ): Anon_DocumentMutationIdMutationResult = {
    val __obj = js.Dynamic.literal(document = document, mutationId = mutationId, result = result, updateQueries = updateQueries, variables = variables)
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Anon_DocumentMutationIdMutationResult]
  }
}

