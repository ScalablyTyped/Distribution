package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var notes: java.lang.String
  var phoneNumber: java.lang.String
  var postalAddress: actionsDashOnDashGoogleLib.Anon_AddressLines
}

object Location {
  @scala.inline
  def apply(
    notes: java.lang.String,
    phoneNumber: java.lang.String,
    postalAddress: actionsDashOnDashGoogleLib.Anon_AddressLines
  ): Location = {
    val __obj = js.Dynamic.literal(notes = notes, phoneNumber = phoneNumber, postalAddress = postalAddress)
  
    __obj.asInstanceOf[Location]
  }
}

