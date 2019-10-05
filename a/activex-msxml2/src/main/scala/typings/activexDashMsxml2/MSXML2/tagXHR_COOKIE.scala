package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tagXHR_COOKIE extends js.Object {
  val dwFlags: Double
  val ftExpires: _FILETIME
  val pwszName: String
  val pwszP3PPolicy: String
  val pwszUrl: String
  val pwszValue: String
}

object tagXHR_COOKIE {
  @scala.inline
  def apply(
    dwFlags: Double,
    ftExpires: _FILETIME,
    pwszName: String,
    pwszP3PPolicy: String,
    pwszUrl: String,
    pwszValue: String
  ): tagXHR_COOKIE = {
    val __obj = js.Dynamic.literal(dwFlags = dwFlags, ftExpires = ftExpires, pwszName = pwszName, pwszP3PPolicy = pwszP3PPolicy, pwszUrl = pwszUrl, pwszValue = pwszValue)
  
    __obj.asInstanceOf[tagXHR_COOKIE]
  }
}

