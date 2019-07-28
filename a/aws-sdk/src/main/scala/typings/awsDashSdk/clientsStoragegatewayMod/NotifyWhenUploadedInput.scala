package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyWhenUploadedInput extends js.Object {
  var FileShareARN: typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN
}

object NotifyWhenUploadedInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN): NotifyWhenUploadedInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN)
  
    __obj.asInstanceOf[NotifyWhenUploadedInput]
  }
}

