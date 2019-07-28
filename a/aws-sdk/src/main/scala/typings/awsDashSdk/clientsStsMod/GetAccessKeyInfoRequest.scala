package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessKeyInfoRequest extends js.Object {
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercased letter or digit.
    */
  var AccessKeyId: accessKeyIdType
}

object GetAccessKeyInfoRequest {
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType): GetAccessKeyInfoRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId)
  
    __obj.asInstanceOf[GetAccessKeyInfoRequest]
  }
}

