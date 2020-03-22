package typings.angularCommon.mod

import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModuleFactory
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgComponentOutlet")
@js.native
class NgComponentOutlet protected ()
  extends OnChanges
     with OnDestroy {
  def this(_viewContainerRef: ViewContainerRef) = this()
  var _componentRef: js.Any = js.native
  var _moduleRef: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  var ngComponentOutlet: Type[_] = js.native
  var ngComponentOutletContent: js.Array[js.Array[_]] = js.native
  var ngComponentOutletInjector: Injector = js.native
  var ngComponentOutletNgModuleFactory: NgModuleFactory[_] = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

