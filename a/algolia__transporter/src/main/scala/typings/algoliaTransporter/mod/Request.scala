package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.MethodType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * If the response should persist on cache.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  /**
    * The data to transfer to the server.
    */
  val data: js.UndefOr[(Record[String, _]) | (js.Array[Record[String, _]])] = js.undefined
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType
  /**
    * The path of the request. i.e: `/1/indexes`.
    */
  val path: String
}

object Request {
  @scala.inline
  def apply(
    method: MethodType,
    path: String,
    cacheable: js.UndefOr[Boolean] = js.undefined,
    data: (Record[String, _]) | (js.Array[Record[String, _]]) = null
  ): Request = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheable)) __obj.updateDynamic("cacheable")(cacheable.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

