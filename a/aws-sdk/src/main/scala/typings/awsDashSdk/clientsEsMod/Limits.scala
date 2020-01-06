package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  /**
    *  List of additional limits that are specific to a given InstanceType and for each of it's  InstanceRole  . 
    */
  var AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.native
  var InstanceLimits: js.UndefOr[typings.awsDashSdk.clientsEsMod.InstanceLimits] = js.native
  /**
    * StorageType represents the list of storage related types and attributes that are available for given InstanceType. 
    */
  var StorageTypes: js.UndefOr[StorageTypeList] = js.native
}

object Limits {
  @scala.inline
  def apply(
    AdditionalLimits: AdditionalLimitList = null,
    InstanceLimits: InstanceLimits = null,
    StorageTypes: StorageTypeList = null
  ): Limits = {
    val __obj = js.Dynamic.literal()
    if (AdditionalLimits != null) __obj.updateDynamic("AdditionalLimits")(AdditionalLimits.asInstanceOf[js.Any])
    if (InstanceLimits != null) __obj.updateDynamic("InstanceLimits")(InstanceLimits.asInstanceOf[js.Any])
    if (StorageTypes != null) __obj.updateDynamic("StorageTypes")(StorageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
}

