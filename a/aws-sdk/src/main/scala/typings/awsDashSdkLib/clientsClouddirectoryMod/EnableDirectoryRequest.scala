package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory to enable.
    */
  var DirectoryArn: Arn
}

object EnableDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[EnableDirectoryRequest]
  }
}

