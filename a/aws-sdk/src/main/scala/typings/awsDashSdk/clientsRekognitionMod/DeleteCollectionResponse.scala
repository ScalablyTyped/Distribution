package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCollectionResponse extends js.Object {
  /**
    * HTTP status code that indicates the result of the operation.
    */
  var StatusCode: js.UndefOr[UInteger] = js.native
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(StatusCode: Int | Double = null): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
}

