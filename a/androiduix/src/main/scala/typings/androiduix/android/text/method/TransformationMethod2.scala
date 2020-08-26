package typings.androiduix.android.text.method

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationMethod2 extends TransformationMethod {
  def setLengthChangesAllowed(allowLengthChanges: Boolean): Unit = js.native
}

object TransformationMethod2 {
  @scala.inline
  def apply(
    getTransformation: (String, View) => String,
    onFocusChanged: (View, String, Boolean, Double, Rect) => Unit,
    setLengthChangesAllowed: Boolean => Unit
  ): TransformationMethod2 = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
    __obj.asInstanceOf[TransformationMethod2]
  }
  @scala.inline
  implicit class TransformationMethod2Ops[Self <: TransformationMethod2] (val x: Self) extends AnyVal {
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
    def setSetLengthChangesAllowed(value: Boolean => Unit): Self = this.set("setLengthChangesAllowed", js.Any.fromFunction1(value))
  }
  
}

