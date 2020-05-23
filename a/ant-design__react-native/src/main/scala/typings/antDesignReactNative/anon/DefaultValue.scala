package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  def onAfterChange(): Unit
  def onChange(): Unit
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: Double, disabled: Boolean, onAfterChange: () => Unit, onChange: () => Unit): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
    __obj.asInstanceOf[DefaultValue]
  }
}

