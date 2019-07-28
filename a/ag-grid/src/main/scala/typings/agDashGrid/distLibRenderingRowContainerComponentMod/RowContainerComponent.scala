package typings.agDashGrid.distLibRenderingRowContainerComponentMod

import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowContainerComponent", "RowContainerComponent")
@js.native
class RowContainerComponent protected () extends js.Object {
  def this(params: RowContainerComponentParams) = this()
  var afterGuiAttachedCallbacks: js.Any = js.native
  var childCount: js.Any = js.native
  var domOrder: js.Any = js.native
  val eContainer: js.Any = js.native
  val eViewport: js.Any = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  val hideWhenNoChildren: js.Any = js.native
  var lastPlacedElement: js.Any = js.native
  var rowTemplatesToAdd: js.Any = js.native
  var scrollTop: js.Any = js.native
  var visible: js.Any = js.native
  def appendRowTemplate(rowTemplate: String, callback: js.Function0[Unit]): Unit = js.native
  /* private */ def checkVisibility(): js.Any = js.native
  def ensureDomOrder(eRow: HTMLElement): Unit = js.native
  def flushRowTemplates(): Unit = js.native
  def getRowElement(compId: Double): HTMLElement = js.native
  /* private */ def postConstruct(): js.Any = js.native
  def removeRowElement(eRow: HTMLElement): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setVerticalScrollPosition(verticalScrollPosition: Double): Unit = js.native
}

