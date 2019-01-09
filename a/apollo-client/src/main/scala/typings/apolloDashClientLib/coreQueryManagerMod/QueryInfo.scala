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

