package typings.angularHttpi.Httpi

import typings.angular.mod.IHttpPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpiResource extends js.Object {
  def delete[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def get[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def head[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def jsonp[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def post[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def put[T](config: HttpiPayload): IHttpPromise[T] = js.native
  def setKeepTrailingSlash(newKeepTrailingSlash: Boolean): HttpiResource = js.native
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
  @scala.inline
  implicit class HttpiResourceOps[Self <: HttpiResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setHead(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("head", js.Any.fromFunction1(value))
    @scala.inline
    def setJsonp(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("jsonp", js.Any.fromFunction1(value))
    @scala.inline
    def setPost(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("post", js.Any.fromFunction1(value))
    @scala.inline
    def setPut(value: HttpiPayload => IHttpPromise[js.Any]): Self = this.set("put", js.Any.fromFunction1(value))
    @scala.inline
    def setSetKeepTrailingSlash(value: Boolean => HttpiResource): Self = this.set("setKeepTrailingSlash", js.Any.fromFunction1(value))
  }
  
}

