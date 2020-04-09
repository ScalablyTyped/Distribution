package typings.apolloReactHooks

import typings.apolloReactHooks.typesMod.LazyQueryHookOptions
import typings.apolloReactHooks.typesMod.QueryTuple
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useLazyQuery", JSImport.Namespace)
@js.native
object useLazyQueryMod extends js.Object {
  def useLazyQuery[TData, TVariables](query: DocumentNode): QueryTuple[TData, TVariables] = js.native
  def useLazyQuery[TData, TVariables](query: DocumentNode, options: LazyQueryHookOptions[TData, TVariables]): QueryTuple[TData, TVariables] = js.native
}

