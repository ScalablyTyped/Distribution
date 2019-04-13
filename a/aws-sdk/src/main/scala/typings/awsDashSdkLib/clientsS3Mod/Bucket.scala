package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /**
    * Date the bucket was created.
    */
  var CreationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The name of the bucket.
    */
  var Name: js.UndefOr[BucketName] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(CreationDate: CreationDate = null, Name: BucketName = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Bucket]
  }
}

