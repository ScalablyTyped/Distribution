package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  var S3Object: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.S3Object] = js.native
}

object Summary {
  @scala.inline
  def apply(S3Object: S3Object = null): Summary = {
    val __obj = js.Dynamic.literal()
    if (S3Object != null) __obj.updateDynamic("S3Object")(S3Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
}

