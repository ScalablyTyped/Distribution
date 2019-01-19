package typings
package apolloDashClientLib.coreQueryManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/QueryManager", "QueryManager")
@js.native
class QueryManager[TStore] protected () extends js.Object {
  def this(hasLinkQueryDeduplicationStoreOnBroadcastSsrModeClientAwareness: apolloDashClientLib.Anon_ClientAwareness[TStore]) = this()
  var buildOperationForLink: js.Any = js.native
  var clientAwareness: js.Any = js.native
  var dataStore: apolloDashClientLib.dataStoreMod.DataStore[TStore] = js.native
  var deduplicator: js.Any = js.native
  var fetchQueryRejectFns: js.Any = js.native
  var fetchRequest: js.Any = js.native
  var generateRequestId: js.Any = js.native
  var getObservableQueryPromises: js.Any = js.native
  var getQuery: js.Any = js.native
  var idCounter: js.Any = js.native
  var invalidate: js.Any = js.native
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink = js.native
  var mutationStore: apolloDashClientLib.dataMutationsMod.MutationStore = js.native
  var onBroadcast: js.Any = js.native
  var queries: js.Any = js.native
  var queryDeduplication: js.Any = js.native
  var queryIdsByName: js.Any = js.native
  var queryStore: apolloDashClientLib.dataQueriesMod.QueryStore = js.native
  var refetchQueryByName: js.Any = js.native
  var scheduler: apolloDashClientLib.schedulerSchedulerMod.QueryScheduler[TStore] = js.native
  var setQuery: js.Any = js.native
  def addObservableQuery[T](
    queryId: java.lang.String,
    observableQuery: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables]
  ): scala.Unit = js.native
  def addQueryListener(queryId: java.lang.String, listener: apolloDashClientLib.coreTypesMod.QueryListener): scala.Unit = js.native
  def broadcastQueries(): scala.Unit = js.native
  def clearStore(): js.Promise[scala.Unit] = js.native
  def fetchQuery[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): js.Promise[
    apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def fetchQuery[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    fetchType: apolloDashClientLib.coreTypesMod.FetchType
  ): js.Promise[
    apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def fetchQuery[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    fetchType: apolloDashClientLib.coreTypesMod.FetchType,
    fetchMoreForQueryId: java.lang.String
  ): js.Promise[
    apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def generateQueryId(): java.lang.String = js.native
  def getCurrentQueryResult[T](
    observableQuery: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables]
  ): apolloDashClientLib.Anon_Data = js.native
  def getCurrentQueryResult[T](
    observableQuery: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables],
    optimistic: scala.Boolean
  ): apolloDashClientLib.Anon_Data = js.native
  def getQueryWithPreviousResult[T](
    queryIdOrObservable: apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables]
  ): apolloDashClientLib.Anon_Document = js.native
  def getQueryWithPreviousResult[T](queryIdOrObservable: java.lang.String): apolloDashClientLib.Anon_Document = js.native
  def mutate[T](
    hasMutationVariablesOptimisticResponseUpdateQueriesRefetchQueriesAwaitRefetchQueriesUpdateErrorPolicyFetchPolicyContext: apolloDashClientLib.coreWatchQueryOptionsMod.MutationOptions[
      org.scalablytyped.runtime.StringDictionary[_], 
      apolloDashClientLib.coreTypesMod.OperationVariables
    ]
  ): js.Promise[
    apolloDashLinkLib.libTypesMod.FetchResult[T, stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def query[T](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.QueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): js.Promise[apolloDashClientLib.coreTypesMod.ApolloQueryResult[T]] = js.native
  def queryListenerForObserver[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    observer: apolloDashClientLib.utilObservableMod.Observer[apolloDashClientLib.coreTypesMod.ApolloQueryResult[T]]
  ): apolloDashClientLib.coreTypesMod.QueryListener = js.native
  def reFetchObservableQueries(): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]] = js.native
  def reFetchObservableQueries(includeStandby: scala.Boolean): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]] = js.native
  def removeObservableQuery(queryId: java.lang.String): scala.Unit = js.native
  def removeQuery(queryId: java.lang.String): scala.Unit = js.native
  def resetStore(): js.Promise[js.Array[apolloDashClientLib.coreTypesMod.ApolloQueryResult[_]]] = js.native
  def startGraphQLSubscription(
    options: apolloDashClientLib.coreWatchQueryOptionsMod.SubscriptionOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): apolloDashClientLib.utilObservableMod.Observable[_] = js.native
  def startQuery[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    listener: apolloDashClientLib.coreTypesMod.QueryListener
  ): java.lang.String = js.native
  def stop(): scala.Unit = js.native
  def stopQuery(queryId: java.lang.String): scala.Unit = js.native
  def stopQueryInStore(queryId: java.lang.String): scala.Unit = js.native
  def updateQueryWatch(
    queryId: java.lang.String,
    document: graphqlLib.languageAstMod.DocumentNode,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): js.Function0[scala.Unit] = js.native
  def watchQuery[T, TVariables](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, TVariables] = js.native
  def watchQuery[T, TVariables](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    shouldSubscribe: scala.Boolean
  ): apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, TVariables] = js.native
}

