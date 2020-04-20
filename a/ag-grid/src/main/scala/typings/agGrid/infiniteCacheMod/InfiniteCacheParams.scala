package typings.agGrid.infiniteCacheMod

import typings.agGrid.iDatasourceMod.IDatasource
import typings.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typings.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typings.agGrid.utilsMod.NumberSequence
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
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteCacheParams]
  }
}

