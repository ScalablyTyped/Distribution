package typings.awsDashSdk.clientsOutpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outpost extends js.Object {
  var AvailabilityZone: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.AvailabilityZone] = js.native
  var AvailabilityZoneId: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.AvailabilityZoneId] = js.native
  var Description: js.UndefOr[OutpostDescription] = js.native
  var LifeCycleStatus: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.LifeCycleStatus] = js.native
  var Name: js.UndefOr[OutpostName] = js.native
  var OutpostArn: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.OutpostArn] = js.native
  var OutpostId: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.OutpostId] = js.native
  var OwnerId: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.OwnerId] = js.native
  var SiteId: js.UndefOr[typings.awsDashSdk.clientsOutpostsMod.SiteId] = js.native
}

object Outpost {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZone = null,
    AvailabilityZoneId: AvailabilityZoneId = null,
    Description: OutpostDescription = null,
    LifeCycleStatus: LifeCycleStatus = null,
    Name: OutpostName = null,
    OutpostArn: OutpostArn = null,
    OutpostId: OutpostId = null,
    OwnerId: OwnerId = null,
    SiteId: SiteId = null
  ): Outpost = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LifeCycleStatus != null) __obj.updateDynamic("LifeCycleStatus")(LifeCycleStatus.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (OutpostId != null) __obj.updateDynamic("OutpostId")(OutpostId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outpost]
  }
}

