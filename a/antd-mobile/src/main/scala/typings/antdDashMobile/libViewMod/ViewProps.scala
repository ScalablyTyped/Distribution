package typings.antdDashMobile.libViewMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps[T] extends HTMLProps[T] {
  var Component: js.UndefOr[String] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply[T](Component: String = null, HTMLProps: HTMLProps[T] = null): ViewProps[T] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[ViewProps[T]]
  }
}

