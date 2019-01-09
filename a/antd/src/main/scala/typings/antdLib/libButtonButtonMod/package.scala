package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonButtonMod {
  type AnchorButtonProps = antdLib.Anon_HrefOnClick with BaseButtonProps with reactLib.reactMod.ReactNs.AnchorHTMLAttributes[reactLib.HTMLAnchorElement]
  type ButtonHTMLType = /* import warning: ImportType.apply Failed type conversion: ['submit', 'button', 'reset'][number] */ js.Any
  type ButtonProps = AnchorButtonProps | NativeButtonProps
  type ButtonShape = /* import warning: ImportType.apply Failed type conversion: ['circle', 'circle-outline'][number] */ js.Any
  type ButtonSize = /* import warning: ImportType.apply Failed type conversion: ['large', 'default', 'small'][number] */ js.Any
  type ButtonType = /* import warning: ImportType.apply Failed type conversion: ['default', 'primary', 'ghost', 'dashed', 'danger'][number] */ js.Any
  type NativeButtonProps = antdLib.Anon_HtmlType with BaseButtonProps with reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement]
}
