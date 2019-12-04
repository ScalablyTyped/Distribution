package typings.antdDashMobileDashRn

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var mask: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClose(): Unit
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: () => Unit, styles: StringDictionary[RegisteredStyle[_]]): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

