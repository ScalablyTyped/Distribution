package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationEfsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
    */
  var LocationArn: js.UndefOr[LocationArn] = js.undefined
}

object CreateLocationEfsResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    __obj.asInstanceOf[CreateLocationEfsResponse]
  }
}

