package typings.algoliaTransporter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappedRequestOptions extends js.Object {
  /**
    * If the request should be cached.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * The headers of the request.
    */
  val headers: Record[String, String]
  /**
    * The query parameters of the request.
    */
  val queryParameters: Record[String, _]
  /**
    * The `read` or `write` timeout of the request.
    */
  val timeout: js.UndefOr[Double] = js.undefined
}

object MappedRequestOptions {
  @scala.inline
  def apply(
    headers: Record[String, String],
    queryParameters: Record[String, _],
    cacheable: js.UndefOr[Boolean] = js.undefined,
    data: Record[String, String] = null,
    timeout: Int | Double = null
  ): MappedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheable)) __obj.updateDynamic("cacheable")(cacheable.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedRequestOptions]
  }
}

