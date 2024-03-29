package typings.agGrid

import typings.agGrid.beanStubMod.BeanStub
import typings.agGrid.gridPanelMod.GridPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heightScalerMod {
  
  @JSImport("ag-grid/dist/lib/rendering/heightScaler", "HeightScaler")
  @js.native
  class HeightScaler () extends BeanStub {
    
    /* private */ def calculateOffset(): js.Any = js.native
    
    /* private */ def clearOffset(): js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    def getOffset(): Double = js.native
    
    def getRealPixelPosition(modelPixel: Double): Double = js.native
    
    def getScrollPositionForPixel(rowTop: Double): Double = js.native
    
    /* private */ def getUiBodyHeight(): js.Any = js.native
    
    def getUiContainerHeight(): Double = js.native
    
    /* private */ var gridPanel: js.Any = js.native
    
    def isScaling(): Boolean = js.native
    
    /* private */ var maxDivHeight: js.Any = js.native
    
    /* private */ var maxScrollY: js.Any = js.native
    
    /* private */ var modelHeight: js.Any = js.native
    
    /* private */ var offset: js.Any = js.native
    
    /* private */ var pixelsToShave: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ var scaling: js.Any = js.native
    
    /* private */ var scrollBarWidth: js.Any = js.native
    
    /* private */ var scrollY: js.Any = js.native
    
    def setModelHeight(modelHeight: Double): Unit = js.native
    
    /* private */ def setOffset(newOffset: js.Any): js.Any = js.native
    
    /* private */ var uiBodyHeight: js.Any = js.native
    
    /* private */ var uiContainerHeight: js.Any = js.native
    
    def update(): Unit = js.native
  }
}
