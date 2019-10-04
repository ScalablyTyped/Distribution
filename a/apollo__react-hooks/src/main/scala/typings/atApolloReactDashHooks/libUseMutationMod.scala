package typings.atApolloReactDashHooks

import typings.atApolloReactDashHooks.libTypesMod.MutationHookOptions
import typings.atApolloReactDashHooks.libTypesMod.MutationTuple
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useMutation", JSImport.Namespace)
@js.native
object libUseMutationMod extends js.Object {
  def useMutation[TData, TVariables](mutation: DocumentNode): MutationTuple[TData, TVariables] = js.native
  def useMutation[TData, TVariables](mutation: DocumentNode, options: MutationHookOptions[TData, TVariables]): MutationTuple[TData, TVariables] = js.native
}

