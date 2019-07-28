package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCollectionResponse extends js.Object {
  /**
    * HTTP status code that indicates the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.undefined
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(StatusCode: js.UndefOr[UInteger] = js.undefined): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StatusCode)) __obj.updateDynamic("StatusCode")(StatusCode)
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
}

