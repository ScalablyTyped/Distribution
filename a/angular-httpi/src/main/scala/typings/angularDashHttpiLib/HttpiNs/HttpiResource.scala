package typings
package angularDashHttpiLib.HttpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Httpi.HttpiResource")
@js.native
class HttpiResource protected () extends js.Object {
  def this(http: angularLib.angularMod.angularNs.IHttpService, url: java.lang.String) = this()
  def delete[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def get[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def head[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def jsonp[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def post[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def put[T](config: HttpiPayload): angularLib.angularMod.angularNs.IHttpPromise[T] = js.native
  def setKeepTrailingSlash(newKeepTrailingSlash: scala.Boolean): HttpiResource = js.native
}

