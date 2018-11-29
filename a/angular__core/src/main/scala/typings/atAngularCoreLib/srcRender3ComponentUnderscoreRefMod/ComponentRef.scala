package typings
package atAngularCoreLib.srcRender3ComponentUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/component_ref", "ComponentRef")
@js.native
class ComponentRef[T] protected ()
  extends atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[T] {
  def this(componentType: atAngularCoreLib.srcTypeMod.Type[T], instance: T, location: atAngularCoreLib.srcLinkerElementUnderscoreRefMod.ElementRef[_], _rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, _tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TContainerNode) = this()
  def this(componentType: atAngularCoreLib.srcTypeMod.Type[T], instance: T, location: atAngularCoreLib.srcLinkerElementUnderscoreRefMod.ElementRef[_], _rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, _tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementContainerNode) = this()
  def this(componentType: atAngularCoreLib.srcTypeMod.Type[T], instance: T, location: atAngularCoreLib.srcLinkerElementUnderscoreRefMod.ElementRef[_], _rootView: atAngularCoreLib.srcRender3InterfacesViewMod.LViewData, _tNode: atAngularCoreLib.srcRender3InterfacesNodeMod.TElementNode) = this()
  var _rootView: js.Any = js.native
  var _tNode: js.Any = js.native
  @JSName("changeDetectorRef")
  var changeDetectorRef_ComponentRef: atAngularCoreLib.srcChangeUnderscoreDetectionChangeUnderscoreDetectorUnderscoreRefMod.ChangeDetectorRef = js.native
  @JSName("componentType")
  var componentType_ComponentRef: atAngularCoreLib.srcTypeMod.Type[T] = js.native
  var destroyCbs: js.Array[js.Function0[scala.Unit]] | scala.Null = js.native
  @JSName("hostView")
  var hostView_ComponentRef: atAngularCoreLib.srcRender3ViewUnderscoreRefMod.ViewRef[T] = js.native
  def onDestroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

