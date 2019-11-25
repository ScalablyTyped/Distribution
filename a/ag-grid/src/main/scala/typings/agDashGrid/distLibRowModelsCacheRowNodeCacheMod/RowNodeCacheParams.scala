package typings.agDashGrid.distLibRowModelsCacheRowNodeCacheMod

import typings.agDashGrid.distLibRowModelsCacheRowNodeBlockLoaderMod.RowNodeBlockLoader
import typings.agDashGrid.distLibUtilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeCacheParams extends js.Object {
  var blockSize: Double
  var dynamicRowHeight: Boolean
  var filterModel: js.Any
  var initialRowCount: Double
  var lastAccessedSequence: NumberSequence
  var maxBlocksInCache: Double
  var maxConcurrentRequests: Double
  var overflowSize: Double
  var rowHeight: Double
  var rowNodeBlockLoader: RowNodeBlockLoader
  var sortModel: js.Any
}

object RowNodeCacheParams {
  @scala.inline
  def apply(
    blockSize: Double,
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
  ): RowNodeCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowNodeCacheParams]
  }
}

