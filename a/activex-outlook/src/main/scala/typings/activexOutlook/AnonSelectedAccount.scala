package typings.activexOutlook

import typings.activexOutlook.Outlook.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectedAccount extends js.Object {
  val SelectedAccount: Account
}

object AnonSelectedAccount {
  @scala.inline
  def apply(SelectedAccount: Account): AnonSelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSelectedAccount]
  }
}

