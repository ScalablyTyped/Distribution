package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsImgExist extends js.Object {
  var isImgExist: Boolean
  var mounted: Boolean
  var scale: Double
}

object IsImgExist {
  @scala.inline
  def apply(isImgExist: Boolean, mounted: Boolean, scale: Double): IsImgExist = {
    val __obj = js.Dynamic.literal(isImgExist = isImgExist.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsImgExist]
  }
}

