package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleDateTimeFormatDescriptor extends js.Object {
  var AMPMS: js.Array[java.lang.String]
  var DAY: js.Array[java.lang.String]
  var MONTH: js.Array[java.lang.String]
  var SHORTDAY: js.Array[java.lang.String]
  var SHORTMONTH: js.Array[java.lang.String]
  var fullDate: java.lang.String
  var longDate: java.lang.String
  var medium: java.lang.String
  var mediumDate: java.lang.String
  var mediumTime: java.lang.String
  var short: java.lang.String
  var shortDate: java.lang.String
  var shortTime: java.lang.String
}

object ILocaleDateTimeFormatDescriptor {
  @scala.inline
  def apply(
    AMPMS: js.Array[java.lang.String],
    DAY: js.Array[java.lang.String],
    MONTH: js.Array[java.lang.String],
    SHORTDAY: js.Array[java.lang.String],
    SHORTMONTH: js.Array[java.lang.String],
    fullDate: java.lang.String,
    longDate: java.lang.String,
    medium: java.lang.String,
    mediumDate: java.lang.String,
    mediumTime: java.lang.String,
    short: java.lang.String,
    shortDate: java.lang.String,
    shortTime: java.lang.String
  ): ILocaleDateTimeFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AMPMS")(AMPMS)
    __obj.updateDynamic("DAY")(DAY)
    __obj.updateDynamic("MONTH")(MONTH)
    __obj.updateDynamic("SHORTDAY")(SHORTDAY)
    __obj.updateDynamic("SHORTMONTH")(SHORTMONTH)
    __obj.updateDynamic("fullDate")(fullDate)
    __obj.updateDynamic("longDate")(longDate)
    __obj.updateDynamic("medium")(medium)
    __obj.updateDynamic("mediumDate")(mediumDate)
    __obj.updateDynamic("mediumTime")(mediumTime)
    __obj.updateDynamic("short")(short)
    __obj.updateDynamic("shortDate")(shortDate)
    __obj.updateDynamic("shortTime")(shortTime)
    __obj.asInstanceOf[ILocaleDateTimeFormatDescriptor]
  }
}

