package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/valueService/valueCache", JSImport.Namespace)
@js.native
object distLibValueServiceValueCacheMod extends js.Object {
  @js.native
  class ValueCache () extends js.Object {
    var active: js.Any = js.native
    var cacheVersion: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var neverExpires: js.Any = js.native
    def expire(): Unit = js.native
    def getValue(rowNode: RowNode, colId: String): js.Any = js.native
    def init(): Unit = js.native
    def onDataChanged(): Unit = js.native
    def setValue(rowNode: RowNode, colId: String, value: js.Any): js.Any = js.native
  }
  
}

