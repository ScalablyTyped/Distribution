package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  /**
    * 
    */
  var Code: js.UndefOr[Code] = js.undefined
  /**
    * 
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  /**
    * 
    */
  var Message: js.UndefOr[Message] = js.undefined
  /**
    * 
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    Code: Code = null,
    Key: ObjectKey = null,
    Message: Message = null,
    VersionId: ObjectVersionId = null
  ): Error = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[Error]
  }
}

