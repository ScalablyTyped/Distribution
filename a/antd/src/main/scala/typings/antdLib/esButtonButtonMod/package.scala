package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esButtonButtonMod {
  type AnchorButtonProps = antdLib.Anon_HrefOnClick with BaseButtonProps with (antdLib.esUnderscoreUtilTypeMod.Omit[reactLib.reactMod.AnchorHTMLAttributes[_], antdLib.antdLibStrings.`type`])
  type ButtonHTMLType = /* import warning: ImportType.apply Failed type conversion: ['submit', 'button', 'reset'][number] */ js.Any
  type ButtonProps = stdLib.Partial[AnchorButtonProps with NativeButtonProps]
  type ButtonShape = /* import warning: ImportType.apply Failed type conversion: ['circle', 'circle-outline', 'round'][number] */ js.Any
  type ButtonSize = /* import warning: ImportType.apply Failed type conversion: ['large', 'default', 'small'][number] */ js.Any
  type ButtonType = /* import warning: ImportType.apply Failed type conversion: ['default', 'primary', 'ghost', 'dashed', 'danger', 'link'][number] */ js.Any
  type NativeButtonProps = antdLib.Anon_HtmlType with BaseButtonProps with (antdLib.esUnderscoreUtilTypeMod.Omit[reactLib.reactMod.ButtonHTMLAttributes[_], antdLib.antdLibStrings.`type`])
}
