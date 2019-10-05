package typings.angularDashHttpi.Httpi

import typings.angular.angularMod.IHttpPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpiFactory extends js.Object {
  def apply(config: HttpiPayload): IHttpPromise[js.Object] = js.native
  def resource(url: String): HttpiResource = js.native
}

