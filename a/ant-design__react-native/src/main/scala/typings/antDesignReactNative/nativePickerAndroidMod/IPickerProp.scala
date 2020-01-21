package typings.antDesignReactNative.nativePickerAndroidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProp extends js.Object {
  var doScrollingComplete: js.Function
  var select: js.Function
}

object IPickerProp {
  @scala.inline
  def apply(doScrollingComplete: js.Function, select: js.Function): IPickerProp = {
    val __obj = js.Dynamic.literal(doScrollingComplete = doScrollingComplete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPickerProp]
  }
}

