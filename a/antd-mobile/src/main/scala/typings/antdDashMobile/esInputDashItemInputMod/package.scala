package typings.antdDashMobile

import typings.antdDashMobile.antdDashMobileStrings.onBlur
import typings.antdDashMobile.antdDashMobileStrings.onFocus
import typings.antdDashMobile.esUnderscoreUtilTypesMod.Omit
import typings.react.reactMod.HTMLProps
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esInputDashItemInputMod {
  type HTMLInputProps = Omit[HTMLProps[HTMLInputElement], onFocus | onBlur]
}
