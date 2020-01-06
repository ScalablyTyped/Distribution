package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectsOutput extends js.Object {
  /**
    * Container element for a successful delete. It identifies the object that was successfully deleted.
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.native
  /**
    * Container for a failed delete operation that describes the object that Amazon S3 attempted to delete and the error it encountered.
    */
  var Errors: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Errors] = js.native
  var RequestCharged: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestCharged] = js.native
}

object DeleteObjectsOutput {
  @scala.inline
  def apply(Deleted: DeletedObjects = null, Errors: Errors = null, RequestCharged: RequestCharged = null): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (Deleted != null) __obj.updateDynamic("Deleted")(Deleted.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
}

