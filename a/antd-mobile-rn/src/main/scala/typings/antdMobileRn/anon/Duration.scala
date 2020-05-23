package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var mask: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClose(): Unit
}

object Duration {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

