package typings.apolloReactHooks

import typings.apolloReactHooks.typesMod.SubscriptionHookOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hooks/lib/useSubscription", JSImport.Namespace)
@js.native
object useSubscriptionMod extends js.Object {
  def useSubscription[TData, TVariables](subscription: DocumentNode): AnonDataError[TVariables, TData] = js.native
  def useSubscription[TData, TVariables](subscription: DocumentNode, options: SubscriptionHookOptions[TData, TVariables]): AnonDataError[TVariables, TData] = js.native
}

