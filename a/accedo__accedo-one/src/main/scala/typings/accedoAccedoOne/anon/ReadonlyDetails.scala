package typings.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@accedo/accedo-one.@accedo/accedo-one.AccedoLog.Details> */
trait ReadonlyDetails extends js.Object {
  val dim1: js.UndefOr[String] = js.undefined
  val dim2: js.UndefOr[String] = js.undefined
  val dim3: js.UndefOr[String] = js.undefined
  val dim4: js.UndefOr[String] = js.undefined
  val errorCode: js.UndefOr[Double] = js.undefined
  val message: String
}

object ReadonlyDetails {
  @scala.inline
  def apply(
    message: String,
    dim1: String = null,
    dim2: String = null,
    dim3: String = null,
    dim4: String = null,
    errorCode: js.UndefOr[Double] = js.undefined
  ): ReadonlyDetails = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (dim1 != null) __obj.updateDynamic("dim1")(dim1.asInstanceOf[js.Any])
    if (dim2 != null) __obj.updateDynamic("dim2")(dim2.asInstanceOf[js.Any])
    if (dim3 != null) __obj.updateDynamic("dim3")(dim3.asInstanceOf[js.Any])
    if (dim4 != null) __obj.updateDynamic("dim4")(dim4.asInstanceOf[js.Any])
    if (!js.isUndefined(errorCode)) __obj.updateDynamic("errorCode")(errorCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDetails]
  }
}

