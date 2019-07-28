package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: Double
  var disabled: Boolean
  var maximumTrackTintColor: String
  var minimumTrackTintColor: String
  def onAfterChange(): Unit
  def onChange(): Unit
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    maximumTrackTintColor: String,
    minimumTrackTintColor: String,
    onAfterChange: () => Unit,
    onChange: () => Unit
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, disabled = disabled, maximumTrackTintColor = maximumTrackTintColor, minimumTrackTintColor = minimumTrackTintColor, onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

