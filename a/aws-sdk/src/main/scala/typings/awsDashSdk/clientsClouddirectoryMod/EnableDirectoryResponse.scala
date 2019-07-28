package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableDirectoryResponse extends js.Object {
  /**
    * The ARN of the enabled directory.
    */
  var DirectoryArn: Arn
}

object EnableDirectoryResponse {
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[EnableDirectoryResponse]
  }
}

