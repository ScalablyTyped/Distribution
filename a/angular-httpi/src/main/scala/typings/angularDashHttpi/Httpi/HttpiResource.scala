package typings.angularDashHttpi.Httpi

import typings.angular.angularMod.IHttpPromise
import typings.angular.angularMod.IHttpService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Httpi.HttpiResource")
@js.native
class HttpiResource protected () extends js.Object {
  def this(http: IHttpService, url: String) = this()
  def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource = js.native
}

