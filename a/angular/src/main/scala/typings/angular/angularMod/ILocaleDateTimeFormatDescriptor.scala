package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleDateTimeFormatDescriptor extends js.Object {
  var AMPMS: js.Array[String]
  var DAY: js.Array[String]
  var MONTH: js.Array[String]
  var SHORTDAY: js.Array[String]
  var SHORTMONTH: js.Array[String]
  var fullDate: String
  var longDate: String
  var medium: String
  var mediumDate: String
  var mediumTime: String
  var short: String
  var shortDate: String
  var shortTime: String
}

object ILocaleDateTimeFormatDescriptor {
  @scala.inline
  def apply(
    AMPMS: js.Array[String],
    DAY: js.Array[String],
    MONTH: js.Array[String],
    SHORTDAY: js.Array[String],
    SHORTMONTH: js.Array[String],
    fullDate: String,
    longDate: String,
    medium: String,
    mediumDate: String,
    mediumTime: String,
    short: String,
    shortDate: String,
    shortTime: String
  ): ILocaleDateTimeFormatDescriptor = {
    val __obj = js.Dynamic.literal(AMPMS = AMPMS.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], SHORTDAY = SHORTDAY.asInstanceOf[js.Any], SHORTMONTH = SHORTMONTH.asInstanceOf[js.Any], fullDate = fullDate.asInstanceOf[js.Any], longDate = longDate.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumDate = mediumDate.asInstanceOf[js.Any], mediumTime = mediumTime.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocaleDateTimeFormatDescriptor]
  }
}

