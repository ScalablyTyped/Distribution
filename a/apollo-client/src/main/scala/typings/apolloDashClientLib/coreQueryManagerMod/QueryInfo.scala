package typings
package apolloDashClientLib.coreQueryManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var document: graphqlLib.languageAstMod.DocumentNode | scala.Null
  var invalidated: scala.Boolean
  var lastRequestId: scala.Double | scala.Null
  var listeners: js.Array[apolloDashClientLib.coreTypesMod.QueryListener]
  var newData: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Cache.DiffResult<any> */ js.Any) | scala.Null
  var observableQuery: (apolloDashClientLib.coreObservableQueryMod.ObservableQuery[_, apolloDashClientLib.coreTypesMod.OperationVariables]) | scala.Null
  var subscriptions: js.Array[apolloDashClientLib.utilObservableMod.Subscription]
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: scala.Boolean,
    listeners: js.Array[apolloDashClientLib.coreTypesMod.QueryListener],
    subscriptions: js.Array[apolloDashClientLib.utilObservableMod.Subscription],
    cancel: js.Function0[scala.Unit] = null,
    document: graphqlLib.languageAstMod.DocumentNode = null,
    lastRequestId: scala.Int | scala.Double = null,
    newData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Cache.DiffResult<any> */ js.Any = null,
    observableQuery: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[_, apolloDashClientLib.coreTypesMod.OperationVariables] = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated, listeners = listeners, subscriptions = subscriptions)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (document != null) __obj.updateDynamic("document")(document)
    if (lastRequestId != null) __obj.updateDynamic("lastRequestId")(lastRequestId.asInstanceOf[js.Any])
    if (newData != null) __obj.updateDynamic("newData")(newData)
    if (observableQuery != null) __obj.updateDynamic("observableQuery")(observableQuery)
    __obj.asInstanceOf[QueryInfo]
  }
}

