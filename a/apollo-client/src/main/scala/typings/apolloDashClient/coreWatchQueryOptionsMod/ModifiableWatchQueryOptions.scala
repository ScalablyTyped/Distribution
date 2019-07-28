package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifiableWatchQueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var returnPartialData: js.UndefOr[Boolean] = js.undefined
}

object ModifiableWatchQueryOptions {
  @scala.inline
  def apply[TVariables](
    query: DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchResults: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): ModifiableWatchQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiableWatchQueryOptions[TVariables]]
  }
}

