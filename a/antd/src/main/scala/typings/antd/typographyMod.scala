package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.linkMod.LinkProps
import typings.antd.textMod.TextProps
import typings.antd.typographyParagraphMod.ParagraphProps
import typings.antd.typographyTitleMod.TitleProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyMod extends Shortcut {
  
  @JSImport("antd/lib/typography", JSImport.Default)
  @js.native
  val default: TypographyProps = js.native
  
  @js.native
  trait TypographyProps
    extends StObject
       with FunctionComponent[typings.antd.typographyTypographyMod.TypographyProps] {
    
    var Link: ForwardRefExoticComponent[LinkProps & RefAttributes[HTMLElement]] = js.native
    
    var Paragraph: FC[ParagraphProps] = js.native
    
    var Text: FC[TextProps] = js.native
    
    var Title: FC[TitleProps] = js.native
  }
  
  type _To = TypographyProps
  
  /* This means you don't have to write `default`, but can instead just say `typographyMod.foo` */
  override def _to: TypographyProps = default
}
