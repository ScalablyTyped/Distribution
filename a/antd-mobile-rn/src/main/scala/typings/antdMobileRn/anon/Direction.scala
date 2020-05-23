package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: String
  var styles: StringDictionary[RegisteredStyle[_]]
}

object Direction {
  @scala.inline
  def apply(direction: String, styles: StringDictionary[RegisteredStyle[_]]): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

