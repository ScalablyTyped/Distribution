package typings
package agDashGridLib.distLibRowModelsCacheRowNodeCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowNodeCacheParams extends js.Object {
  var blockSize: scala.Double
  var dynamicRowHeight: scala.Boolean
  var filterModel: js.Any
  var initialRowCount: scala.Double
  var lastAccessedSequence: agDashGridLib.distLibUtilsMod.NumberSequence
  var maxBlocksInCache: scala.Double
  var maxConcurrentRequests: scala.Double
  var overflowSize: scala.Double
  var rowHeight: scala.Double
  var rowNodeBlockLoader: agDashGridLib.distLibRowModelsCacheRowNodeBlockLoaderMod.RowNodeBlockLoader
  var sortModel: js.Any
}

object RowNodeCacheParams {
  @scala.inline
  def apply(
    blockSize: scala.Double,
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
  ): RowNodeCacheParams = {
    val __obj = js.Dynamic.literal(blockSize = blockSize, dynamicRowHeight = dynamicRowHeight, filterModel = filterModel, initialRowCount = initialRowCount, lastAccessedSequence = lastAccessedSequence, maxBlocksInCache = maxBlocksInCache, maxConcurrentRequests = maxConcurrentRequests, overflowSize = overflowSize, rowHeight = rowHeight, rowNodeBlockLoader = rowNodeBlockLoader, sortModel = sortModel)
  
    __obj.asInstanceOf[RowNodeCacheParams]
  }
}

