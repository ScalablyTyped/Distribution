package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.default
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSubscriptionOptions[TData, TVariables] extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.native
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var onSubscriptionComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onSubscriptionData: js.UndefOr[js.Function1[/* options */ OnSubscriptionDataOptions[TData], _]] = js.native
  var shouldResubscribe: js.UndefOr[
    Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])
  ] = js.native
  var skip: js.UndefOr[Boolean] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object BaseSubscriptionOptions {
  @scala.inline
  def apply[TData, TVariables](): BaseSubscriptionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSubscriptionOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class BaseSubscriptionOptionsOps[Self <: BaseSubscriptionOptions[_, _], TData, TVariables] (val x: Self with (BaseSubscriptionOptions[TData, TVariables])) extends AnyVal {
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
    def setClient(value: default[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setOnSubscriptionComplete(value: () => Unit): Self = this.set("onSubscriptionComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSubscriptionComplete: Self = this.set("onSubscriptionComplete", js.undefined)
    @scala.inline
    def setOnSubscriptionData(value: /* options */ OnSubscriptionDataOptions[TData] => _): Self = this.set("onSubscriptionData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubscriptionData: Self = this.set("onSubscriptionData", js.undefined)
    @scala.inline
    def setShouldResubscribeFunction1(value: /* options */ BaseSubscriptionOptions[TData, TVariables] => Boolean): Self = this.set("shouldResubscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldResubscribe(value: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])): Self = this.set("shouldResubscribe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldResubscribe: Self = this.set("shouldResubscribe", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

