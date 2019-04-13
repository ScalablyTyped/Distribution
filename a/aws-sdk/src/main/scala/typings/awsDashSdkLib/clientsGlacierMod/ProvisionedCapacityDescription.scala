package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedCapacityDescription extends js.Object {
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var CapacityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
    */
  var ExpirationDate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
    */
  var StartDate: js.UndefOr[java.lang.String] = js.undefined
}

object ProvisionedCapacityDescription {
  @scala.inline
  def apply(
    CapacityId: java.lang.String = null,
    ExpirationDate: java.lang.String = null,
    StartDate: java.lang.String = null
  ): ProvisionedCapacityDescription = {
    val __obj = js.Dynamic.literal()
    if (CapacityId != null) __obj.updateDynamic("CapacityId")(CapacityId)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[ProvisionedCapacityDescription]
  }
}

