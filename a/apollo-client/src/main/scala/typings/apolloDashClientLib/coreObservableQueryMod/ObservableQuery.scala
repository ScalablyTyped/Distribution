package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", "ObservableQuery")
@js.native
class ObservableQuery[TData, TVariables] protected ()
  extends apolloDashClientLib.utilObservableMod.Observable[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] {
  def this(hasQueryManagerOptionsShouldSubscribe: apolloDashClientLib.Anon_Options[TVariables]) = this()
  var isTornDown: js.Any = js.native
  var lastError: js.Any = js.native
  var lastResult: js.Any = js.native
  var lastResultSnapshot: js.Any = js.native
  var observers: js.Any = js.native
  var onSubscribe: js.Any = js.native
  var options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[TVariables] = js.native
  var queryId: java.lang.String = js.native
  var queryManager: js.Any = js.native
  var setUpQuery: js.Any = js.native
  var shouldSubscribe: js.Any = js.native
  var subscriptionHandles: js.Any = js.native
  var tearDownQuery: js.Any = js.native
  var variables: TVariables = js.native
  def currentResult(): ApolloCurrentResult[TData] = js.native
  def fetchMore[K /* <: java.lang.String */](
    fetchMoreOptions: (apolloDashClientLib.coreWatchQueryOptionsMod.FetchMoreQueryOptions[TVariables, K]) with (FetchMoreOptions[TData, TVariables])
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def getCurrentResult(): ApolloCurrentQueryResult[TData] = js.native
  def getLastError(): apolloDashClientLib.errorsApolloErrorMod.ApolloError = js.native
  def getLastResult(): apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData] = js.native
  def isDifferentFromLastResult(newResult: apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]): scala.Boolean = js.native
  def refetch(): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def refetch(variables: TVariables): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def resetLastResults(): scala.Unit = js.native
  def result(): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def setOptions(
    opts: apolloDashClientLib.coreWatchQueryOptionsMod.ModifiableWatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def setVariables(variables: TVariables): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def setVariables(variables: TVariables, tryFetch: scala.Boolean): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def setVariables(variables: TVariables, tryFetch: scala.Boolean, fetchResults: scala.Boolean): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[TData]] = js.native
  def startPolling(pollInterval: scala.Double): scala.Unit = js.native
  def stopPolling(): scala.Unit = js.native
  def subscribeToMore[TSubscriptionData](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.SubscribeToMoreOptions[TData, TVariables, TSubscriptionData]
  ): js.Function0[scala.Unit] = js.native
  def updateQuery(
    mapFn: js.Function2[/* previousQueryResult */ TData, /* options */ UpdateQueryOptions[TVariables], TData]
  ): scala.Unit = js.native
}

