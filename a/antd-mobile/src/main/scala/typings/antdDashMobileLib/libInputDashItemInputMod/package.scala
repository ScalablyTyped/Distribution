package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputDashItemInputMod {
  type HTMLInputProps = antdDashMobileLib.libUnderscoreUtilTypesMod.Omit[
    reactLib.reactMod.ReactNs.HTMLProps[stdLib.HTMLInputElement], 
    antdDashMobileLib.antdDashMobileLibStrings.onFocus | antdDashMobileLib.antdDashMobileLibStrings.onBlur
  ]
}
