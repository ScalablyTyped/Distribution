package typings.apolloReactHooks

import typings.apolloReactCommon.typesMod.QueryResult
import typings.apolloReactHooks.typesMod.QueryHookOptions
import typings.apolloReactHooks.typesMod.QueryTuple
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/utils/useBaseQuery", JSImport.Namespace)
@js.native
object useBaseQueryMod extends js.Object {
  def useBaseQuery[TData, TVariables](query: DocumentNode): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables], `lazy`: Boolean): (QueryTuple[TData, TVariables]) | (QueryResult[TData, TVariables]) = js.native
}

