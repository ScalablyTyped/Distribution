package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.Anon_AddressLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var notes: String
  var phoneNumber: String
  var postalAddress: Anon_AddressLines
}

object Location {
  @scala.inline
  def apply(notes: String, phoneNumber: String, postalAddress: Anon_AddressLines): Location = {
    val __obj = js.Dynamic.literal(notes = notes, phoneNumber = phoneNumber, postalAddress = postalAddress)
  
    __obj.asInstanceOf[Location]
  }
}

