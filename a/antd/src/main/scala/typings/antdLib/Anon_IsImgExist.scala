package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsImgExist extends js.Object {
  var isImgExist: scala.Boolean
  var scale: scala.Double
}

object Anon_IsImgExist {
  @scala.inline
  def apply(isImgExist: scala.Boolean, scale: scala.Double): Anon_IsImgExist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isImgExist")(isImgExist)
    __obj.updateDynamic("scale")(scale)
    __obj.asInstanceOf[Anon_IsImgExist]
  }
}

