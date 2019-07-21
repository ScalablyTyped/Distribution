package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: scala.Double
  var disabled: scala.Boolean
  def onAfterChange(): scala.Unit
  def onChange(): scala.Unit
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: scala.Double,
    disabled: scala.Boolean,
    onAfterChange: () => scala.Unit,
    onChange: () => scala.Unit
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, disabled = disabled, onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

