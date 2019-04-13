package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantAccessResult extends js.Object {
  /**
    * A TemporaryCredential object that contains the data needed to log in to the instance by RDP clients, such as the Microsoft Remote Desktop Connection.
    */
  var TemporaryCredential: js.UndefOr[TemporaryCredential] = js.undefined
}

object GrantAccessResult {
  @scala.inline
  def apply(TemporaryCredential: TemporaryCredential = null): GrantAccessResult = {
    val __obj = js.Dynamic.literal()
    if (TemporaryCredential != null) __obj.updateDynamic("TemporaryCredential")(TemporaryCredential)
    __obj.asInstanceOf[GrantAccessResult]
  }
}

