package typings
package apolloDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientStore extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
  ]
  var store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
}

object Anon_ClientStore {
  @scala.inline
  def apply(
    client: apolloDashClientLib.apolloDashClientMod.default[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
    ],
    store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]
  ): Anon_ClientStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[Anon_ClientStore]
  }
}

