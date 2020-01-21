package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputItemMod {
  type HTMLInputProps = typings.antdMobile.typesMod.Omit[
    typings.react.mod.HTMLProps[typings.std.HTMLInputElement], 
    typings.antdMobile.antdMobileStrings.onChange | typings.antdMobile.antdMobileStrings.onFocus | typings.antdMobile.antdMobileStrings.onBlur | typings.antdMobile.antdMobileStrings.value | typings.antdMobile.antdMobileStrings.defaultValue | typings.antdMobile.antdMobileStrings.`type`
  ]
}
