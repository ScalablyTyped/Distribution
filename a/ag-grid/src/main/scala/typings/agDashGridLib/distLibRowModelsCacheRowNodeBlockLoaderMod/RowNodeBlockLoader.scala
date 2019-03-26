package typings
package agDashGridLib.distLibRowModelsCacheRowNodeBlockLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlockLoader", "RowNodeBlockLoader")
@js.native
class RowNodeBlockLoader protected () extends js.Object {
  def this(maxConcurrentRequests: scala.Double) = this()
  var active: js.Any = js.native
  var activeBlockLoadsCount: js.Any = js.native
  var blocks: js.Any = js.native
  var logger: js.Any = js.native
  var maxConcurrentRequests: js.Any = js.native
  def addBlock(block: agDashGridLib.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock): scala.Unit = js.native
  def checkBlockToLoad(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getBlockState(): js.Any = js.native
  def loadComplete(): scala.Unit = js.native
  /* private */ def printCacheStatus(): js.Any = js.native
  def removeBlock(block: agDashGridLib.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock): scala.Unit = js.native
  /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
}

