package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textareaItemMod {
  type HTMLTextAreaProps = typings.antdMobile.typesMod.Omit[
    typings.react.mod.HTMLProps[typings.std.HTMLInputElement], 
    typings.antdMobile.antdMobileStrings.onChange | typings.antdMobile.antdMobileStrings.onFocus | typings.antdMobile.antdMobileStrings.onBlur | typings.antdMobile.antdMobileStrings.value | typings.antdMobile.antdMobileStrings.defaultValue | typings.antdMobile.antdMobileStrings.`type` | typings.antdMobile.antdMobileStrings.title
  ]
}
