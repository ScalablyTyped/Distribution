package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearTransition extends js.Object {
  var appearTransition: Boolean
  var percent: Double
  var position: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var unfilled: Boolean
}

object AnonAppearTransition {
  @scala.inline
  def apply(
    appearTransition: Boolean,
    percent: Double,
    position: String,
    styles: StringDictionary[RegisteredStyle[_]],
    unfilled: Boolean
  ): AnonAppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppearTransition]
  }
}

