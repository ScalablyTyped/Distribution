package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: java.lang.String
  def onPress(): scala.Unit
}

object Anon_Mode {
  @scala.inline
  def apply(mode: java.lang.String, onPress: () => scala.Unit): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode, onPress = js.Any.fromFunction0(onPress))
  
    __obj.asInstanceOf[Anon_Mode]
  }
}

