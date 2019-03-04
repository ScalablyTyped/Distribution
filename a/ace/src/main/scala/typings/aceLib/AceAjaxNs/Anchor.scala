package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anchor extends js.Object {
  /**
    * When called, the `'change'` event listener is removed.
    **/
  def detach(): scala.Unit
  /**
    * Returns the current document.
    **/
  def getDocument(): Document
  /**
    * Returns an object identifying the `row` and `column` position of the current anchor.
    **/
  def getPosition(): Position
  def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit
  /**
    * Fires whenever the anchor position changes.
    * Both of these objects have a `row` and `column` property corresponding to the position.
    * Events that can trigger this function include [[Anchor.setPosition `setPosition()`]].
    * @param e An object containing information about the anchor position. It has two properties:
    * - `old`: An object describing the old Anchor position
    * - `value`: An object describing the new Anchor position
    **/
  def onChange(e: js.Any): scala.Unit
  /**
    * Sets the anchor position to the specified row and column. If `noClip` is `true`, the position is not clipped.
    * @param row The row index to move the anchor to
    * @param column The column index to move the anchor to
    * @param noClip Identifies if you want the position to be clipped
    **/
  def setPosition(row: scala.Double, column: scala.Double, noClip: scala.Boolean): scala.Unit
}

object Anchor {
  @scala.inline
  def apply(
    detach: js.Function0[scala.Unit],
    getDocument: js.Function0[Document],
    getPosition: js.Function0[Position],
    on: js.Function2[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Unit],
    onChange: js.Function1[js.Any, scala.Unit],
    setPosition: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit]
  ): Anchor = {
    val __obj = js.Dynamic.literal(detach = detach, getDocument = getDocument, getPosition = getPosition, on = on, onChange = onChange, setPosition = setPosition)
  
    __obj.asInstanceOf[Anchor]
  }
}

