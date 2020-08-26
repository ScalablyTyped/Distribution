package typings.androiduix.android.widget.AbsSpinner

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBin extends js.Object {
  var _AbsSpinner_this: typings.androiduix.android.widget.AbsSpinner = js.native
  var mScrapHeap: js.Any = js.native
  def clear(): Unit = js.native
  def get(position: Double): View = js.native
  def put(position: Double, v: View): Unit = js.native
}

object RecycleBin {
  @scala.inline
  def apply(
    _AbsSpinner_this: typings.androiduix.android.widget.AbsSpinner,
    clear: () => Unit,
    get: Double => View,
    mScrapHeap: js.Any,
    put: (Double, View) => Unit
  ): RecycleBin = {
    val __obj = js.Dynamic.literal(_AbsSpinner_this = _AbsSpinner_this.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), mScrapHeap = mScrapHeap.asInstanceOf[js.Any], put = js.Any.fromFunction2(put))
    __obj.asInstanceOf[RecycleBin]
  }
  @scala.inline
  implicit class RecycleBinOps[Self <: RecycleBin] (val x: Self) extends AnyVal {
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
    def set_AbsSpinner_this(value: typings.androiduix.android.widget.AbsSpinner): Self = this.set("_AbsSpinner_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: Double => View): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setMScrapHeap(value: js.Any): Self = this.set("mScrapHeap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPut(value: (Double, View) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
  }
  
}

