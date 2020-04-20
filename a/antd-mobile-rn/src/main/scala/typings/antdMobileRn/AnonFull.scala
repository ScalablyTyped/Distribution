package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
}

object AnonFull {
  @scala.inline
  def apply(full: Boolean, styles: StringDictionary[RegisteredStyle[_]]): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
}

