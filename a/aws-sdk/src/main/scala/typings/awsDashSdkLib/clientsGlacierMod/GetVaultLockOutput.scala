package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultLockOutput extends js.Object {
  /**
    * The UTC date and time at which the vault lock was put into the InProgress state.
    */
  var CreationDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UTC date and time at which the lock ID expires. This value can be null if the vault lock is in a Locked state.
    */
  var ExpirationDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The vault lock policy as a JSON string, which uses "\" as an escape character.
    */
  var Policy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the vault lock. InProgress or Locked.
    */
  var State: js.UndefOr[java.lang.String] = js.undefined
}

object GetVaultLockOutput {
  @scala.inline
  def apply(
    CreationDate: java.lang.String = null,
    ExpirationDate: java.lang.String = null,
    Policy: java.lang.String = null,
    State: java.lang.String = null
  ): GetVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[GetVaultLockOutput]
  }
}

