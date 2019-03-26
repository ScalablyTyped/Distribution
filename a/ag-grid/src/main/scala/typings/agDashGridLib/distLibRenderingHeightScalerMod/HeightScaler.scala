package typings
package agDashGridLib.distLibRenderingHeightScalerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/heightScaler", "HeightScaler")
@js.native
class HeightScaler ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
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
  def getOffset(): scala.Double = js.native
  def getRealPixelPosition(modelPixel: scala.Double): scala.Double = js.native
  def getScrollPositionForPixel(rowTop: scala.Double): scala.Double = js.native
  /* private */ def getUiBodyHeight(): js.Any = js.native
  def getUiContainerHeight(): scala.Double = js.native
  def isScaling(): scala.Boolean = js.native
  /* private */ def postConstruct(): js.Any = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def setModelHeight(modelHeight: scala.Double): scala.Unit = js.native
  /* private */ def setOffset(newOffset: js.Any): js.Any = js.native
  def update(): scala.Unit = js.native
}

