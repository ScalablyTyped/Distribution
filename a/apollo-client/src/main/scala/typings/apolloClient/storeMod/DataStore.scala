package typings.apolloClient.storeMod

import typings.apolloCache.mod.ApolloCache
import typings.apolloClient.AnonDocumentMutationId
import typings.apolloClient.AnonDocumentMutationIdMutationResult
import typings.apolloClient.AnonMutationId
import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/data/store", "DataStore")
@js.native
class DataStore[TSerialized] protected () extends js.Object {
  def this(initialCache: ApolloCache[TSerialized]) = this()
  var cache: js.Any = js.native
  def getCache(): ApolloCache[TSerialized] = js.native
  def markMutationComplete(hasMutationIdOptimisticResponse: AnonMutationId): Unit = js.native
  def markMutationInit(mutation: AnonDocumentMutationId): Unit = js.native
  def markMutationResult(mutation: AnonDocumentMutationIdMutationResult): Unit = js.native
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

