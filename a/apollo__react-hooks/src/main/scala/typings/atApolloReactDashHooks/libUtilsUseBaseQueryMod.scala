package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typings.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typings.atApolloReactDashHooks.libTypesMod.QueryLazyOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/utils/useBaseQuery", JSImport.Namespace)
@js.native
object libUtilsUseBaseQueryMod extends js.Object {
  def useBaseQuery[TData, TVariables](query: DocumentNode): (QueryResult[TData, TVariables]) | (js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): (QueryResult[TData, TVariables]) | (js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ]) = js.native
  def useBaseQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables], `lazy`: Boolean): (QueryResult[TData, TVariables]) | (js.Tuple2[
    js.Function1[/* options */ js.UndefOr[QueryLazyOptions[TVariables]], Unit], 
    QueryResult[TData, TVariables]
  ]) = js.native
}

