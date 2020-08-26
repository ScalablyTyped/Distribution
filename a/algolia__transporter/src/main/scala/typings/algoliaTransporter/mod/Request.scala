package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.MethodType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  /**
    * If the response should persist on cache.
    */
  val cacheable: js.UndefOr[Boolean] = js.native
  /**
    * The data to transfer to the server.
    */
  val data: js.UndefOr[(Record[String, _]) | (js.Array[Record[String, _]])] = js.native
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType = js.native
  /**
    * The path of the request. i.e: `/1/indexes`.
    */
  val path: String = js.native
}

object Request {
  @scala.inline
  def apply(method: MethodType, path: String): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setMethod(value: MethodType): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheable: Self = this.set("cacheable", js.undefined)
    @scala.inline
    def setDataVarargs(value: (Record[String, js.Any])*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: (Record[String, _]) | (js.Array[Record[String, _]])): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

