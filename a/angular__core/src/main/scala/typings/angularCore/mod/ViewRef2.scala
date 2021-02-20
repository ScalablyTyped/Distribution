package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewRef2[T]
  extends EmbeddedViewRef[T]
     with InternalViewRef {
  
  var _appRef: js.Any = js.native
  
  /**
    * This represents the `LView` associated with the point where `ChangeDetectorRef` was
    * requested.
    *
    * This may be different from `_lView` if the `_cdRefInjectingView` is an embedded view.
    */
  var _cdRefInjectingView: js.Any = js.native
  
  var _viewContainerRef: js.Any = js.native
  
  def attachToViewContainerRef(vcRef: ViewContainerRef): Unit = js.native
}
