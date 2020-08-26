package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tagXHRCOOKIE extends js.Object {
  val dwFlags: Double = js.native
  val ftExpires: _FILETIME = js.native
  val pwszName: String = js.native
  val pwszP3PPolicy: String = js.native
  val pwszUrl: String = js.native
  val pwszValue: String = js.native
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
  @scala.inline
  implicit class tagXHRCOOKIEOps[Self <: tagXHRCOOKIE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDwFlags(value: Double): Self = this.set("dwFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtExpires(value: _FILETIME): Self = this.set("ftExpires", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwszName(value: String): Self = this.set("pwszName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwszP3PPolicy(value: String): Self = this.set("pwszP3PPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwszUrl(value: String): Self = this.set("pwszUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwszValue(value: String): Self = this.set("pwszValue", value.asInstanceOf[js.Any])
  }
  
}

