package typings.antDesignReactNative.checkboxPropsTypeMod

import typings.antDesignReactNative.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeParams extends js.Object {
  var target: Checked
}

object OnChangeParams {
  @scala.inline
  def apply(target: Checked): OnChangeParams = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
}

