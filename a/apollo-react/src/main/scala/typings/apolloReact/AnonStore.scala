package typings.apolloReact

import typings.apolloClient.mod.default
import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStore extends js.Object {
  var client: default[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
  ]
  var store: Store[_, AnyAction]
}

object AnonStore {
  @scala.inline
  def apply(
    client: default[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for TCacheShape */ _
    ],
    store: Store[_, AnyAction]
  ): AnonStore = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStore]
  }
}

