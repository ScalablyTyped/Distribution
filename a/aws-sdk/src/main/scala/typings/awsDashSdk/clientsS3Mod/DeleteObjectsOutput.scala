package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectsOutput extends js.Object {
  /**
    * 
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.undefined
  /**
    * 
    */
  var Errors: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Errors] = js.undefined
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.undefined
}

object DeleteObjectsOutput {
  @scala.inline
  def apply(Deleted: DeletedObjects = null, Errors: Errors = null, RequestCharged: RequestCharged = null): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (Deleted != null) __obj.updateDynamic("Deleted")(Deleted)
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
}

