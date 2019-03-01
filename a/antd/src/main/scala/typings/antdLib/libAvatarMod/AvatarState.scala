package typings
package antdLib.libAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarState extends js.Object {
  var isImgExist: scala.Boolean
  var scale: scala.Double
}

object AvatarState {
  @scala.inline
  def apply(isImgExist: scala.Boolean, scale: scala.Double): AvatarState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isImgExist")(isImgExist)
    __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[AvatarState]
  }
}

