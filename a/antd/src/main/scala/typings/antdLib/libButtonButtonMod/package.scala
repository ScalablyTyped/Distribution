package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonButtonMod {
  type AnchorButtonProps = antdLib.Anon_HrefOnClick with BaseButtonProps with (antdLib.libUnderscoreUtilTypeMod.Omit[
    reactLib.reactMod.ReactNs.AnchorHTMLAttributes[stdLib.HTMLAnchorElement], 
    antdLib.antdLibStrings.`type`
  ])
  type ButtonHTMLType = /* import warning: ImportType.apply Failed type conversion: ['submit', 'button', 'reset'][number] */ js.Any
  type ButtonProps = AnchorButtonProps | NativeButtonProps
  type ButtonShape = /* import warning: ImportType.apply Failed type conversion: ['circle', 'circle-outline', 'round'][number] */ js.Any
  type ButtonSize = /* import warning: ImportType.apply Failed type conversion: ['large', 'default', 'small'][number] */ js.Any
  type ButtonType = /* import warning: ImportType.apply Failed type conversion: ['default', 'primary', 'ghost', 'dashed', 'danger'][number] */ js.Any
  type NativeButtonProps = antdLib.Anon_HtmlType with BaseButtonProps with (antdLib.libUnderscoreUtilTypeMod.Omit[
    reactLib.reactMod.ReactNs.ButtonHTMLAttributes[stdLib.HTMLButtonElement], 
    antdLib.antdLibStrings.`type`
  ])
}
