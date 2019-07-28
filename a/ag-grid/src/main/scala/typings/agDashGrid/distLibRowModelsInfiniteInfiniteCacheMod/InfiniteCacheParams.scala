package typings.agDashGrid.distLibRowModelsInfiniteInfiniteCacheMod

import typings.agDashGrid.distLibRowModelsCacheRowNodeBlockLoaderMod.RowNodeBlockLoader
import typings.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams
import typings.agDashGrid.distLibRowModelsIDatasourceMod.IDatasource
import typings.agDashGrid.distLibUtilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteCacheParams extends RowNodeCacheParams {
  var datasource: IDatasource
}

object InfiniteCacheParams {
  @scala.inline
  def apply(
    blockSize: Double,
    datasource: IDatasource,
    dynamicRowHeight: Boolean,
    filterModel: js.Any,
    initialRowCount: Double,
    lastAccessedSequence: NumberSequence,
    maxBlocksInCache: Double,
    maxConcurrentRequests: Double,
    overflowSize: Double,
    rowHeight: Double,
    rowNodeBlockLoader: RowNodeBlockLoader,
    sortModel: js.Any
  ): InfiniteCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize, datasource = datasource, dynamicRowHeight = dynamicRowHeight, filterModel = filterModel, initialRowCount = initialRowCount, lastAccessedSequence = lastAccessedSequence, maxBlocksInCache = maxBlocksInCache, maxConcurrentRequests = maxConcurrentRequests, overflowSize = overflowSize, rowHeight = rowHeight, rowNodeBlockLoader = rowNodeBlockLoader, sortModel = sortModel)
  
    __obj.asInstanceOf[InfiniteCacheParams]
  }
}

