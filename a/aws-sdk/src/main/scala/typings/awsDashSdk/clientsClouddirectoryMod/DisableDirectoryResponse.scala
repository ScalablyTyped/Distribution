package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableDirectoryResponse extends js.Object {
  /**
    * The ARN of the directory that has been disabled.
    */
  var DirectoryArn: Arn
}

object DisableDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): DisableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[DisableDirectoryResponse]
  }
}

