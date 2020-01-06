package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlListConfiguration extends js.Object {
  /**
    * Path to the AWS S3 bucket that contains the ACL files.
    */
  var KeyPath: js.UndefOr[S3ObjectKey] = js.native
}

object AccessControlListConfiguration {
  @scala.inline
  def apply(KeyPath: S3ObjectKey = null): AccessControlListConfiguration = {
    val __obj = js.Dynamic.literal()
    if (KeyPath != null) __obj.updateDynamic("KeyPath")(KeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlListConfiguration]
  }
}

