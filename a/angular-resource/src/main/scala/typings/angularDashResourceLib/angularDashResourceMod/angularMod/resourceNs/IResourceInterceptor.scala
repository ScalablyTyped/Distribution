package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceInterceptor extends js.Object {
  var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, _]] = js.undefined
  var responseError: js.UndefOr[js.Function1[/* rejection */ js.Any, _]] = js.undefined
}

