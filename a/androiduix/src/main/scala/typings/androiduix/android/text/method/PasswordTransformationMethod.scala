package typings.androiduix.android.text.method

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordTransformationMethod extends SingleLineTransformationMethod

object PasswordTransformationMethod {
  @scala.inline
  def apply(
    getOriginal: () => js.Array[String],
    getReplacement: () => js.Array[String],
    getTransformation: (String, View) => String,
    onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
  ): PasswordTransformationMethod = {
    val __obj = js.Dynamic.literal(getOriginal = js.Any.fromFunction0(getOriginal), getReplacement = js.Any.fromFunction0(getReplacement), getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
    __obj.asInstanceOf[PasswordTransformationMethod]
  }
}

