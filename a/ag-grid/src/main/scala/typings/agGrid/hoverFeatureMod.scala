package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.columnMod.Column
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/hoverFeature", JSImport.Namespace)
@js.native
object hoverFeatureMod extends js.Object {
  
  @js.native
  class HoverFeature protected () extends BeanStub {
    def this(columns: js.Array[Column], element: HTMLElement) = this()
    
    /* private */ def addMouseHoverListeners(element: js.Any): js.Any = js.native
    
    var columnHoverService: js.Any = js.native
    
    var columns: js.Any = js.native
    
    /* private */ def onMouseOut(): js.Any = js.native
    
    /* private */ def onMouseOver(): js.Any = js.native
  }
}
