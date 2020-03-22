package typings.antDesignIcons.componentsAntdIconMod

import typings.antDesignIcons.componentsTwoTonePrimaryColorMod.TwoToneColor
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconBaseComponent[Props] extends ForwardRefExoticComponent[Props with RefAttributes[HTMLSpanElement]] {
  var getTwoToneColor: js.Function0[TwoToneColor] = js.native
  var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
}

