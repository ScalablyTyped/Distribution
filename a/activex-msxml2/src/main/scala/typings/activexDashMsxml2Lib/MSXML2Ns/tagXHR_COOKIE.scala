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
    val __obj = js.Dynamic.literal(dwFlags = dwFlags, ftExpires = ftExpires, pwszName = pwszName, pwszP3PPolicy = pwszP3PPolicy, pwszUrl = pwszUrl, pwszValue = pwszValue)
  
    __obj.asInstanceOf[tagXHR_COOKIE]
  }
}

