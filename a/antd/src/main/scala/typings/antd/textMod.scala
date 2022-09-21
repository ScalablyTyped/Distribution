package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.OmitEllipsisConfigexpanda
import typings.antd.baseMod.BlockProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Text", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait TextProps
    extends StObject
       with BlockProps {
    
    @JSName("ellipsis")
    var ellipsis_TextProps: js.UndefOr[Boolean | OmitEllipsisConfigexpanda] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
      ] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setEllipsis(value: Boolean | OmitEllipsisConfigexpanda): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: ForwardRefExoticComponent[TextProps & RefAttributes[HTMLSpanElement]] = default
}
