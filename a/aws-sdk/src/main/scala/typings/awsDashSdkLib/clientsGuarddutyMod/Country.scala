package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  /**
    * Country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[__string] = js.undefined
  /**
    * Country name of the remote IP address.
    */
  var CountryName: js.UndefOr[__string] = js.undefined
}

object Country {
  @scala.inline
  def apply(CountryCode: __string = null, CountryName: __string = null): Country = {
    val __obj = js.Dynamic.literal()
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode)
    if (CountryName != null) __obj.updateDynamic("CountryName")(CountryName)
    __obj.asInstanceOf[Country]
  }
}

