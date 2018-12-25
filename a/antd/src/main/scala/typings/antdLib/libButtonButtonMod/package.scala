package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonButtonMod {
  type AnchorButtonProps = antdLib.Anon_Target with BaseButtonProps with reactLib.reactMod.ReactNs.AnchorHTMLAttributes[reactLib.HTMLAnchorElement]
  type ButtonHTMLType = /* import warning: Failed type conversion: TsTypeLookup(TsTypeTuple(List(TsTypeLiteral(TsLiteralString(submit)), TsTypeLiteral(TsLiteralString(button)), TsTypeLiteral(TsLiteralString(reset)))),Left(TsIdentSimple(number))) */js.Any
  type ButtonProps = AnchorButtonProps | NativeButtonProps
  type ButtonShape = /* import warning: Failed type conversion: TsTypeLookup(TsTypeTuple(List(TsTypeLiteral(TsLiteralString(circle)), TsTypeLiteral(TsLiteralString(circle-outline)))),Left(TsIdentSimple(number))) */js.Any
  type ButtonSize = /* import warning: Failed type conversion: TsTypeLookup(TsTypeTuple(List(TsTypeLiteral(TsLiteralString(large)), TsTypeLiteral(TsLiteralString(default)), TsTypeLiteral(TsLiteralString(small)))),Left(TsIdentSimple(number))) */js.Any
  type ButtonType = /* import warning: Failed type conversion: TsTypeLookup(TsTypeTuple(List(TsTypeLiteral(TsLiteralString(default)), TsTypeLiteral(TsLiteralString(primary)), TsTypeLiteral(TsLiteralString(ghost)), TsTypeLiteral(TsLiteralString(dashed)), TsTypeLiteral(TsLiteralString(danger)))),Left(TsIdentSimple(number))) */js.Any
  type NativeButtonProps = antdLib.Anon_OnClickHtmlType with BaseButtonProps with reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement]
}
