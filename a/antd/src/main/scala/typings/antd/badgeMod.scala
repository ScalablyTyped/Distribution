package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.small
import typings.antd.colorsMod.PresetColorType
import typings.antd.colorsMod.PresetStatusColorType
import typings.antd.ribbonMod.RibbonProps
import typings.antd.typeMod.LiteralUnion
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  @JSImport("antd/lib/badge", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  trait BadgeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.undefined
    
    /** Number to show in badge */
    var count: js.UndefOr[ReactNode] = js.undefined
    
    /** whether to show red dot without number */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
    
    /** Max count to show */
    var overflowCount: js.UndefOr[Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var scrollNumberPrefixCls: js.UndefOr[String] = js.undefined
    
    var showZero: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
    
    var status: js.UndefOr[PresetStatusColorType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCount(value: ReactNode): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
      
      inline def setOverflowCountUndefined: Self = StObject.set(x, "overflowCount", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setScrollNumberPrefixCls(value: String): Self = StObject.set(x, "scrollNumberPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setScrollNumberPrefixClsUndefined: Self = StObject.set(x, "scrollNumberPrefixCls", js.undefined)
      
      inline def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
      
      inline def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
      
      inline def setSize(value: typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: PresetStatusColorType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[BadgeProps] {
    
    var Ribbon: FC[RibbonProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: CompoundedComponent = default
}
