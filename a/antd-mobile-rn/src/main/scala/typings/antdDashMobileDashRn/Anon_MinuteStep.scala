package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MinuteStep extends js.Object {
  var minuteStep: Double
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var triggerType: String
}

object Anon_MinuteStep {
  @scala.inline
  def apply(
    minuteStep: Double,
    mode: String,
    styles: StringDictionary[RegisteredStyle[_]],
    triggerType: String
  ): Anon_MinuteStep = {
    val __obj = js.Dynamic.literal(minuteStep = minuteStep.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MinuteStep]
  }
}

