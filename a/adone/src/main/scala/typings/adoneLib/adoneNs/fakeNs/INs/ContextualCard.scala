package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualCard extends js.Object {
  var address: Address
  var company: Company
  var dob: stdLib.Date
  var email: java.lang.String
  var name: java.lang.String
  var phone: java.lang.String
  var username: java.lang.String
  var website: java.lang.String
}

object ContextualCard {
  @scala.inline
  def apply(
    address: Address,
    company: Company,
    dob: stdLib.Date,
    email: java.lang.String,
    name: java.lang.String,
    phone: java.lang.String,
    username: java.lang.String,
    website: java.lang.String
  ): ContextualCard = {
    val __obj = js.Dynamic.literal(address = address, company = company, dob = dob, email = email, name = name, phone = phone, username = username, website = website)
  
    __obj.asInstanceOf[ContextualCard]
  }
}

