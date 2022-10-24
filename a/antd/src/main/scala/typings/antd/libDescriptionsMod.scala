package typings.antd

import typings.antd.anon.PartialRecordBreakpointnu
import typings.antd.antdStrings.default
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.middle
import typings.antd.antdStrings.small
import typings.antd.antdStrings.vertical
import typings.antd.libDescriptionsItemMod.DescriptionsItemProps
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionsMod {
  
  object default {
    
    inline def apply(param0: DescriptionsProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/descriptions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/descriptions", "default.Item")
    @js.native
    def Item: FC[DescriptionsItemProps] = js.native
    inline def Item_=(x: FC[DescriptionsItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/descriptions", "DescriptionsContext")
  @js.native
  val DescriptionsContext: Context[DescriptionsContextProps] = js.native
  
  trait DescriptionsContextProps extends StObject {
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object DescriptionsContextProps {
    
    inline def apply(): DescriptionsContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionsContextProps]
    }
    
    extension [Self <: DescriptionsContextProps](x: Self) {
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    }
  }
  
  trait DescriptionsProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    var column: js.UndefOr[Double | PartialRecordBreakpointnu] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var layout: js.UndefOr[horizontal | vertical] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[middle | small | default] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object DescriptionsProps {
    
    inline def apply(): DescriptionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionsProps]
    }
    
    extension [Self <: DescriptionsProps](x: Self) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setColumn(value: Double | PartialRecordBreakpointnu): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: middle | small | default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
