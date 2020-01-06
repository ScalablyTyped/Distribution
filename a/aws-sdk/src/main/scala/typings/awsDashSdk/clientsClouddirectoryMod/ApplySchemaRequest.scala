package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplySchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory into which the schema is copied. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Published schema Amazon Resource Name (ARN) that needs to be copied. For more information, see arns.
    */
  var PublishedSchemaArn: Arn = js.native
}

object ApplySchemaRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): ApplySchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplySchemaRequest]
  }
}

