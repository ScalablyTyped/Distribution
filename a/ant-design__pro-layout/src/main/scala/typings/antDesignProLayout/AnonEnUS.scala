package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnUS extends js.Object {
  var `en-US`: AnonAppsettingcontentwidth
  var `it-IT`: AnonAppsettingcontentwidth
  var `zh-CN`: AnonAppsettingcontentwidth
  var `zh-TW`: AnonAppsettingcontentwidth
}

object AnonEnUS {
  @scala.inline
  def apply(
    `en-US`: AnonAppsettingcontentwidth,
    `it-IT`: AnonAppsettingcontentwidth,
    `zh-CN`: AnonAppsettingcontentwidth,
    `zh-TW`: AnonAppsettingcontentwidth
  ): AnonEnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnUS]
  }
}

