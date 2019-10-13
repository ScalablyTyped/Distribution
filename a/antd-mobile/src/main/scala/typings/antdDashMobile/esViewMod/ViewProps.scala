package typings.antdDashMobile.esViewMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  var Component: js.UndefOr[String] = js.undefined
}

object ViewProps {
  @scala.inline
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    Component: String = null
  ): ViewProps[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    __obj.asInstanceOf[ViewProps[T]]
  }
}

