package typings.apolloReact.anon

import typings.apolloClient.mod.default
import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var client: default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ] = js.native
  var store: typings.redux.mod.Store[_, AnyAction] = js.native
}

object Store {
  @scala.inline
  def apply(
    client: default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ],
    store: typings.redux.mod.Store[_, AnyAction]
  ): Store = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setClient(
      value: default[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
        ]
    ): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: typings.redux.mod.Store[_, AnyAction]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

