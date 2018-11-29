package typings
package atAngularCoreLib.srcRender3DiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/di", JSImport.Namespace)
@js.native
object srcRender3DiModMembers extends js.Object {
  def bloomAdd(
    injectorIndex: scala.Double,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    `type`: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_]
  ): scala.Unit = js.native
  def bloomAdd(
    injectorIndex: scala.Double,
    tView: atAngularCoreLib.srcRender3InterfacesViewMod.TView,
    `type`: atAngularCoreLib.srcTypeMod.Type[_]
  ): scala.Unit = js.native
  def bloomHasToken(
    bloomHash: scala.Double,
    injectorIndex: scala.Double,
    injectorView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Boolean = js.native
  def bloomHasToken(
    bloomHash: scala.Double,
    injectorIndex: scala.Double,
    injectorView: atAngularCoreLib.srcRender3InterfacesViewMod.TData
  ): scala.Boolean = js.native
  def bloomHashBitOrFactory(token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_]): js.UndefOr[scala.Double | js.Function] = js.native
  def bloomHashBitOrFactory(token: atAngularCoreLib.srcTypeMod.Type[_]): js.UndefOr[scala.Double | js.Function] = js.native
  def diPublicInInjector(
    injectorIndex: scala.Double,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_]
  ): scala.Unit = js.native
  def diPublicInInjector(
    injectorIndex: scala.Double,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[_]
  ): scala.Unit = js.native
  def getFactoryOf[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): (js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T] | scala.Null, T]) | scala.Null = js.native
  def getInheritedFactory[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], T] = js.native
  def getInjectorIndex(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Double = js.native
  def getNodeInjectable(
    tData: atAngularCoreLib.srcRender3InterfacesViewMod.TData,
    lData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    index: scala.Double,
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode
  ): js.Any = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    lViewData: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags,
    notFoundValue: js.Any
  ): T | scala.Null = js.native
  def getOrCreateNodeInjectorForNode(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Double = js.native
  def getOrCreateNodeInjectorForNode(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Double = js.native
  def getOrCreateNodeInjectorForNode(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Double = js.native
  def getParentInjectorLocation(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): atAngularCoreLib.srcRender3InterfacesInjectorMod.RelativeInjectorLocation = js.native
  def injectAttributeImpl(tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode, attrNameToInject: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def injectInjector(): NodeInjector = js.native
}

