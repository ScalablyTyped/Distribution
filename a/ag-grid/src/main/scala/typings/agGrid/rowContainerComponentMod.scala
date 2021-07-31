package typings.agGrid

import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowContainerComponentMod {
  
  @JSImport("ag-grid/dist/lib/rendering/rowContainerComponent", "RowContainerComponent")
  @js.native
  class RowContainerComponent protected () extends StObject {
    def this(params: RowContainerComponentParams) = this()
    
    var afterGuiAttachedCallbacks: js.Any = js.native
    
    def appendRowTemplate(rowTemplate: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* private */ def checkVisibility(): js.Any = js.native
    
    var childCount: js.Any = js.native
    
    var domOrder: js.Any = js.native
    
    val eContainer: js.Any = js.native
    
    val eViewport: js.Any = js.native
    
    def ensureDomOrder(eRow: HTMLElement): Unit = js.native
    
    def flushRowTemplates(): Unit = js.native
    
    def getRowElement(compId: Double): HTMLElement = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    val hideWhenNoChildren: js.Any = js.native
    
    var lastPlacedElement: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    def removeRowElement(eRow: HTMLElement): Unit = js.native
    
    var rowTemplatesToAdd: js.Any = js.native
    
    var scrollTop: js.Any = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setVerticalScrollPosition(verticalScrollPosition: Double): Unit = js.native
    
    var visible: js.Any = js.native
  }
  
  trait RowContainerComponentParams extends StObject {
    
    var eContainer: HTMLElement
    
    var eViewport: js.UndefOr[HTMLElement] = js.undefined
    
    var hideWhenNoChildren: js.UndefOr[Boolean] = js.undefined
  }
  object RowContainerComponentParams {
    
    @scala.inline
    def apply(eContainer: HTMLElement): RowContainerComponentParams = {
      val __obj = js.Dynamic.literal(eContainer = eContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowContainerComponentParams]
    }
    
    @scala.inline
    implicit class RowContainerComponentParamsMutableBuilder[Self <: RowContainerComponentParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEContainer(value: HTMLElement): Self = StObject.set(x, "eContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEViewport(value: HTMLElement): Self = StObject.set(x, "eViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEViewportUndefined: Self = StObject.set(x, "eViewport", js.undefined)
      
      @scala.inline
      def setHideWhenNoChildren(value: Boolean): Self = StObject.set(x, "hideWhenNoChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideWhenNoChildrenUndefined: Self = StObject.set(x, "hideWhenNoChildren", js.undefined)
    }
  }
}
