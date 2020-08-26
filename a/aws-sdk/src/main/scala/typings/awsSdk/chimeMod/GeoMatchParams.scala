package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchParams extends js.Object {
  /**
    * The area code.
    */
  var AreaCode: typings.awsSdk.chimeMod.AreaCode = js.native
  /**
    * The country.
    */
  var Country: typings.awsSdk.chimeMod.Country = js.native
}

object GeoMatchParams {
  @scala.inline
  def apply(AreaCode: AreaCode, Country: Country): GeoMatchParams = {
    val __obj = js.Dynamic.literal(AreaCode = AreaCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchParams]
  }
  @scala.inline
  implicit class GeoMatchParamsOps[Self <: GeoMatchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAreaCode(value: AreaCode): Self = this.set("AreaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: Country): Self = this.set("Country", value.asInstanceOf[js.Any])
  }
  
}

