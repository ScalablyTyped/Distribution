package typings.accedoAccedoOne.mod.AccedoLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /** The dimension 1 information */
  var dim1: js.UndefOr[String] = js.undefined
  /** The dimension 2 information */
  var dim2: js.UndefOr[String] = js.undefined
  /** The dimension 3 information */
  var dim3: js.UndefOr[String] = js.undefined
  /** The dimension 4 information */
  var dim4: js.UndefOr[String] = js.undefined
  /** The error code (max 5 digits) */
  var errorCode: js.UndefOr[Double] = js.undefined
  /** The log message */
  var message: String
}

object Details {
  @scala.inline
  def apply(
    message: String,
    dim1: String = null,
    dim2: String = null,
    dim3: String = null,
    dim4: String = null,
    errorCode: js.UndefOr[Double] = js.undefined
  ): Details = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (dim1 != null) __obj.updateDynamic("dim1")(dim1.asInstanceOf[js.Any])
    if (dim2 != null) __obj.updateDynamic("dim2")(dim2.asInstanceOf[js.Any])
    if (dim3 != null) __obj.updateDynamic("dim3")(dim3.asInstanceOf[js.Any])
    if (dim4 != null) __obj.updateDynamic("dim4")(dim4.asInstanceOf[js.Any])
    if (!js.isUndefined(errorCode)) __obj.updateDynamic("errorCode")(errorCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

