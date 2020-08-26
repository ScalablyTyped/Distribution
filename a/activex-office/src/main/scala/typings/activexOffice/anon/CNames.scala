package typings.activexOffice.anon

import typings.activexStdole.stdole.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CNames extends js.Object {
  val cNames: Double = js.native
  val lcid: Double = js.native
  var rgdispid: Double = js.native
  val rgszNames: Double = js.native
  val riid: GUID = js.native
}

object CNames {
  @scala.inline
  def apply(cNames: Double, lcid: Double, rgdispid: Double, rgszNames: Double, riid: GUID): CNames = {
    val __obj = js.Dynamic.literal(cNames = cNames.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], rgdispid = rgdispid.asInstanceOf[js.Any], rgszNames = rgszNames.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNames]
  }
  @scala.inline
  implicit class CNamesOps[Self <: CNames] (val x: Self) extends AnyVal {
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
    def setCNames(value: Double): Self = this.set("cNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setLcid(value: Double): Self = this.set("lcid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgdispid(value: Double): Self = this.set("rgdispid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgszNames(value: Double): Self = this.set("rgszNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setRiid(value: GUID): Self = this.set("riid", value.asInstanceOf[js.Any])
  }
  
}

