package typings
package antdDashMobileDashRnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue extends js.Object {
  var defaultValue: scala.Double
  var disabled: scala.Boolean
  var maximumTrackTintColor: java.lang.String
  var minimumTrackTintColor: java.lang.String
  def onAfterChange(): scala.Unit
  def onChange(): scala.Unit
}

object Anon_DefaultValue {
  @scala.inline
  def apply(
    defaultValue: scala.Double,
    disabled: scala.Boolean,
    maximumTrackTintColor: java.lang.String,
    minimumTrackTintColor: java.lang.String,
    onAfterChange: () => scala.Unit,
    onChange: () => scala.Unit
  ): Anon_DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, disabled = disabled, maximumTrackTintColor = maximumTrackTintColor, minimumTrackTintColor = minimumTrackTintColor, onAfterChange = js.Any.fromFunction0(onAfterChange), onChange = js.Any.fromFunction0(onChange))
  
    __obj.asInstanceOf[Anon_DefaultValue]
  }
}

