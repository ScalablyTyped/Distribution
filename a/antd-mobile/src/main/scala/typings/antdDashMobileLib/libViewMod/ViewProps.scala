package typings
package antdDashMobileLib.libViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps[T]
  extends reactLib.reactMod.HTMLProps[T] {
  var Component: js.UndefOr[java.lang.String] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply[T](Component: java.lang.String = null, HTMLProps: reactLib.reactMod.HTMLProps[T] = null): ViewProps[T] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[ViewProps[T]]
  }
}

