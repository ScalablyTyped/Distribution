package typings.antd

import typings.antd.libTypographyMod.TypographyProps
import typings.antd.libTypographyParagraphMod.ParagraphProps
import typings.antd.libTypographyTextMod.TextProps
import typings.antd.libTypographyTitleMod.TitleProps
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SFC
import typings.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/typography", JSImport.Namespace)
@js.native
object libTypographyMod extends js.Object {
  /* Inlined react.react.FC<antd.antd/lib/typography/Typography.TypographyProps> & {  Text  :react.react.SFC<antd.antd/lib/typography/Text.TextProps>,   Title  :react.react.SFC<antd.antd/lib/typography/Title.TitleProps>,   Paragraph  :react.react.SFC<antd.antd/lib/typography/Paragraph.ParagraphProps>} */
  @js.native
  trait TypographyProps extends js.Object {
    var Paragraph: SFC[ParagraphProps] = js.native
    var Text: SFC[TextProps] = js.native
    var Title: SFC[TitleProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialTypographyProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapTypographyProps] = js.native
    def apply(props: PropsWithChildrenTypographyProps): ReactElement | Null = js.native
    def apply(props: PropsWithChildrenTypographyProps, context: js.Any): ReactElement | Null = js.native
  }
  
  val default: TypographyProps = js.native
}

