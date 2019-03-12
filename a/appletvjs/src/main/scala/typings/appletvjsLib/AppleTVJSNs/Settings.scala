package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Contains the language the device displays information in. */
  var language: java.lang.String
  /** Contains the restriction information on the device. */
  var restrictions: Restrictions
  /** Contains the country code used by the store on this device. */
  var storefrontCountryCode: java.lang.String
  /**
  		* Called when changes to a device’s restriction information changes.
  		*/
  def onRestrictionsChange(): scala.Unit
}

object Settings {
  @scala.inline
  def apply(
    language: java.lang.String,
    onRestrictionsChange: () => scala.Unit,
    restrictions: Restrictions,
    storefrontCountryCode: java.lang.String
  ): Settings = {
    val __obj = js.Dynamic.literal(language = language, onRestrictionsChange = js.Any.fromFunction0(onRestrictionsChange), restrictions = restrictions, storefrontCountryCode = storefrontCountryCode)
  
    __obj.asInstanceOf[Settings]
  }
}

