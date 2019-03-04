package typings
package apolloDashReactLib.libApolloProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderProps extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
  ]
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var store: js.UndefOr[reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]] = js.undefined
}

object ProviderProps {
  @scala.inline
  def apply(
    client: apolloDashClientLib.apolloDashClientMod.default[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TCacheShape */ _
    ],
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    store: reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction] = null
  ): ProviderProps = {
    val __obj = js.Dynamic.literal(client = client)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ProviderProps]
  }
}

