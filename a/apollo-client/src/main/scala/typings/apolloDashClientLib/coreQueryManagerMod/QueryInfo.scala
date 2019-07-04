package typings
package apolloDashClientLib.coreQueryManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var document: graphqlLib.languageAstMod.DocumentNode | scala.Null
  var invalidated: scala.Boolean
  var lastRequestId: scala.Double
  var listeners: stdLib.Set[apolloDashClientLib.coreTypesMod.QueryListener]
  var newData: apolloDashCacheLib.libTypesCacheMod.CacheNs.DiffResult[_] | scala.Null
  var observableQuery: (apolloDashClientLib.coreObservableQueryMod.ObservableQuery[_, apolloDashClientLib.coreTypesMod.OperationVariables]) | scala.Null
  var subscriptions: stdLib.Set[apolloDashClientLib.utilObservableMod.Subscription]
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: scala.Boolean,
    lastRequestId: scala.Double,
    listeners: stdLib.Set[apolloDashClientLib.coreTypesMod.QueryListener],
    subscriptions: stdLib.Set[apolloDashClientLib.utilObservableMod.Subscription],
    cancel: () => scala.Unit = null,
    document: graphqlLib.languageAstMod.DocumentNode = null,
    newData: apolloDashCacheLib.libTypesCacheMod.CacheNs.DiffResult[_] = null,
    observableQuery: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[_, apolloDashClientLib.coreTypesMod.OperationVariables] = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated, lastRequestId = lastRequestId, listeners = listeners, subscriptions = subscriptions)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (document != null) __obj.updateDynamic("document")(document)
    if (newData != null) __obj.updateDynamic("newData")(newData)
    if (observableQuery != null) __obj.updateDynamic("observableQuery")(observableQuery)
    __obj.asInstanceOf[QueryInfo]
  }
}

