package typings.antdMobile

import typings.antdMobile.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typings.antdMobile.anon.Animating
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activityIndicatorMod {
  
  @JSImport("antd-mobile/lib/activity-indicator", JSImport.Default)
  @js.native
  class default () extends ActivityIndicator
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/activity-indicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/activity-indicator", "default.defaultProps")
    @js.native
    def defaultProps: Animating = js.native
    inline def defaultProps_=(x: Animating): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ActivityIndicator
    extends Component[ActivityIndicatorProps, js.Any, js.Any]
  
  trait ActivityIndicatorProps
    extends StObject
       with ActivityIndicatorPropTypes {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object ActivityIndicatorProps {
    
    inline def apply(): ActivityIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorProps]
    }
    
    extension [Self <: ActivityIndicatorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
