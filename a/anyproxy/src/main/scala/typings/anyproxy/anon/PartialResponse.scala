package typings.anyproxy.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<anyproxy.anyproxy.Response> */
trait PartialResponse extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[Record[String, String]] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object PartialResponse {
  @scala.inline
  def apply(
    body: js.Any = null,
    header: Record[String, String] = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): PartialResponse = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResponse]
  }
}

