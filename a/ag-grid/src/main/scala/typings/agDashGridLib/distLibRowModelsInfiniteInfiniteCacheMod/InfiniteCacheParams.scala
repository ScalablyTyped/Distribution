package typings
package agDashGridLib.distLibRowModelsInfiniteInfiniteCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteCacheParams
  extends agDashGridLib.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams {
  var datasource: agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource
}

object InfiniteCacheParams {
  @scala.inline
  def apply(
    blockSize: scala.Double,
    datasource: agDashGridLib.distLibRowModelsIDatasourceMod.IDatasource,
    dynamicRowHeight: scala.Boolean,
    filterModel: js.Any,
    initialRowCount: scala.Double,
    lastAccessedSequence: agDashGridLib.distLibUtilsMod.NumberSequence,
    maxBlocksInCache: scala.Double,
    maxConcurrentRequests: scala.Double,
    overflowSize: scala.Double,
    rowHeight: scala.Double,
    rowNodeBlockLoader: agDashGridLib.distLibRowModelsCacheRowNodeBlockLoaderMod.RowNodeBlockLoader,
    sortModel: js.Any
  ): InfiniteCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize, datasource = datasource, dynamicRowHeight = dynamicRowHeight, filterModel = filterModel, initialRowCount = initialRowCount, lastAccessedSequence = lastAccessedSequence, maxBlocksInCache = maxBlocksInCache, maxConcurrentRequests = maxConcurrentRequests, overflowSize = overflowSize, rowHeight = rowHeight, rowNodeBlockLoader = rowNodeBlockLoader, sortModel = sortModel)
  
    __obj.asInstanceOf[InfiniteCacheParams]
  }
}

