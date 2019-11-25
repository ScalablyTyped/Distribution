package typings.apolloDashClient.coreQueryManagerMod

import typings.apolloDashCache.libTypesCacheMod.Cache.DiffResult
import typings.apolloDashClient.coreObservableQueryMod.ObservableQuery
import typings.apolloDashClient.coreTypesMod.OperationVariables
import typings.apolloDashClient.coreTypesMod.QueryListener
import typings.apolloDashClient.utilObservableMod.Subscription
import typings.graphql.languageAstMod.DocumentNode
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var document: DocumentNode | Null
  var invalidated: Boolean
  var lastRequestId: Double
  var listeners: Set[QueryListener]
  var newData: DiffResult[_] | Null
  var observableQuery: (ObservableQuery[_, OperationVariables]) | Null
  var subscriptions: Set[Subscription]
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: Boolean,
    lastRequestId: Double,
    listeners: Set[QueryListener],
    subscriptions: Set[Subscription],
    cancel: () => Unit = null,
    document: DocumentNode = null,
    newData: DiffResult[_] = null,
    observableQuery: ObservableQuery[_, OperationVariables] = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated.asInstanceOf[js.Any], lastRequestId = lastRequestId.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (observableQuery != null) __obj.updateDynamic("observableQuery")(observableQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

