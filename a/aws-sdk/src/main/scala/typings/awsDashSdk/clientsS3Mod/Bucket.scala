package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /**
    * Date the bucket was created.
    */
  var CreationDate: js.UndefOr[typings.awsDashSdk.clientsS3Mod.CreationDate] = js.native
  /**
    * The name of the bucket.
    */
  var Name: js.UndefOr[BucketName] = js.native
}

object Bucket {
  @scala.inline
  def apply(CreationDate: CreationDate = null, Name: BucketName = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

