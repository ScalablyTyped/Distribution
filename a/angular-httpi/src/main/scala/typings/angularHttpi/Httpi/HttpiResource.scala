package typings.angularHttpi.Httpi

import typings.angular.mod.IHttpPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpiResource extends js.Object {
  def delete[T](config: HttpiPayload): IHttpPromise[T]
  def get[T](config: HttpiPayload): IHttpPromise[T]
  def head[T](config: HttpiPayload): IHttpPromise[T]
  def jsonp[T](config: HttpiPayload): IHttpPromise[T]
  def post[T](config: HttpiPayload): IHttpPromise[T]
  def put[T](config: HttpiPayload): IHttpPromise[T]
  def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource
}

object HttpiResource {
  @scala.inline
  def apply(
    delete: HttpiPayload => IHttpPromise[js.Any],
    get: HttpiPayload => IHttpPromise[js.Any],
    head: HttpiPayload => IHttpPromise[js.Any],
    jsonp: HttpiPayload => IHttpPromise[js.Any],
    post: HttpiPayload => IHttpPromise[js.Any],
    put: HttpiPayload => IHttpPromise[js.Any],
    setKeepTrailingSlash: Boolean => HttpiResource
  ): HttpiResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), head = js.Any.fromFunction1(head), jsonp = js.Any.fromFunction1(jsonp), post = js.Any.fromFunction1(post), put = js.Any.fromFunction1(put), setKeepTrailingSlash = js.Any.fromFunction1(setKeepTrailingSlash))
    __obj.asInstanceOf[HttpiResource]
  }
}

