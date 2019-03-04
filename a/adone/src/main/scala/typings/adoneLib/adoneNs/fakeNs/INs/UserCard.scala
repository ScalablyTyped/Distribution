package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCard extends js.Object {
  var address: Address
  var company: Company
  var email: java.lang.String
  var name: java.lang.String
  var phone: java.lang.String
  var username: java.lang.String
  var website: java.lang.String
}

object UserCard {
  @scala.inline
  def apply(
    address: Address,
    company: Company,
    email: java.lang.String,
    name: java.lang.String,
    phone: java.lang.String,
    username: java.lang.String,
    website: java.lang.String
  ): UserCard = {
    val __obj = js.Dynamic.literal(address = address, company = company, email = email, name = name, phone = phone, username = username, website = website)
  
    __obj.asInstanceOf[UserCard]
  }
}

