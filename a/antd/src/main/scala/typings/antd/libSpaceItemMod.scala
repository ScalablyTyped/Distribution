package typings.antd

import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.marginLeft
import typings.antd.antdStrings.marginRight
import typings.antd.antdStrings.vertical
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpaceItemMod {
  
  @JSImport("antd/lib/space/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameDirectionIndexMarginDirectionChildrenSplitWrap: ItemProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameDirectionIndexMarginDirectionChildrenSplitWrap.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait ItemProps extends StObject {
    
    var children: ReactNode
    
    var className: String
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var index: Double
    
    var marginDirection: marginLeft | marginRight
    
    var split: js.UndefOr[String | ReactNode] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ItemProps {
    
    inline def apply(className: String, index: Double, marginDirection: marginLeft | marginRight): ItemProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], marginDirection = marginDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMarginDirection(value: marginLeft | marginRight): Self = StObject.set(x, "marginDirection", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: String | ReactNode): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
