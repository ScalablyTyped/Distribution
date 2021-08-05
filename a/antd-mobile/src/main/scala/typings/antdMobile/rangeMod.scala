package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.rangePropsTypeMod.RangePropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("antd-mobile/lib/range", JSImport.Default)
  @js.native
  class default () extends Range
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/range", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/range", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Range
    extends Component[RangeProps, js.Any, js.Any]
  
  trait RangeProps
    extends StObject
       with RangePropsType {
    
    var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var railStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
  }
  object RangeProps {
    
    inline def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    extension [Self <: RangeProps](x: Self) {
      
      inline def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      inline def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      inline def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
    }
  }
}
