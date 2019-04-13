package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUploadRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm upload you wish to delete.
    */
  var arn: AmazonResourceName
}

object DeleteUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteUploadRequest]
  }
}

