package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketOutput extends js.Object {
  /**
    * 
    */
  var Location: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Location] = js.undefined
}

object CreateBucketOutput {
  @scala.inline
  def apply(Location: Location = null): CreateBucketOutput = {
    val __obj = js.Dynamic.literal()
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateBucketOutput]
  }
}

