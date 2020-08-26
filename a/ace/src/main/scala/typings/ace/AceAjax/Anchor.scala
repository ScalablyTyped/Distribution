package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  /**
    * When called, the `'change'` event listener is removed.
    **/
  def detach(): Unit = js.native
  /**
    * Returns the current document.
    **/
  def getDocument(): Document = js.native
  /**
    * Returns an object identifying the `row` and `column` position of the current anchor.
    **/
  def getPosition(): Position = js.native
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  /**
    * Fires whenever the anchor position changes.
    * Both of these objects have a `row` and `column` property corresponding to the position.
    * Events that can trigger this function include [[Anchor.setPosition `setPosition()`]].
    * @param e An object containing information about the anchor position. It has two properties:
    * - `old`: An object describing the old Anchor position
    * - `value`: An object describing the new Anchor position
    **/
  def onChange(e: js.Any): Unit = js.native
  /**
    * Sets the anchor position to the specified row and column. If `noClip` is `true`, the position is not clipped.
    * @param row The row index to move the anchor to
    * @param column The column index to move the anchor to
    * @param noClip Identifies if you want the position to be clipped
    **/
  def setPosition(row: Double, column: Double, noClip: Boolean): Unit = js.native
}

object Anchor {
  @scala.inline
  def apply(
    detach: () => Unit,
    getDocument: () => Document,
    getPosition: () => Position,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    onChange: js.Any => Unit,
    setPosition: (Double, Double, Boolean) => Unit
  ): Anchor = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getDocument = js.Any.fromFunction0(getDocument), getPosition = js.Any.fromFunction0(getPosition), on = js.Any.fromFunction2(on), onChange = js.Any.fromFunction1(onChange), setPosition = js.Any.fromFunction3(setPosition))
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDocument(value: () => Document): Self = this.set("getDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => Position): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOnChange(value: js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: (Double, Double, Boolean) => Unit): Self = this.set("setPosition", js.Any.fromFunction3(value))
  }
  
}

