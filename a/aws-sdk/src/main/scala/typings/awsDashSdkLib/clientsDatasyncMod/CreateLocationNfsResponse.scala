package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocationNfsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source NFS file system location that is created.
    */
  var LocationArn: js.UndefOr[LocationArn] = js.undefined
}

object CreateLocationNfsResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    __obj.asInstanceOf[CreateLocationNfsResponse]
  }
}

