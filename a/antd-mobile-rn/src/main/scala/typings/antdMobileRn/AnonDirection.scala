package typings.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: String
  var styles: StringDictionary[RegisteredStyle[_]]
}

object AnonDirection {
  @scala.inline
  def apply(direction: String, styles: StringDictionary[RegisteredStyle[_]]): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirection]
  }
}

