package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  /**
    * City name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(CityName: String = null): City = {
    val __obj = js.Dynamic.literal()
    if (CityName != null) __obj.updateDynamic("CityName")(CityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
}

