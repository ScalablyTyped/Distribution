package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/valueService/changeDetectionService", JSImport.Namespace)
@js.native
object changeDetectionServiceMod extends js.Object {
  @js.native
  class ChangeDetectionService () extends BeanStub {
    var clientSideRowModel: js.Any = js.native
    var eventService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var rowModel: js.Any = js.native
    var rowRenderer: js.Any = js.native
    /* private */ def doChangeDetection(rowNode: js.Any, column: js.Any): js.Any = js.native
    /* private */ def init(): js.Any = js.native
    /* private */ def onCellValueChanged(event: js.Any): js.Any = js.native
  }
  
}

