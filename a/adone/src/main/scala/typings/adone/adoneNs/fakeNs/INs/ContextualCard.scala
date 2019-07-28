package typings.adone.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualCard extends js.Object {
  var address: Address
  var company: Company
  var dob: typings.std.Date
  var email: String
  var name: String
  var phone: String
  var username: String
  var website: String
}

object ContextualCard {
  @scala.inline
  def apply(
    address: Address,
    company: Company,
    dob: typings.std.Date,
    email: String,
    name: String,
    phone: String,
    username: String,
    website: String
  ): ContextualCard = {
    val __obj = js.Dynamic.literal(address = address, company = company, dob = dob, email = email, name = name, phone = phone, username = username, website = website)
  
    __obj.asInstanceOf[ContextualCard]
  }
}

