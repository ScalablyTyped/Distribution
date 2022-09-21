package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.linkMod.LinkProps
import typings.antd.textMod.TextProps
import typings.antd.typographyParagraphMod.ParagraphProps
import typings.antd.typographyTitleMod.TitleProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLSpanElement
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
    
    var Paragraph: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = js.native
    
    var Text: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = js.native
    
    var Title: ForwardRefExoticComponent[TitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  }
  
  type _To = TypographyProps
  
  /* This means you don't have to write `default`, but can instead just say `typographyMod.foo` */
  override def _to: TypographyProps = default
}
