package typings
package adoneLib.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var accountHistory: js.Array[java.lang.String]
  var address: FullAddress
  var company: Company
  var email: java.lang.String
  var name: java.lang.String
  var phone: java.lang.String
  var posts: js.Array[Post]
  var username: java.lang.String
  var website: java.lang.String
}

object Card {
  @scala.inline
  def apply(
    accountHistory: js.Array[java.lang.String],
    address: FullAddress,
    company: Company,
    email: java.lang.String,
    name: java.lang.String,
    phone: java.lang.String,
    posts: js.Array[Post],
    username: java.lang.String,
    website: java.lang.String
  ): Card = {
    val __obj = js.Dynamic.literal(accountHistory = accountHistory, address = address, company = company, email = email, name = name, phone = phone, posts = posts, username = username, website = website)
  
    __obj.asInstanceOf[Card]
  }
}

