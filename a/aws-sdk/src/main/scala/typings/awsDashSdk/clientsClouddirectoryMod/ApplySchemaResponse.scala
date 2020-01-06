package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySchemaResponse extends js.Object {
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
}

object ApplySchemaResponse {
  @scala.inline
  def apply(AppliedSchemaArn: Arn = null, DirectoryArn: Arn = null): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (AppliedSchemaArn != null) __obj.updateDynamic("AppliedSchemaArn")(AppliedSchemaArn.asInstanceOf[js.Any])
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySchemaResponse]
  }
}

