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
    val __obj = js.Dynamic.literal(isImgExist = isImgExist, scale = scale)
  
    __obj.asInstanceOf[AvatarState]
  }
}

