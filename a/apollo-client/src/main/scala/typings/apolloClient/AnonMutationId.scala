package typings.apolloClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.storeMod.QueryWithUpdater
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMutationId extends js.Object {
  var document: DocumentNode
  var mutationId: String
  var optimisticResponse: js.UndefOr[js.Object | js.Function] = js.undefined
  var update: js.UndefOr[js.Function2[/* proxy */ DataProxy, /* mutationResult */ js.Object, Unit]] = js.undefined
  var updateQueries: StringDictionary[QueryWithUpdater]
  var variables: js.Any
}

object AnonMutationId {
  @scala.inline
  def apply(
    document: DocumentNode,
    mutationId: String,
    updateQueries: StringDictionary[QueryWithUpdater],
    variables: js.Any,
    optimisticResponse: js.Object | js.Function = null,
    update: (/* proxy */ DataProxy, /* mutationResult */ js.Object) => Unit = null
  ): AnonMutationId = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], mutationId = mutationId.asInstanceOf[js.Any], updateQueries = updateQueries.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[AnonMutationId]
  }
}

