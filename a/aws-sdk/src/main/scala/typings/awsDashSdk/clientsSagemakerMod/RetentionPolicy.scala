package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPolicy extends js.Object {
  /**
    * The home Amazon Elastic File System (EFS).
    */
  var HomeEfsFileSystem: js.UndefOr[RetentionType] = js.native
}

object RetentionPolicy {
  @scala.inline
  def apply(HomeEfsFileSystem: RetentionType = null): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    if (HomeEfsFileSystem != null) __obj.updateDynamic("HomeEfsFileSystem")(HomeEfsFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
}

