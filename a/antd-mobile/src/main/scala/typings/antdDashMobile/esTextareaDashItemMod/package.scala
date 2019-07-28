package typings.antdDashMobile

import typings.antdDashMobile.antdDashMobileStrings.`type`
import typings.antdDashMobile.antdDashMobileStrings.defaultValue
import typings.antdDashMobile.antdDashMobileStrings.onBlur
import typings.antdDashMobile.antdDashMobileStrings.onChange
import typings.antdDashMobile.antdDashMobileStrings.onFocus
import typings.antdDashMobile.antdDashMobileStrings.title
import typings.antdDashMobile.antdDashMobileStrings.value
import typings.antdDashMobile.esUnderscoreUtilTypesMod.Omit
import typings.react.reactMod.HTMLProps
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTextareaDashItemMod {
  type HTMLTextAreaProps = Omit[
    HTMLProps[HTMLInputElement], 
    onChange | onFocus | onBlur | value | defaultValue | `type` | title
  ]
}
