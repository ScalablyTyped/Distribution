package typings
package atAngularCommonLib.srcDirectivesNgUnderscoreComponentUnderscoreOutletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/directives/ng_component_outlet", "NgComponentOutlet")
@js.native
class NgComponentOutlet protected ()
  extends atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnDestroy {
  def this(_viewContainerRef: atAngularCoreLib.coreMod.ViewContainerRef) = this()
  var _componentRef: js.Any = js.native
  var _moduleRef: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  var ngComponentOutlet: atAngularCoreLib.srcTypeMod.Type[_] = js.native
  var ngComponentOutletContent: js.Array[js.Array[_]] = js.native
  var ngComponentOutletInjector: atAngularCoreLib.coreMod.Injector = js.native
  var ngComponentOutletNgModuleFactory: atAngularCoreLib.coreMod.NgModuleFactory[_] = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
}

