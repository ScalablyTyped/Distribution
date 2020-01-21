package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options used to construct an `HttpParams` instance.
  *
  * @publicApi
  */
trait HttpParamsOptions extends js.Object {
  /** Encoding codec used to parse and serialize the parameters. */
  var encoder: js.UndefOr[HttpParameterCodec] = js.undefined
  /** Object map of the HTTP parameters. Mutually exclusive with `fromString`. */
  var fromObject: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  /**
    * String representation of the HTTP parameters in URL-query-string format.
    * Mutually exclusive with `fromObject`.
    */
  var fromString: js.UndefOr[String] = js.undefined
}

object HttpParamsOptions {
  @scala.inline
  def apply(
    encoder: HttpParameterCodec = null,
    fromObject: StringDictionary[String | js.Array[String]] = null,
    fromString: String = null
  ): HttpParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (encoder != null) __obj.updateDynamic("encoder")(encoder.asInstanceOf[js.Any])
    if (fromObject != null) __obj.updateDynamic("fromObject")(fromObject.asInstanceOf[js.Any])
    if (fromString != null) __obj.updateDynamic("fromString")(fromString.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpParamsOptions]
  }
}

