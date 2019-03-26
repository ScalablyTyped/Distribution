package typings
package agDashGridLib.distLibRenderingRowContainerComponentMod

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
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  val hideWhenNoChildren: js.Any = js.native
  var lastPlacedElement: js.Any = js.native
  var rowTemplatesToAdd: js.Any = js.native
  var scrollTop: js.Any = js.native
  var visible: js.Any = js.native
  def appendRowTemplate(rowTemplate: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /* private */ def checkVisibility(): js.Any = js.native
  def ensureDomOrder(eRow: stdLib.HTMLElement): scala.Unit = js.native
  def flushRowTemplates(): scala.Unit = js.native
  def getRowElement(compId: scala.Double): stdLib.HTMLElement = js.native
  /* private */ def postConstruct(): js.Any = js.native
  def removeRowElement(eRow: stdLib.HTMLElement): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setVerticalScrollPosition(verticalScrollPosition: scala.Double): scala.Unit = js.native
}

