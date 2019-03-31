package typings
package antdDashMobileDashRnLib.libIconPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconPropsType extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object IconPropsType {
  @scala.inline
  def apply(`type`: java.lang.String, color: java.lang.String = null): IconPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[IconPropsType]
  }
}

