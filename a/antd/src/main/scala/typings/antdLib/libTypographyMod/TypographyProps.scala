package typings
package antdLib.libTypographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.SFC<antd.antd/lib/typography/Typography.InternalTypographyProps> & {  Text  :react.react.SFC<antd.antd/lib/typography/Text.TextProps>,   Title  :react.react.SFC<antd.antd/lib/typography/Title.TitleProps>,   Paragraph  :react.react.SFC<antd.antd/lib/typography/Paragraph.ParagraphProps>} */
@js.native
trait TypographyProps extends js.Object {
  var Paragraph: reactLib.reactMod.SFC[antdLib.libTypographyParagraphMod.ParagraphProps] = js.native
  var Text: reactLib.reactMod.SFC[antdLib.libTypographyTextMod.TextProps] = js.native
  var Title: reactLib.reactMod.SFC[antdLib.libTypographyTitleMod.TitleProps] = js.native
  var contextTypes: js.UndefOr[reactLib.reactMod.ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[antdLib.PartialInternalTypographyProps] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  var propTypes: js.UndefOr[antdLib.WeakValidationMapInternalTypographyProps] = js.native
  def apply(props: antdLib.PropsWithChildrenInternalTypographyProps): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def apply(props: antdLib.PropsWithChildrenInternalTypographyProps, context: js.Any): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
}

