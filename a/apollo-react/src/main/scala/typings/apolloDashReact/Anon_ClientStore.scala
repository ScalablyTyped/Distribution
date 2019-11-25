package typings.apolloDashReact

import typings.apolloDashClient.apolloDashClientMod.default
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientStore extends js.Object {
  var client: default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
  ]
  var store: Store[_, AnyAction]
}

object Anon_ClientStore {
  @scala.inline
  def apply(
    client: default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
    ],
    store: Store[_, AnyAction]
  ): Anon_ClientStore = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientStore]
  }
}

