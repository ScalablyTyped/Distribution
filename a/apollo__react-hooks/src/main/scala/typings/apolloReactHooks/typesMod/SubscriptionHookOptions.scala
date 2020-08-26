package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionHookOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var subscription: js.UndefOr[DocumentNode] = js.native
}

object SubscriptionHookOptions {
  @scala.inline
  def apply[TData, TVariables](): SubscriptionHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionHookOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class SubscriptionHookOptionsOps[Self <: SubscriptionHookOptions[_, _], TData, TVariables] (val x: Self with (SubscriptionHookOptions[TData, TVariables])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscription(value: DocumentNode): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

