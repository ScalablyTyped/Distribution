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
}

