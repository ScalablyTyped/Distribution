package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputMod {
  type HTMLInputProps = typings.antdMobile.typesMod.Omit[
    typings.react.mod.HTMLProps[typings.std.HTMLInputElement], 
    typings.antdMobile.antdMobileStrings.onFocus | typings.antdMobile.antdMobileStrings.onBlur
  ]
}
