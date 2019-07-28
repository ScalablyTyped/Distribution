package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to disable.
    */
  var DirectoryArn: Arn
}

object DisableDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): DisableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[DisableDirectoryRequest]
  }
}

