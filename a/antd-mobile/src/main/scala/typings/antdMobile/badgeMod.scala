package typings.antdMobile

import typings.antdMobile.anon.Corner
import typings.antdMobile.badgePropsTypeMod.BadgePropsTypes
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("antd-mobile/lib/badge", JSImport.Default)
  @js.native
  class default () extends Badge
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/badge", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/badge", "default.defaultProps")
    @js.native
    def defaultProps: Corner = js.native
    @scala.inline
    def defaultProps_=(x: Corner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Badge
    extends Component[BadgeProps, js.Any, js.Any]
  
  trait BadgeProps
    extends StObject
       with BadgePropsTypes {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hot: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BadgeProps {
    
    @scala.inline
    def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
