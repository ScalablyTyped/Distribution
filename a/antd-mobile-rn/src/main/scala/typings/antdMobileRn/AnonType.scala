package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var defaultValue: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(defaultValue: String, styles: StringDictionary[RegisteredStyle[_]], `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

