package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheOutput extends js.Object {
  /**
    * The amount of cache in bytes allocated to the a gateway.
    */
  var CacheAllocatedInBytes: js.UndefOr[long] = js.undefined
  /**
    * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
    */
  var CacheDirtyPercentage: js.UndefOr[double] = js.undefined
  /**
    * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheHitPercentage: js.UndefOr[double] = js.undefined
  /**
    * 
    */
  var CacheMissPercentage: js.UndefOr[double] = js.undefined
  /**
    * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
    */
  var CacheUsedPercentage: js.UndefOr[double] = js.undefined
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: js.UndefOr[DiskIds] = js.undefined
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
}

object DescribeCacheOutput {
  @scala.inline
  def apply(
    CacheAllocatedInBytes: js.UndefOr[long] = js.undefined,
    CacheDirtyPercentage: js.UndefOr[double] = js.undefined,
    CacheHitPercentage: js.UndefOr[double] = js.undefined,
    CacheMissPercentage: js.UndefOr[double] = js.undefined,
    CacheUsedPercentage: js.UndefOr[double] = js.undefined,
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null
  ): DescribeCacheOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CacheAllocatedInBytes)) __obj.updateDynamic("CacheAllocatedInBytes")(CacheAllocatedInBytes)
    if (!js.isUndefined(CacheDirtyPercentage)) __obj.updateDynamic("CacheDirtyPercentage")(CacheDirtyPercentage)
    if (!js.isUndefined(CacheHitPercentage)) __obj.updateDynamic("CacheHitPercentage")(CacheHitPercentage)
    if (!js.isUndefined(CacheMissPercentage)) __obj.updateDynamic("CacheMissPercentage")(CacheMissPercentage)
    if (!js.isUndefined(CacheUsedPercentage)) __obj.updateDynamic("CacheUsedPercentage")(CacheUsedPercentage)
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[DescribeCacheOutput]
  }
}

