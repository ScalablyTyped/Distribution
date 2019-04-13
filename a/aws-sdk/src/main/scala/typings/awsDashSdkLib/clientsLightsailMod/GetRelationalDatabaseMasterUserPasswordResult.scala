package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.undefined
}

object GetRelationalDatabaseMasterUserPasswordResult {
  @scala.inline
  def apply(createdAt: IsoDate = null, masterUserPassword: SensitiveString = null): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (masterUserPassword != null) __obj.updateDynamic("masterUserPassword")(masterUserPassword)
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
}

