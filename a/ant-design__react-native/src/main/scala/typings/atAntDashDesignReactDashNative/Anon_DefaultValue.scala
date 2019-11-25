package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  def onAfterChange(): Unit
  def onChange(): Unit
}

object Anon_DefaultValue {
  @scala.inline
  def apply(defaultValue: Double, disabled: Boolean, onAfterChange: () => Unit, onChange: () => Unit): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

