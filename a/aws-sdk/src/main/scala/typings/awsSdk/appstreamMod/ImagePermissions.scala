package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePermissions extends js.Object {
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.native
}

object ImagePermissions {
  @scala.inline
  def apply(): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermissions]
  }
  @scala.inline
  implicit class ImagePermissionsOps[Self <: ImagePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowFleet(value: BooleanObject): Self = this.set("allowFleet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFleet: Self = this.set("allowFleet", js.undefined)
    @scala.inline
    def setAllowImageBuilder(value: BooleanObject): Self = this.set("allowImageBuilder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowImageBuilder: Self = this.set("allowImageBuilder", js.undefined)
  }
  
}

