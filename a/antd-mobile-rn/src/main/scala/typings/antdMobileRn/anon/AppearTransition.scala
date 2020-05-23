package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearTransition extends js.Object {
  var appearTransition: Boolean
  var percent: Double
  var position: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var unfilled: Boolean
}

object AppearTransition {
  @scala.inline
  def apply(
    appearTransition: Boolean,
    percent: Double,
    position: String,
    styles: StringDictionary[RegisteredStyle[_]],
    unfilled: Boolean
  ): AppearTransition = {
    val __obj = js.Dynamic.literal(appearTransition = appearTransition.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], unfilled = unfilled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearTransition]
  }
}

