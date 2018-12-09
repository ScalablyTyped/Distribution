package typings
package apolloDashReactLib.libApolloProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProviderProps extends js.Object {
  var client: apolloDashClientLib.apolloDashClientMod.default[_]
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var store: js.UndefOr[reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction]] = js.undefined
}

