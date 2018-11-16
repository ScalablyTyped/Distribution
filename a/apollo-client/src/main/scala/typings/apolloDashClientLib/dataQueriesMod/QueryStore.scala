package typings
package apolloDashClientLib.dataQueriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/queries", "QueryStore")
@js.native
class QueryStore () extends js.Object {
  var store: js.Any = js.native
  def get(queryId: java.lang.String): QueryStoreValue = js.native
  def getStore(): ScalablyTyped.runtime.StringDictionary[QueryStoreValue] = js.native
  def initQuery(query: apolloDashClientLib.Anon_QueryId): scala.Unit = js.native
  def markQueryError(queryId: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  def markQueryError(queryId: java.lang.String, error: stdLib.Error, fetchMoreForQueryId: java.lang.String): scala.Unit = js.native
  def markQueryResult(
    queryId: java.lang.String,
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ): scala.Unit = js.native
  def markQueryResult(
    queryId: java.lang.String,
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    fetchMoreForQueryId: java.lang.String
  ): scala.Unit = js.native
  def markQueryResultClient(queryId: java.lang.String, complete: scala.Boolean): scala.Unit = js.native
  def reset(observableQueryIds: js.Array[java.lang.String]): scala.Unit = js.native
  def stopQuery(queryId: java.lang.String): scala.Unit = js.native
}

