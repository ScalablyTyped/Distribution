package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectoryResponse extends js.Object {
  /**
    * The ARN of the deleted directory.
    */
  var DirectoryArn: Arn
}

object DeleteDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[DeleteDirectoryResponse]
  }
}

