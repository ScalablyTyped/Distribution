package typings
package angularDashHttpiLib.HttpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpiFactory extends js.Object {
  def apply(config: HttpiPayload): angularLib.angularMod.IHttpPromise[js.Object] = js.native
  def resource(url: java.lang.String): HttpiResource = js.native
}

