package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardGridMod extends Shortcut {
  
  @JSImport("antd/lib/card/Grid", JSImport.Default)
  @js.native
  val default: FC[CardGridProps] = js.native
  
  trait CardGridProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CardGridProps {
    
    inline def apply(): CardGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGridProps]
    }
    
    extension [Self <: CardGridProps](x: Self) {
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = FC[CardGridProps]
  
  /* This means you don't have to write `default`, but can instead just say `libCardGridMod.foo` */
  override def _to: FC[CardGridProps] = default
}
