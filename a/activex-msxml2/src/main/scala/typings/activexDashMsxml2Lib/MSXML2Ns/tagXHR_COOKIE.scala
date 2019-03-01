package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tagXHR_COOKIE extends js.Object {
  val dwFlags: scala.Double
  val ftExpires: _FILETIME
  val pwszName: java.lang.String
  val pwszP3PPolicy: java.lang.String
  val pwszUrl: java.lang.String
  val pwszValue: java.lang.String
}

object tagXHR_COOKIE {
  @scala.inline
  def apply(
    dwFlags: scala.Double,
    ftExpires: _FILETIME,
    pwszName: java.lang.String,
    pwszP3PPolicy: java.lang.String,
    pwszUrl: java.lang.String,
    pwszValue: java.lang.String
  ): tagXHR_COOKIE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dwFlags")(dwFlags)
    __obj.updateDynamic("ftExpires")(ftExpires)
    __obj.updateDynamic("pwszName")(pwszName)
    __obj.updateDynamic("pwszP3PPolicy")(pwszP3PPolicy)
    __obj.updateDynamic("pwszUrl")(pwszUrl)
    __obj.updateDynamic("pwszValue")(pwszValue)
    __obj.asInstanceOf[tagXHR_COOKIE]
  }
}

