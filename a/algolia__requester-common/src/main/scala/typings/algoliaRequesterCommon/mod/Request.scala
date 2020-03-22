package typings.algoliaRequesterCommon.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  /**
    * The timeout to stablish a connection with the server.
    */
  val connectTimeout: Double
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[String] = js.undefined
  /**
    * The headers of the request.
    */
  val headers: Record[String, String]
  /**
    * The method of the request. `GET`, etc.
    */
  val method: MethodType
  /**
    * The timeout to receive the response.
    */
  val responseTimeout: Double
  /**
    * The complete url of the request, with the protocol.
    */
  val url: String
}

object Request {
  @scala.inline
  def apply(
    connectTimeout: Double,
    headers: Record[String, String],
    method: MethodType,
    responseTimeout: Double,
    url: String,
    data: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(connectTimeout = connectTimeout.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], responseTimeout = responseTimeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

