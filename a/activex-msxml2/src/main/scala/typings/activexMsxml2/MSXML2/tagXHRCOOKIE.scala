package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tagXHRCOOKIE extends js.Object {
  val dwFlags: Double
  val ftExpires: _FILETIME
  val pwszName: String
  val pwszP3PPolicy: String
  val pwszUrl: String
  val pwszValue: String
}

object tagXHRCOOKIE {
  @scala.inline
  def apply(
    dwFlags: Double,
    ftExpires: _FILETIME,
    pwszName: String,
    pwszP3PPolicy: String,
    pwszUrl: String,
    pwszValue: String
  ): tagXHRCOOKIE = {
    val __obj = js.Dynamic.literal(dwFlags = dwFlags.asInstanceOf[js.Any], ftExpires = ftExpires.asInstanceOf[js.Any], pwszName = pwszName.asInstanceOf[js.Any], pwszP3PPolicy = pwszP3PPolicy.asInstanceOf[js.Any], pwszUrl = pwszUrl.asInstanceOf[js.Any], pwszValue = pwszValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[tagXHRCOOKIE]
  }
}

