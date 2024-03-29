package typings.antd

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyBaseEllipsisMod {
  
  object default {
    
    inline def apply(param0: EllipsisProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/typography/Base/Ellipsis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/typography/Base/Ellipsis", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait EllipsisProps extends StObject {
    
    def children(cutChildren: js.Array[ReactNode], needEllipsis: Boolean): ReactNode
    
    var enabledMeasure: js.UndefOr[Boolean] = js.undefined
    
    var fontSize: Double
    
    def onEllipsis(isEllipsis: Boolean): Unit
    
    var rows: Double
    
    var text: js.UndefOr[ReactNode] = js.undefined
    
    var width: Double
  }
  object EllipsisProps {
    
    inline def apply(
      children: (js.Array[ReactNode], Boolean) => ReactNode,
      fontSize: Double,
      onEllipsis: Boolean => Unit,
      rows: Double,
      width: Double
    ): EllipsisProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), fontSize = fontSize.asInstanceOf[js.Any], onEllipsis = js.Any.fromFunction1(onEllipsis), rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EllipsisProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: (js.Array[ReactNode], Boolean) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setEnabledMeasure(value: Boolean): Self = StObject.set(x, "enabledMeasure", value.asInstanceOf[js.Any])
      
      inline def setEnabledMeasureUndefined: Self = StObject.set(x, "enabledMeasure", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setOnEllipsis(value: Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
