package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
}

object Full {
  @scala.inline
  def apply(full: Boolean, styles: StringDictionary[RegisteredStyle[_]]): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

