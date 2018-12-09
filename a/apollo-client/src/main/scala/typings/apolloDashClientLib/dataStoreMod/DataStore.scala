package typings
package apolloDashClientLib.dataStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/store", "DataStore")
@js.native
class DataStore[TSerialized] protected () extends js.Object {
  def this(initialCache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TSerialized]) = this()
  var cache: js.Any = js.native
  def getCache(): apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TSerialized] = js.native
  def markMutationComplete(hasMutationIdOptimisticResponse: apolloDashClientLib.Anon_OptimisticResponse): scala.Unit = js.native
  def markMutationInit(mutation: apolloDashClientLib.Anon_Document): scala.Unit = js.native
  def markMutationResult(mutation: apolloDashClientLib.Anon_DocumentResult): scala.Unit = js.native
  def markQueryResult(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Any
  ): scala.Unit = js.native
  def markQueryResult(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: java.lang.String
  ): scala.Unit = js.native
  def markQueryResult(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: java.lang.String,
    ignoreErrors: scala.Boolean
  ): scala.Unit = js.native
  def markQueryResult(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: js.UndefOr[scala.Nothing],
    ignoreErrors: scala.Boolean
  ): scala.Unit = js.native
  def markSubscriptionResult(
    result: graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault],
    document: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Any
  ): scala.Unit = js.native
  def markUpdateQueryResult(document: graphqlLib.languageAstMod.DocumentNode, variables: js.Any, newResult: js.Any): scala.Unit = js.native
  def reset(): js.Promise[scala.Unit] = js.native
}

