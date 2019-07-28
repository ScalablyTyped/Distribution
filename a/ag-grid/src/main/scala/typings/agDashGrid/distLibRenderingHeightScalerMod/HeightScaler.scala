package typings.agDashGrid.distLibRenderingHeightScalerMod

import typings.agDashGrid.distLibContextBeanStubMod.BeanStub
import typings.agDashGrid.distLibGridPanelGridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/heightScaler", "HeightScaler")
@js.native
class HeightScaler () extends BeanStub {
  var eventService: js.Any = js.native
  var gridPanel: js.Any = js.native
  var maxDivHeight: js.Any = js.native
  var maxScrollY: js.Any = js.native
  var modelHeight: js.Any = js.native
  var offset: js.Any = js.native
  var pixelsToShave: js.Any = js.native
  var scaling: js.Any = js.native
  var scrollBarWidth: js.Any = js.native
  var scrollY: js.Any = js.native
  var uiBodyHeight: js.Any = js.native
  var uiContainerHeight: js.Any = js.native
  /* private */ def calculateOffset(): js.Any = js.native
  /* private */ def clearOffset(): js.Any = js.native
  def getOffset(): Double = js.native
  def getRealPixelPosition(modelPixel: Double): Double = js.native
  def getScrollPositionForPixel(rowTop: Double): Double = js.native
  /* private */ def getUiBodyHeight(): js.Any = js.native
  def getUiContainerHeight(): Double = js.native
  def isScaling(): Boolean = js.native
  /* private */ def postConstruct(): js.Any = js.native
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  def setModelHeight(modelHeight: Double): Unit = js.native
  /* private */ def setOffset(newOffset: js.Any): js.Any = js.native
  def update(): Unit = js.native
}

