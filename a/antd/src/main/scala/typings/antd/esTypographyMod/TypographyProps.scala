package typings.antd.esTypographyMod

import typings.antd.PartialInternalTypographyProps
import typings.antd.PropsWithChildrenInternalTypographyProps
import typings.antd.WeakValidationMapInternalTypographyProps
import typings.antd.esTypographyParagraphMod.ParagraphProps
import typings.antd.esTypographyTextMod.TextProps
import typings.antd.esTypographyTitleMod.TitleProps
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SFC
import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.SFC<antd.antd/es/typography/Typography.InternalTypographyProps> & {  Text  :react.react.SFC<antd.antd/es/typography/Text.TextProps>,   Title  :react.react.SFC<antd.antd/es/typography/Title.TitleProps>,   Paragraph  :react.react.SFC<antd.antd/es/typography/Paragraph.ParagraphProps>} */
@js.native
trait TypographyProps extends js.Object {
  var Paragraph: SFC[ParagraphProps] = js.native
  var Text: SFC[TextProps] = js.native
  var Title: SFC[TitleProps] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialInternalTypographyProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapInternalTypographyProps] = js.native
  def apply(props: PropsWithChildrenInternalTypographyProps): ReactElement | Null = js.native
  def apply(props: PropsWithChildrenInternalTypographyProps, context: js.Any): ReactElement | Null = js.native
}

