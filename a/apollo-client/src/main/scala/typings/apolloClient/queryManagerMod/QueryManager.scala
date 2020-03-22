package typings.apolloClient.queryManagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloClient.AnonAssumeImmutableResults
import typings.apolloClient.AnonData
import typings.apolloClient.AnonDocument
import typings.apolloClient.ReadonlydocumentReadonlyD
import typings.apolloClient.localStateMod.LocalState
import typings.apolloClient.mutationsMod.MutationStore
import typings.apolloClient.observableMod.Observable
import typings.apolloClient.observableMod.Observer
import typings.apolloClient.observableQueryMod.ObservableQuery
import typings.apolloClient.queriesMod.QueryStore
import typings.apolloClient.storeMod.DataStore
import typings.apolloClient.typesMod.ApolloQueryResult
import typings.apolloClient.typesMod.FetchType
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.typesMod.QueryListener
import typings.apolloClient.watchQueryOptionsMod.MutationOptions
import typings.apolloClient.watchQueryOptionsMod.QueryOptions
import typings.apolloClient.watchQueryOptionsMod.SubscriptionOptions
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/QueryManager", "QueryManager")
@js.native
class QueryManager[TStore] protected () extends js.Object {
  def this(hasLinkQueryDeduplicationStoreOnBroadcastSsrModeClientAwarenessLocalStateAssumeImmutableResults: AnonAssumeImmutableResults[TStore]) = this()
  val assumeImmutableResults: Boolean = js.native
  var clientAwareness: js.Any = js.native
  var dataStore: DataStore[TStore] = js.native
  var fetchQueryRejectFns: js.Any = js.native
  var fetchRequest: js.Any = js.native
  var getObservableFromLink: js.Any = js.native
  var getQuery: js.Any = js.native
  var getVariables: js.Any = js.native
  var idCounter: js.Any = js.native
  var inFlightLinkObservables: js.Any = js.native
  var invalidate: js.Any = js.native
  var link: ApolloLink = js.native
  var localState: js.Any = js.native
  var markQueryResult: js.Any = js.native
  var mutationStore: MutationStore = js.native
  var onBroadcast: js.Any = js.native
  var pollingInfoByQueryId: js.Any = js.native
  var prepareContext: js.Any = js.native
  var queries: js.Any = js.native
  var queryDeduplication: js.Any = js.native
  var queryStore: QueryStore = js.native
  var setQuery: js.Any = js.native
  var ssrMode: js.Any = js.native
  var stopQueryInStoreNoBroadcast: js.Any = js.native
  var stopQueryNoBroadcast: js.Any = js.native
  var transformCache: js.Any = js.native
  def addObservableQuery[T](queryId: String, observableQuery: ObservableQuery[T, OperationVariables]): Unit = js.native
  def addQueryListener(queryId: String, listener: QueryListener): Unit = js.native
  def broadcastQueries(): Unit = js.native
  def checkInFlight(queryId: String): Boolean = js.native
  def clearStore(): js.Promise[Unit] = js.native
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables]): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], fetchType: FetchType): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def fetchQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    fetchType: FetchType,
    fetchMoreForQueryId: String
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def generateQueryId(): String = js.native
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables]): AnonData[T] = js.native
  def getCurrentQueryResult[T](observableQuery: ObservableQuery[T, OperationVariables], optimistic: Boolean): AnonData[T] = js.native
  def getLocalState(): LocalState[TStore] = js.native
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: String): AnonDocument[TVariables] = js.native
  def getQueryWithPreviousResult[TData, TVariables](queryIdOrObservable: ObservableQuery[TData, TVariables]): AnonDocument[TVariables] = js.native
  def mutate[T](
    hasMutationVariablesOptimisticResponseUpdateQueriesRefetchQueriesAwaitRefetchQueriesUpdateErrorPolicyFetchPolicyContext: MutationOptions[StringDictionary[_], OperationVariables]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def observeQuery[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): js.Promise[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def query[T](options: QueryOptions[OperationVariables]): js.Promise[ApolloQueryResult[T]] = js.native
  def queryListenerForObserver[T](
    queryId: String,
    options: WatchQueryOptions[OperationVariables],
    observer: Observer[ApolloQueryResult[T]]
  ): QueryListener = js.native
  def reFetchObservableQueries(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def reFetchObservableQueries(includeStandby: Boolean): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def removeObservableQuery(queryId: String): Unit = js.native
  def removeQuery(queryId: String): Unit = js.native
  def resetStore(): js.Promise[js.Array[ApolloQueryResult[_]]] = js.native
  def startGraphQLSubscription[T](hasQueryFetchPolicyVariables: SubscriptionOptions[OperationVariables]): Observable[FetchResult[T, Record[String, _], Record[String, _]]] = js.native
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String): String = js.native
  def startPollingQuery(options: WatchQueryOptions[OperationVariables], queryId: String, listener: QueryListener): String = js.native
  def startQuery[T](queryId: String, options: WatchQueryOptions[OperationVariables], listener: QueryListener): String = js.native
  def stop(): Unit = js.native
  def stopPollingQuery(queryId: String): Unit = js.native
  def stopQuery(queryId: String): Unit = js.native
  def stopQueryInStore(queryId: String): Unit = js.native
  def transform(document: DocumentNode): ReadonlydocumentReadonlyD = js.native
  def updateQueryWatch(queryId: String, document: DocumentNode, options: WatchQueryOptions[OperationVariables]): js.Function0[Unit] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables]): ObservableQuery[T, TVariables] = js.native
  def watchQuery[T, TVariables](options: WatchQueryOptions[OperationVariables], shouldSubscribe: Boolean): ObservableQuery[T, TVariables] = js.native
}

