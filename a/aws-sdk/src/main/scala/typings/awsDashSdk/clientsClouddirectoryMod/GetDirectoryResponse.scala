package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectoryResponse extends js.Object {
  /**
    * Metadata about the directory.
    */
  var Directory: typings.awsDashSdk.clientsClouddirectoryMod.Directory
}

object GetDirectoryResponse {
  @scala.inline
  def apply(Directory: Directory): GetDirectoryResponse = {
    val __obj = js.Dynamic.literal(Directory = Directory)
  
    __obj.asInstanceOf[GetDirectoryResponse]
  }
}

