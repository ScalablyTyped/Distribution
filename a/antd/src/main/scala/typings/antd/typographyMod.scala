package typings.antd

import typings.antd.textMod.TextProps
import typings.antd.typographyParagraphMod.ParagraphProps
import typings.antd.typographyTitleMod.TitleProps
import typings.react.mod.FC
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/typography", JSImport.Namespace)
@js.native
object typographyMod extends js.Object {
  /* Inlined react.react.FC<antd.antd/lib/typography/Typography.TypographyProps> & {  Text  :react.react.FC<antd.antd/lib/typography/Text.TextProps>,   Title  :react.react.FC<antd.antd/lib/typography/Title.TitleProps>,   Paragraph  :react.react.FC<antd.antd/lib/typography/Paragraph.ParagraphProps>} */
  @js.native
  trait TypographyProps extends js.Object {
    var Paragraph: FC[ParagraphProps] = js.native
    var Text: FC[TextProps] = js.native
    var Title: FC[TitleProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialTypographyProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapTypograp] = js.native
    def apply(props: PropsWithChildren[typings.antd.typographyTypographyMod.TypographyProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[typings.antd.typographyTypographyMod.TypographyProps], context: js.Any): ReactElement | Null = js.native
  }
  
  val default: TypographyProps = js.native
}

