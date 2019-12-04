package typings.agDashGrid

import typings.agDashGrid.distLibContextBeanStubMod.BeanStub
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/hoverFeature", JSImport.Namespace)
@js.native
object distLibHeaderRenderingHoverFeatureMod extends js.Object {
  @js.native
  class HoverFeature protected () extends BeanStub {
    def this(columns: js.Array[Column], element: HTMLElement) = this()
    var columnHoverService: js.Any = js.native
    var columns: js.Any = js.native
    /* private */ def addMouseHoverListeners(element: js.Any): js.Any = js.native
    /* private */ def onMouseOut(): js.Any = js.native
    /* private */ def onMouseOver(): js.Any = js.native
  }
  
}

