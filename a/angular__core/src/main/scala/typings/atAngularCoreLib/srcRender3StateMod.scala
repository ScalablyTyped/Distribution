package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/state", JSImport.Namespace)
@js.native
object srcRender3StateMod extends js.Object {
  def decreaseElementDepthCount(): scala.Unit = js.native
  def disableBindings(): scala.Unit = js.native
  def enableBindings(): scala.Unit = js.native
  def enterView(newView: atAngularCoreLib.srcRender3InterfacesViewMod.LView): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def enterView(
    newView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def enterView(
    newView: atAngularCoreLib.srcRender3InterfacesViewMod.LView,
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TViewNode
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getBindingRoot(): scala.Double = js.native
  def getBindingsEnabled(): scala.Boolean = js.native
  def getCheckNoChangesMode(): scala.Boolean = js.native
  def getContextLView(): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getCurrentDirectiveDef(): atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_] | atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_] | scala.Null = js.native
  def getElementDepthCount(): scala.Double = js.native
  def getFirstTemplatePass(): scala.Boolean = js.native
  def getIsParent(): scala.Boolean = js.native
  def getLView(): atAngularCoreLib.srcRender3InterfacesViewMod.LView = js.native
  def getOrCreateCurrentQueries(QueryType: atAngularCoreLib.Anon_LQueries): atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries = js.native
  def getPreviousOrParentTNode(): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def increaseElementDepthCount(): scala.Unit = js.native
  def isCreationMode(): scala.Boolean = js.native
  def isCreationMode(view: atAngularCoreLib.srcRender3InterfacesViewMod.LView): scala.Boolean = js.native
  def leaveView(newView: atAngularCoreLib.srcRender3InterfacesViewMod.LView): scala.Unit = js.native
  def nextContextImpl[T](): T = js.native
  def nextContextImpl[T](level: scala.Double): T = js.native
  def resetComponentState(): scala.Unit = js.native
  def restoreView(viewToRestore: atAngularCoreLib.srcRender3InterfacesViewMod.OpaqueViewState): scala.Unit = js.native
  def setBindingRoot(value: scala.Double): scala.Unit = js.native
  def setCheckNoChangesMode(mode: scala.Boolean): scala.Unit = js.native
  def setCurrentDirectiveDef(): scala.Unit = js.native
  def setCurrentDirectiveDef(`def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]): scala.Unit = js.native
  def setCurrentDirectiveDef(`def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_]): scala.Unit = js.native
  def setFirstTemplatePass(value: scala.Boolean): scala.Unit = js.native
  def setIsParent(value: scala.Boolean): scala.Unit = js.native
  def setPreviousOrParentTNode(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Unit = js.native
  def setTNodeAndViewData(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LView
  ): scala.Unit = js.native
}

