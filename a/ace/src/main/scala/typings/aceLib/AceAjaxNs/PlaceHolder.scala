package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceHolder extends js.Object {
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): scala.Unit
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): scala.Unit
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): scala.Unit
  def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): scala.Unit
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): scala.Unit
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): scala.Unit
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): scala.Unit
}

object PlaceHolder {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    detach: js.Function0[scala.Unit],
    hideOtherMarkers: js.Function0[scala.Unit],
    on: js.Function2[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Unit],
    onCursorChange: js.Function0[scala.Unit],
    onUpdate: js.Function0[scala.Unit],
    setup: js.Function0[scala.Unit],
    showOtherMarkers: js.Function0[scala.Unit]
  ): PlaceHolder = {
    val __obj = js.Dynamic.literal(cancel = cancel, detach = detach, hideOtherMarkers = hideOtherMarkers, on = on, onCursorChange = onCursorChange, onUpdate = onUpdate, setup = setup, showOtherMarkers = showOtherMarkers)
  
    __obj.asInstanceOf[PlaceHolder]
  }
}

