package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonButtonMod {
  type AnchorButtonProps = antdLib.Anon_Target with BaseButtonProps with reactLib.reactMod.ReactNs.AnchorHTMLAttributes[reactLib.HTMLAnchorElement]
  type ButtonHTMLType = antdLib.antdLibStrings.submit | antdLib.antdLibStrings.button | antdLib.antdLibStrings.reset
  type ButtonProps = AnchorButtonProps | NativeButtonProps
  type ButtonShape = antdLib.antdLibStrings.circle | antdLib.antdLibStrings.`circle-outline`
  type ButtonSize = antdLib.antdLibStrings.small | antdLib.antdLibStrings.default | antdLib.antdLibStrings.large
  type ButtonType = antdLib.antdLibStrings.default | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.danger
  type NativeButtonProps = antdLib.Anon_OnClickHtmlType with BaseButtonProps with reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement]
}
