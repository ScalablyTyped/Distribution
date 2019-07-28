package typings.apolloDashClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
import typings.apolloDashClient.dataStoreMod.QueryWithUpdater
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentMutationId extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Object | js.Function] = js.undefined
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object Anon_DocumentMutationId {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    optimisticResponse: js.Object | js.Function = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit = null
  ): Anon_DocumentMutationId = {
    val __obj = js.Dynamic.literal(document = document, mutationId = mutationId, updateQueries = updateQueries, variables = variables)
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[Anon_DocumentMutationId]
  }
}

