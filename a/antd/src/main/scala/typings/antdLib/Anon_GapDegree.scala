package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GapDegree extends js.Object {
  var gapDegree: scala.Double
  var percent: scala.Double
  var showInfo: scala.Boolean
  var size: java.lang.String
  var strokeLinecap: java.lang.String
  var trailColor: java.lang.String
  var `type`: java.lang.String
}

object Anon_GapDegree {
  @scala.inline
  def apply(
    gapDegree: scala.Double,
    percent: scala.Double,
    showInfo: scala.Boolean,
    size: java.lang.String,
    strokeLinecap: java.lang.String,
    trailColor: java.lang.String,
    `type`: java.lang.String
  ): Anon_GapDegree = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("gapDegree")(gapDegree)
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("showInfo")(showInfo)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    __obj.updateDynamic("trailColor")(trailColor)
    __obj.asInstanceOf[Anon_GapDegree]
  }
}

