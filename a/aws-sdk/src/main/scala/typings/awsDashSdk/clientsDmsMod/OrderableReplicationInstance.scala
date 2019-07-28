package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderableReplicationInstance extends js.Object {
  /**
    * List of Availability Zones for this replication instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.undefined
  /**
    * The default amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var DefaultAllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * The version of the replication engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var IncludedAllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
    */
  var MinAllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * The value returned when the specified EngineVersion of the replication instance is in Beta or test mode. This indicates some features might not work as expected.  AWS DMS supports ReleaseStatus in versions 3.1.4 and later. 
    */
  var ReleaseStatus: js.UndefOr[ReleaseStatusValues] = js.undefined
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  /**
    * The type of storage used by the replication instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
}

object OrderableReplicationInstance {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZonesList = null,
    DefaultAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    EngineVersion: String = null,
    IncludedAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    MinAllocatedStorage: js.UndefOr[Integer] = js.undefined,
    ReleaseStatus: ReleaseStatusValues = null,
    ReplicationInstanceClass: String = null,
    StorageType: String = null
  ): OrderableReplicationInstance = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (!js.isUndefined(DefaultAllocatedStorage)) __obj.updateDynamic("DefaultAllocatedStorage")(DefaultAllocatedStorage)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(IncludedAllocatedStorage)) __obj.updateDynamic("IncludedAllocatedStorage")(IncludedAllocatedStorage)
    if (!js.isUndefined(MaxAllocatedStorage)) __obj.updateDynamic("MaxAllocatedStorage")(MaxAllocatedStorage)
    if (!js.isUndefined(MinAllocatedStorage)) __obj.updateDynamic("MinAllocatedStorage")(MinAllocatedStorage)
    if (ReleaseStatus != null) __obj.updateDynamic("ReleaseStatus")(ReleaseStatus.asInstanceOf[js.Any])
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    __obj.asInstanceOf[OrderableReplicationInstance]
  }
}

