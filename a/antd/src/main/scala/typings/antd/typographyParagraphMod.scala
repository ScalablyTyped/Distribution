package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.baseMod.BlockProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyParagraphMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ParagraphProps
    extends StObject
       with BlockProps {
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
      ] = js.undefined
  }
  object ParagraphProps {
    
    inline def apply(): ParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParagraphProps]
    }
    
    extension [Self <: ParagraphProps](x: Self) {
      
      inline def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `typographyParagraphMod.foo` */
  override def _to: ForwardRefExoticComponent[ParagraphProps & RefAttributes[HTMLDivElement]] = default
}
