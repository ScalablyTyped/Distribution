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
    `type`: atAngularCoreLib.srcTypeMod.Type[_]
  ): scala.Unit = js.native
  def bloomHashBitOrFactory(token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_]): js.UndefOr[scala.Double | js.Function] = js.native
  def bloomHashBitOrFactory(token: atAngularCoreLib.srcTypeMod.Type[_]): js.UndefOr[scala.Double | js.Function] = js.native
  def diPublic(`def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_]): scala.Unit = js.native
  def diPublicInInjector(
    injectorIndex: scala.Double,
    view: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    `def`: atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDef[_]
  ): scala.Unit = js.native
  def directiveInject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  def directiveInject[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T = js.native
  def directiveInject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def directiveInject[T](token: atAngularCoreLib.srcTypeMod.Type[T], flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags): T = js.native
  def getFactoryOf[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): (js.Function1[/* type */ js.UndefOr[atAngularCoreLib.srcTypeMod.Type[T]], T]) | scala.Null = js.native
  def getInheritedFactory[T](`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Function1[/* type */ atAngularCoreLib.srcTypeMod.Type[T], T] = js.native
  def getInjectorIndex(
    tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Double = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T]
  ): T | scala.Null = js.native
  def getOrCreateInjectable[T](
    hostTNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode,
    hostView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData,
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorMod.InjectFlags
  ): T | scala.Null = js.native
  def getOrCreateNodeInjector(): scala.Double = js.native
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
  ): scala.Double = js.native
  def getParentInjectorView(location: scala.Double, startView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData): atAngularCoreLib.srcRender3InterfacesViewMod.LViewData = js.native
  def injectAttribute(attrNameToInject: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def injectorHasToken(
    bloomHash: scala.Double,
    injectorIndex: scala.Double,
    injectorView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData
  ): scala.Boolean = js.native
  def injectorHasToken(
    bloomHash: scala.Double,
    injectorIndex: scala.Double,
    injectorView: atAngularCoreLib.srcRender3InterfacesViewMod.TData
  ): scala.Boolean = js.native
}

