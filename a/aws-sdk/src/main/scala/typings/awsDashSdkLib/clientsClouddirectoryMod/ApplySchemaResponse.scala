package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplySchemaResponse extends js.Object {
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.undefined
}

object ApplySchemaResponse {
  @scala.inline
  def apply(AppliedSchemaArn: Arn = null, DirectoryArn: Arn = null): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (AppliedSchemaArn != null) __obj.updateDynamic("AppliedSchemaArn")(AppliedSchemaArn)
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn)
    __obj.asInstanceOf[ApplySchemaResponse]
  }
}

