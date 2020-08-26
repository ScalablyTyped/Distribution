package typings.apolloClient.watchQueryOptionsMod

import typings.apolloClient.anon.SubscriptionData
import typings.graphql.astMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] extends js.Object {
  var document: DocumentNode = js.native
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var updateQuery: js.UndefOr[UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData]] = js.native
  var variables: js.UndefOr[TSubscriptionVariables] = js.native
}

object SubscribeToMoreOptions {
  @scala.inline
  def apply[TData, TSubscriptionVariables, TSubscriptionData](document: DocumentNode): SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData]]
  }
  @scala.inline
  implicit class SubscribeToMoreOptionsOps[Self <: SubscribeToMoreOptions[_, _, _], TData, TSubscriptionVariables, TSubscriptionData] (val x: Self with (SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData])) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setUpdateQuery(value: (TData, /* options */ SubscriptionData[TSubscriptionData, TSubscriptionVariables]) => TData): Self = this.set("updateQuery", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateQuery: Self = this.set("updateQuery", js.undefined)
    @scala.inline
    def setVariables(value: TSubscriptionVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

