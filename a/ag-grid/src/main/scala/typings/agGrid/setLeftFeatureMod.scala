package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.beansMod.Beans
import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/features/setLeftFeature", JSImport.Namespace)
@js.native
object setLeftFeatureMod extends js.Object {
  @js.native
  class SetLeftFeature protected () extends BeanStub {
    def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
    def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans, colsSpanning: js.Array[Column]) = this()
    var actualLeft: js.Any = js.native
    var beans: js.Any = js.native
    var colsSpanning: js.Any = js.native
    var columnOrGroup: js.Any = js.native
    var eCell: js.Any = js.native
    /* private */ def animateInLeft(): js.Any = js.native
    def getColumnOrGroup(): ColumnGroupChild = js.native
    def init(): Unit = js.native
    /* private */ def onLeftChanged(): js.Any = js.native
    def setColsSpanning(colsSpanning: js.Array[Column]): Unit = js.native
    /* private */ def setLeft(value: js.Any): js.Any = js.native
    /* private */ def setLeftFirstTime(): js.Any = js.native
  }
  
}

