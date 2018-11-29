package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/state", JSImport.Namespace)
@js.native
object srcRender3StateMod extends js.Object {
  def _getViewData(): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def assertDataInRange(index: scala.Double): scala.Unit = js.native
  def assertDataInRange(index: scala.Double, arr: js.Array[_]): scala.Unit = js.native
  def assertDataNext(index: scala.Double): scala.Unit = js.native
  def assertDataNext(index: scala.Double, arr: js.Array[_]): scala.Unit = js.native
  def assertHasParent(): scala.Unit = js.native
  def assertPreviousIsParent(): scala.Unit = js.native
  def decreaseElementDepthCount(): scala.Unit = js.native
  def disableBindings(): scala.Unit = js.native
  def enableBindings(): scala.Unit = js.native
  def enterView(newView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def enterView(
    newView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def enterView(
    newView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TViewNode
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getBindingRoot(): scala.Double = js.native
  def getBindingsEnabled(): scala.Boolean = js.native
  def getCheckNoChangesMode(): scala.Boolean = js.native
  def getCleanup(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): js.Array[_] = js.native
  def getContextViewData(): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getCreationMode(): scala.Boolean = js.native
  def getCurrentQueries(): atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries | scala.Null = js.native
  def getCurrentSanitizer(): atAngularCoreLib.srcSanitizationSecurityMod.Sanitizer | scala.Null = js.native
  def getCurrentView(): atAngularCoreLib.srcRender3InterfacesViewMod.OpaqueViewState = js.native
  def getElementDepthCount(): scala.Double = js.native
  def getFirstTemplatePass(): scala.Boolean = js.native
  def getIsParent(): scala.Boolean = js.native
  def getOrCreateCurrentQueries(QueryType: atAngularCoreLib.Anon_LQueries): atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries = js.native
  def getPreviousOrParentTNode(): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def getRenderer(): atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3 = js.native
  def getRendererFactory(): atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3 = js.native
  def getTView(): atAngularCoreLib.srcRender3InterfacesViewMod.TView = js.native
  def getTViewCleanup(view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): js.Array[_] = js.native
  def getViewData(): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def increaseElementDepthCount(): scala.Unit = js.native
  def leaveView(newView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Unit = js.native
  def leaveView(newView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, creationOnly: scala.Boolean): scala.Unit = js.native
  def nextContextImpl[T](): T = js.native
  def nextContextImpl[T](level: scala.Double): T = js.native
  def resetComponentState(): scala.Unit = js.native
  def restoreView(viewToRestore: atAngularCoreLib.srcRender3InterfacesViewMod.OpaqueViewState): scala.Unit = js.native
  def setBindingRoot(value: scala.Double): scala.Unit = js.native
  def setCheckNoChangesMode(mode: scala.Boolean): scala.Unit = js.native
  def setCurrentQueries(): scala.Unit = js.native
  def setCurrentQueries(queries: atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries): scala.Unit = js.native
  def setFirstTemplatePass(value: scala.Boolean): scala.Unit = js.native
  def setIsParent(value: scala.Boolean): scala.Unit = js.native
  def setPreviousOrParentTNode(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Unit = js.native
  def setRenderer(r: atAngularCoreLib.srcRender3InterfacesRendererMod.Renderer3): scala.Unit = js.native
  def setRendererFactory(factory: atAngularCoreLib.srcRender3InterfacesRendererMod.RendererFactory3): scala.Unit = js.native
  def setTNodeAndViewData(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Unit = js.native
}

