package typings.adone.adoneNs.fakeNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var account: String
  var amount: String
  var business: String
  var date: typings.std.Date
  var name: String
  var `type`: String
}

object Transaction {
  @scala.inline
  def apply(
    account: String,
    amount: String,
    business: String,
    date: typings.std.Date,
    name: String,
    `type`: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(account = account, amount = amount, business = business, date = date, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Transaction]
  }
}

