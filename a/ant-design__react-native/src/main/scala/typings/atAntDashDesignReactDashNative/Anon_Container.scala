package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.RegisteredStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: RegisteredStyle[ViewStyle]
  var innerContainer: RegisteredStyle[ViewStyle]
  var spinner: RegisteredStyle[ViewStyle]
  var tip: RegisteredStyle[TextStyle]
  var toast: RegisteredStyle[TextStyle]
  var wrapper: RegisteredStyle[ViewStyle]
}

object Anon_Container {
  @scala.inline
  def apply(
    container: RegisteredStyle[ViewStyle],
    innerContainer: RegisteredStyle[ViewStyle],
    spinner: RegisteredStyle[ViewStyle],
    tip: RegisteredStyle[TextStyle],
    toast: RegisteredStyle[TextStyle],
    wrapper: RegisteredStyle[ViewStyle]
  ): Anon_Container = {
    val __obj = js.Dynamic.literal(container = container, innerContainer = innerContainer, spinner = spinner, tip = tip, toast = toast, wrapper = wrapper)
  
    __obj.asInstanceOf[Anon_Container]
  }
}

