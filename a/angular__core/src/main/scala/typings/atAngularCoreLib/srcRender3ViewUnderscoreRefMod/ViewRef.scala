package typings
package atAngularCoreLib.srcRender3ViewUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAngularCoreLib.srcRender3ViewUnderscoreRefMod.viewEngine_ChangeDetectorRef_interface because Already inherited */ @JSImport("@angular/core/src/render3/view_ref", "ViewRef")
@js.native
class ViewRef[T] protected ()
  extends atAngularCoreLib.srcLinkerViewUnderscoreRefMod.EmbeddedViewRef[T]
     with atAngularCoreLib.srcLinkerViewUnderscoreRefMod.InternalViewRef {
  def this(_lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView, _context: T, _componentIndex: scala.Double) = this()
  def this(_lView: atAngularCoreLib.srcRender3InterfacesViewMod.LView, _context: scala.Null, _componentIndex: scala.Double) = this()
  var _appRef: js.Any = js.native
  var _componentIndex: js.Any = js.native
  var _context: js.Any = js.native
  var _lookUpContext: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  def attachToViewContainerRef(vcRef: atAngularCoreLib.srcLinkerViewUnderscoreContainerUnderscoreRefMod.ViewContainerRef): scala.Unit = js.native
}

