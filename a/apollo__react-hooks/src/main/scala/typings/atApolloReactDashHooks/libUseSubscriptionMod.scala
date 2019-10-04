package typings.atApolloReactDashHooks

import typings.atApolloReactDashHooks.libTypesMod.SubscriptionHookOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useSubscription", JSImport.Namespace)
@js.native
object libUseSubscriptionMod extends js.Object {
  def useSubscription[TData, TVariables](subscription: DocumentNode): Anon_Data[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): Anon_Data[TVariables, TData] = js.native
}

