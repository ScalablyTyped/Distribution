package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerCount extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var count: RegisteredStyle[ViewStyle]
  var errorIcon: RegisteredStyle[ViewStyle]
  var icon: RegisteredStyle[ViewStyle]
  var input: RegisteredStyle[TextStyle]
}

object Anon_ContainerCount {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    count: RegisteredStyle[ViewStyle],
    errorIcon: RegisteredStyle[ViewStyle],
    icon: RegisteredStyle[ViewStyle],
    input: RegisteredStyle[TextStyle]
  ): Anon_ContainerCount = {
    val __obj = js.Dynamic.literal(container = container, count = count, errorIcon = errorIcon, icon = icon, input = input)
  
    __obj.asInstanceOf[Anon_ContainerCount]
  }
}

