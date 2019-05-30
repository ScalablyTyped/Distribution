package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "ɵDomSharedStylesHost")
@js.native
class ɵDomSharedStylesHost protected ()
  extends ɵSharedStylesHost
     with atAngularCoreLib.atAngularCoreMod.OnDestroy {
  def this(_doc: js.Any) = this()
  var _addStylesToHost: js.Any = js.native
  var _doc: js.Any = js.native
  var _hostNodes: js.Any = js.native
  var _styleNodes: js.Any = js.native
  def addHost(hostNode: stdLib.Node): scala.Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  def removeHost(hostNode: stdLib.Node): scala.Unit = js.native
}

