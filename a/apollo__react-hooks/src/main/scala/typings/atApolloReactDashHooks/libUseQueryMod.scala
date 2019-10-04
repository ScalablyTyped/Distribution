package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libTypesTypesMod.QueryResult
import typings.atApolloReactDashHooks.libTypesMod.QueryHookOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useQuery", JSImport.Namespace)
@js.native
object libUseQueryMod extends js.Object {
  def useQuery[TData, TVariables](query: DocumentNode): QueryResult[TData, TVariables] = js.native
  def useQuery[TData, TVariables](query: DocumentNode, options: QueryHookOptions[TData, TVariables]): QueryResult[TData, TVariables] = js.native
}

