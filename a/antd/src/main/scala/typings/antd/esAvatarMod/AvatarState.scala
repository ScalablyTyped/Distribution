package typings.antd.esAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarState extends js.Object {
  var isImgExist: Boolean
  var mounted: Boolean
  var scale: Double
}

object AvatarState {
  @scala.inline
  def apply(isImgExist: Boolean, mounted: Boolean, scale: Double): AvatarState = {
    val __obj = js.Dynamic.literal(isImgExist = isImgExist.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvatarState]
  }
}

