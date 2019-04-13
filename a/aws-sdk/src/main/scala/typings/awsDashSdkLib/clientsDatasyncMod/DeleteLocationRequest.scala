package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLocationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the location to delete.
    */
  var LocationArn: awsDashSdkLib.clientsDatasyncMod.LocationArn
}

object DeleteLocationRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DeleteLocationRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn)
  
    __obj.asInstanceOf[DeleteLocationRequest]
  }
}

