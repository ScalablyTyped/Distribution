package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /**
    * Country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[String] = js.undefined
  /**
    * Country name of the remote IP address.
    */
  var CountryName: js.UndefOr[String] = js.undefined
}

object Country {
  @scala.inline
  def apply(CountryCode: String = null, CountryName: String = null): Country = {
    val __obj = js.Dynamic.literal()
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode)
    if (CountryName != null) __obj.updateDynamic("CountryName")(CountryName)
    __obj.asInstanceOf[Country]
  }
}

