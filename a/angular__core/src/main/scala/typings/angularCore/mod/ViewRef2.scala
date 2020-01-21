package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewRef2[T]
  extends EmbeddedViewRef[T]
     with InternalViewRef {
  var _appRef: js.Any = js.native
  var _componentIndex: js.Any = js.native
  var _context: js.Any = js.native
  var _lookUpContext: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  def attachToViewContainerRef(vcRef: ViewContainerRef): Unit = js.native
}

