package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEvent extends js.Object {
  var nativeEvent: Text
}

object NativeEvent {
  @scala.inline
  def apply(nativeEvent: Text): NativeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
}

