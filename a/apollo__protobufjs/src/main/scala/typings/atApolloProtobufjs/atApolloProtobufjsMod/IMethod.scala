package typings.atApolloProtobufjs.atApolloProtobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMethod extends js.Object {
  /** Method options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[Boolean] = js.undefined
  /** Request type */
  var requestType: String
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[Boolean] = js.undefined
  /** Response type */
  var responseType: String
  /** Method type */
  var `type`: js.UndefOr[String] = js.undefined
}

object IMethod {
  @scala.inline
  def apply(
    requestType: String,
    responseType: String,
    options: StringDictionary[js.Any] = null,
    requestStream: js.UndefOr[Boolean] = js.undefined,
    responseStream: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): IMethod = {
    val __obj = js.Dynamic.literal(requestType = requestType.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(requestStream)) __obj.updateDynamic("requestStream")(requestStream.asInstanceOf[js.Any])
    if (!js.isUndefined(responseStream)) __obj.updateDynamic("responseStream")(responseStream.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethod]
  }
}

