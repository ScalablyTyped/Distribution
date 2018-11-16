package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.undefined
  var generateActions: js.UndefOr[js.Function1[/* repeated */java.lang.String, scala.Unit]] = js.undefined
  def dispatch(payload: js.Any*): scala.Unit
}

