package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/util", JSImport.Namespace)
@js.native
object srcRender3UtilMod extends js.Object {
  val defaultScheduler: js.Any = js.native
  def addAllToArray(items: js.Array[_], arr: js.Array[_]): scala.Unit = js.native
  def assertDataInRangeInternal(index: scala.Double, arr: js.Array[_]): scala.Unit = js.native
  def flatten(list: js.Array[_]): js.Array[_] = js.native
  def getComponentViewByIndex(nodeIndex: scala.Double, hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getNativeByIndex(index: scala.Double, arr: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def getNativeByTNode(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement | atAngularCoreLib.srcRender3InterfacesRendererMod.RText | atAngularCoreLib.srcRender3InterfacesRendererMod.RComment = js.native
  def getParentInjectorIndex(parentLocation: atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation): scala.Double = js.native
  def getParentInjectorTNode(
    location: atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation,
    startView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    startTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode
  ): atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode | atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode | scala.Null = js.native
  def getParentInjectorView(
    location: atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation,
    startView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getParentInjectorViewOffset(parentLocation: atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation): scala.Double = js.native
  def getRootContext(viewOrComponent: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootContext(viewOrComponent: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.RootContext = js.native
  def getRootView(target: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getRootView(target: js.Object): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def getTNode(index: scala.Double, view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesNodeMod.TNode = js.native
  def hasParentInjector(parentLocation: atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation): scala.Boolean = js.native
  def isComponent(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Boolean = js.native
  def isComponentDef[T](`def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[T]): /* is ComponentDef */scala.Boolean = js.native
  def isContentQueryHost(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode): scala.Boolean = js.native
  def isDifferent(a: js.Any, b: js.Any, checkNoChangesMode: scala.Boolean): scala.Boolean = js.native
  def isLContainer(value: atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer): scala.Boolean = js.native
  def isLContainer(value: atAngularCoreLib.srcRender3InterfacesRendererMod.RComment): scala.Boolean = js.native
  def isLContainer(value: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement): scala.Boolean = js.native
  def isLContainer(value: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext): scala.Boolean = js.native
  def isRootView(target: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): scala.Boolean = js.native
  def loadInternal[T](index: scala.Double, arr: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): T = js.native
  def loadInternal[T](index: scala.Double, arr: atAngularCoreLib.srcRender3InterfacesViewMod.TData): T = js.native
  def readElementValue(value: atAngularCoreLib.srcRender3InterfacesContainerMod.LContainer): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def readElementValue(value: atAngularCoreLib.srcRender3InterfacesRendererMod.RElement): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def readElementValue(value: atAngularCoreLib.srcRender3InterfacesStylingMod.StylingContext): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def readElementValue(value: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesRendererMod.RElement = js.native
  def readPatchedData(target: js.Any): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData | atAngularCoreLib.srcRender3InterfacesContextMod.LContext | scala.Null = js.native
  def readPatchedLViewData(target: js.Any): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData | scala.Null = js.native
  def stringify(value: js.Any): java.lang.String = js.native
}

