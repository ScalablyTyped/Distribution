package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRunRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the run you wish to delete.
    */
  var arn: AmazonResourceName
}

object DeleteRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[DeleteRunRequest]
  }
}

