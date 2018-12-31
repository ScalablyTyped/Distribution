package typings
package atAngularCommonLib.srcViewportUnderscoreScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/viewport_scroller", "BrowserViewportScroller")
@js.native
class BrowserViewportScroller protected () extends ViewportScroller {
  def this(document: js.Any, window: js.Any) = this()
  var document: js.Any = js.native
  var offset: js.Any = js.native
  var scrollToElement: js.Any = js.native
  /**
    * We only support scroll restoration when we can get a hold of window.
    * This means that we do not support this behavior when running in a web worker.
    *
    * Lifting this restriction right now would require more changes in the dom adapter.
    * Since webworkers aren't widely used, we will lift it once RouterScroller is
    * battle-tested.
    */
  var supportScrollRestoration: js.Any = js.native
  var window: js.Any = js.native
}

