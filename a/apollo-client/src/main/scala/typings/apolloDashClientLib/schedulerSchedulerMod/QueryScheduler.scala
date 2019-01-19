package typings
package apolloDashClientLib.schedulerSchedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/scheduler/scheduler", "QueryScheduler")
@js.native
class QueryScheduler[TCacheShape] protected () extends js.Object {
  def this(hasQueryManagerSsrMode: apolloDashClientLib.Anon_QueryManager[TCacheShape]) = this()
  var inFlightQueries: org.scalablytyped.runtime.StringDictionary[
    apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.native
  var intervalQueries: org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]] = js.native
  var pollingTimers: js.Any = js.native
  var queryManager: apolloDashClientLib.coreQueryManagerMod.QueryManager[TCacheShape] = js.native
  var registeredQueries: org.scalablytyped.runtime.StringDictionary[
    apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ] = js.native
  var ssrMode: js.Any = js.native
  def addQueryOnInterval[T](
    queryId: java.lang.String,
    queryOptions: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): scala.Unit = js.native
  def checkInFlight(queryId: java.lang.String): scala.Boolean = js.native
  def fetchQueriesOnInterval[T](interval: scala.Double): scala.Unit = js.native
  def fetchQuery[T](
    queryId: java.lang.String,
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    fetchType: apolloDashClientLib.coreTypesMod.FetchType
  ): js.Promise[js.Object] = js.native
  def registerPollingQuery[T](
    queryOptions: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables]
  ): apolloDashClientLib.coreObservableQueryMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables] = js.native
  def startPollingQuery[T](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    queryId: java.lang.String
  ): java.lang.String = js.native
  def startPollingQuery[T](
    options: apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables],
    queryId: java.lang.String,
    listener: apolloDashClientLib.coreTypesMod.QueryListener
  ): java.lang.String = js.native
  def stop(): scala.Unit = js.native
  def stopPollingQuery(queryId: java.lang.String): scala.Unit = js.native
}

