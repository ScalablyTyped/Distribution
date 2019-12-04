package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueStyles extends js.Object {
  var defaultValue: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var `type`: String
}

object Anon_DefaultValueStyles {
  @scala.inline
  def apply(defaultValue: String, styles: StringDictionary[RegisteredStyle[_]], `type`: String): Anon_DefaultValueStyles = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueStyles]
  }
}

