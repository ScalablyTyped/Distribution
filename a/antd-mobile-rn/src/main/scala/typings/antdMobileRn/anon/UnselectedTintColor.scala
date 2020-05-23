package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnselectedTintColor extends js.Object {
  var barTintColor: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var tintColor: String
  var unselectedTintColor: String
}

object UnselectedTintColor {
  @scala.inline
  def apply(
    barTintColor: String,
    styles: StringDictionary[RegisteredStyle[_]],
    tintColor: String,
    unselectedTintColor: String
  ): UnselectedTintColor = {
    val __obj = js.Dynamic.literal(barTintColor = barTintColor.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], unselectedTintColor = unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnselectedTintColor]
  }
}

