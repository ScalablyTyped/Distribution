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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("dob")(dob)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phone")(phone)
    __obj.updateDynamic("username")(username)
    __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[ContextualCard]
  }
}

