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

