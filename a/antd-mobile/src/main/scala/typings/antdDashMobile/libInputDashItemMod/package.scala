package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemMod {
  import typings.antdDashMobile.antdDashMobileStrings.`type`
  import typings.antdDashMobile.antdDashMobileStrings.defaultValue
  import typings.antdDashMobile.antdDashMobileStrings.onBlur
  import typings.antdDashMobile.antdDashMobileStrings.onChange
  import typings.antdDashMobile.antdDashMobileStrings.onFocus
  import typings.antdDashMobile.antdDashMobileStrings.value
  import typings.antdDashMobile.libUnderscoreUtilTypesMod.Omit
  import typings.react.reactMod.HTMLProps
  import typings.std.HTMLInputElement

  type HTMLInputProps = Omit[
    HTMLProps[HTMLInputElement], 
    onChange | onFocus | onBlur | value | defaultValue | `type`
  ]
}
