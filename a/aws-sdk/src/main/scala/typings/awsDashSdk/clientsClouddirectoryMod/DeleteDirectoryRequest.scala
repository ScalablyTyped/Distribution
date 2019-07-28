package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to delete.
    */
  var DirectoryArn: Arn
}

object DeleteDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
}

