package typings.apolloDashClient.dataStoreMod

import typings.apolloDashCache.apolloDashCacheMod.ApolloCache
import typings.apolloDashClient.Anon_DocumentMutationId
import typings.apolloDashClient.Anon_DocumentMutationIdMutationResult
import typings.apolloDashClient.Anon_MutationId
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/store", "DataStore")
@js.native
class DataStore[TSerialized] protected () extends js.Object {
  def this(initialCache: ApolloCache[TSerialized]) = this()
  var cache: js.Any = js.native
  def getCache(): ApolloCache[TSerialized] = js.native
  def markMutationComplete(hasMutationIdOptimisticResponse: Anon_MutationId): Unit = js.native
  def markMutationInit(mutation: Anon_DocumentMutationId): Unit = js.native
  def markMutationResult(mutation: Anon_DocumentMutationIdMutationResult): Unit = js.native
  def markQueryResult(result: ExecutionResult[ExecutionResultDataDefault], document: DocumentNode, variables: js.Any): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[ExecutionResultDataDefault],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: js.UndefOr[scala.Nothing],
    ignoreErrors: Boolean
  ): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[ExecutionResultDataDefault],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: String
  ): Unit = js.native
  def markQueryResult(
    result: ExecutionResult[ExecutionResultDataDefault],
    document: DocumentNode,
    variables: js.Any,
    fetchMoreForQueryId: String,
    ignoreErrors: Boolean
  ): Unit = js.native
  def markSubscriptionResult(result: ExecutionResult[ExecutionResultDataDefault], document: DocumentNode, variables: js.Any): Unit = js.native
  def markUpdateQueryResult(document: DocumentNode, variables: js.Any, newResult: js.Any): Unit = js.native
  def reset(): js.Promise[Unit] = js.native
}

