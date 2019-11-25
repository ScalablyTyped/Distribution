package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  val Account: typings.activexDashOutlook.Outlook.Account
}

object Anon_Account {
  @scala.inline
  def apply(Account: Account): Anon_Account = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Account]
  }
}

