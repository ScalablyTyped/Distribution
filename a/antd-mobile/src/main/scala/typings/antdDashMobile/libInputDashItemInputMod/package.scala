package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemInputMod {
  import typings.antdDashMobile.antdDashMobileStrings.onBlur
  import typings.antdDashMobile.antdDashMobileStrings.onFocus
  import typings.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typings.react.reactMod.HTMLProps
  import typings.std.HTMLInputElement

  type HTMLInputProps = Omit[HTMLProps[HTMLInputElement], onFocus | onBlur]
}
