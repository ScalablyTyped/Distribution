package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends /**
  * Additional request body values. It's only taken in
  * consideration in `POST` and `PUT` requests.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * If the given request should persist on the cache. Keep in mind,
    * that some methods may have this option enabled by default.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom data for the request. This data are
    * going to be merged the transporter data.
    */
  val data: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Custom headers for the request. This headers are
    * going to be merged the transporter headers.
    */
  val headers: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Custom query parameters for the request. This query parameters are
    * going to be merged the transporter query parameters.
    */
  val queryParameters: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * Custom timeout for the request. Note that, in normal situacions
    * the given timeout will be applied. But the transporter layer may
    * increase this timeout if there is need for it.
    */
  val timeout: js.UndefOr[Double] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    cacheable: js.UndefOr[Boolean] = js.undefined,
    data: Record[String, _] = null,
    headers: Record[String, String] = null,
    queryParameters: Record[String, _] = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(cacheable)) __obj.updateDynamic("cacheable")(cacheable.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

