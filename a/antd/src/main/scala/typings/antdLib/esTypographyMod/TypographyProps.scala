package typings
package antdLib.esTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.SFC<antd.antd/es/typography/Typography.InternalTypographyProps> & {  Text  :react.react.SFC<antd.antd/es/typography/Text.TextProps>,   Title  :react.react.SFC<antd.antd/es/typography/Title.TitleProps>,   Paragraph  :react.react.SFC<antd.antd/es/typography/Paragraph.ParagraphProps>} */
@js.native
trait TypographyProps extends js.Object {
  var Paragraph: reactLib.reactMod.SFC[antdLib.esTypographyParagraphMod.ParagraphProps] = js.native
  var Text: reactLib.reactMod.SFC[antdLib.esTypographyTextMod.TextProps] = js.native
  var Title: reactLib.reactMod.SFC[antdLib.esTypographyTitleMod.TitleProps] = js.native
  var contextTypes: js.UndefOr[reactLib.reactMod.ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[antdLib.PartialInternalTypographyProps] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  var propTypes: js.UndefOr[antdLib.WeakValidationMapInternalTypographyProps] = js.native
  def apply(props: antdLib.PropsWithChildrenInternalTypographyProps): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def apply(props: antdLib.PropsWithChildrenInternalTypographyProps, context: js.Any): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
}

