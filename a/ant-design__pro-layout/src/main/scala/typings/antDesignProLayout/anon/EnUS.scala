package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnUS extends js.Object {
  var `en-US`: Appsettingcontentwidth
  var `it-IT`: Appsettingcontentwidth
  var `zh-CN`: Appsettingcontentwidth
  var `zh-TW`: Appsettingcontentwidth
}

object EnUS {
  @scala.inline
  def apply(
    `en-US`: Appsettingcontentwidth,
    `it-IT`: Appsettingcontentwidth,
    `zh-CN`: Appsettingcontentwidth,
    `zh-TW`: Appsettingcontentwidth
  ): EnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnUS]
  }
}

