package typings.agGrid.rowNodeCacheMod

import typings.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typings.agGrid.utilsMod.NumberSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowNodeCacheParams extends js.Object {
  var blockSize: Double = js.native
  var dynamicRowHeight: Boolean = js.native
  var filterModel: js.Any = js.native
  var initialRowCount: Double = js.native
  var lastAccessedSequence: NumberSequence = js.native
  var maxBlocksInCache: Double = js.native
  var maxConcurrentRequests: Double = js.native
  var overflowSize: Double = js.native
  var rowHeight: Double = js.native
  var rowNodeBlockLoader: RowNodeBlockLoader = js.native
  var sortModel: js.Any = js.native
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
  @scala.inline
  implicit class RowNodeCacheParamsOps[Self <: RowNodeCacheParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicRowHeight(value: Boolean): Self = this.set("dynamicRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterModel(value: js.Any): Self = this.set("filterModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialRowCount(value: Double): Self = this.set("initialRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastAccessedSequence(value: NumberSequence): Self = this.set("lastAccessedSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxBlocksInCache(value: Double): Self = this.set("maxBlocksInCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxConcurrentRequests(value: Double): Self = this.set("maxConcurrentRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflowSize(value: Double): Self = this.set("overflowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowNodeBlockLoader(value: RowNodeBlockLoader): Self = this.set("rowNodeBlockLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortModel(value: js.Any): Self = this.set("sortModel", value.asInstanceOf[js.Any])
  }
  
}

