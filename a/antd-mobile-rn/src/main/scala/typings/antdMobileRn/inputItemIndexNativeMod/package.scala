package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputItemIndexNativeMod {
  type TextInputProps = typings.utilityTypes.mappedTypesMod.Omit[
    typings.reactNative.mod.TextInputProperties, 
    typings.antdMobileRn.antdMobileRnStrings.onChange | typings.antdMobileRn.antdMobileRnStrings.onFocus | typings.antdMobileRn.antdMobileRnStrings.onBlur
  ]
}
