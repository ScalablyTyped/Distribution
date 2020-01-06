package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCacheOutput extends js.Object {
  /**
    * The amount of cache in bytes allocated to the a gateway.
    */
  var CacheAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
    */
  var CacheDirtyPercentage: js.UndefOr[double] = js.native
  /**
    * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheHitPercentage: js.UndefOr[double] = js.native
  /**
    * Percent of application read operations from the file shares that are not served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheMissPercentage: js.UndefOr[double] = js.native
  /**
    * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
    */
  var CacheUsedPercentage: js.UndefOr[double] = js.native
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.native
}

object DescribeCacheOutput {
  @scala.inline
  def apply(
    CacheAllocatedInBytes: Int | Double = null,
    CacheDirtyPercentage: Int | Double = null,
    CacheHitPercentage: Int | Double = null,
    CacheMissPercentage: Int | Double = null,
    CacheUsedPercentage: Int | Double = null,
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null
  ): DescribeCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (CacheAllocatedInBytes != null) __obj.updateDynamic("CacheAllocatedInBytes")(CacheAllocatedInBytes.asInstanceOf[js.Any])
    if (CacheDirtyPercentage != null) __obj.updateDynamic("CacheDirtyPercentage")(CacheDirtyPercentage.asInstanceOf[js.Any])
    if (CacheHitPercentage != null) __obj.updateDynamic("CacheHitPercentage")(CacheHitPercentage.asInstanceOf[js.Any])
    if (CacheMissPercentage != null) __obj.updateDynamic("CacheMissPercentage")(CacheMissPercentage.asInstanceOf[js.Any])
    if (CacheUsedPercentage != null) __obj.updateDynamic("CacheUsedPercentage")(CacheUsedPercentage.asInstanceOf[js.Any])
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheOutput]
  }
}

