package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var triggerType: String
}

object AnonMinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    styles: StringDictionary[RegisteredStyle[_]],
    triggerType: String
  ): AnonMinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMinuteStep]
  }
}

