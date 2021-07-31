package typings.antdMobile

import typings.antdMobile.anon.ButtonType
import typings.antdMobile.resultPropsTypeMod.ResultPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("antd-mobile/lib/result", JSImport.Default)
  @js.native
  class default () extends Result
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/result", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/result", "default.defaultProps")
    @js.native
    def defaultProps: ButtonType = js.native
    @scala.inline
    def defaultProps_=(x: ButtonType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Result
    extends Component[ResultProps, js.Any, js.Any]
  
  trait ResultProps
    extends StObject
       with ResultPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ResultProps {
    
    @scala.inline
    def apply(): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultProps]
    }
    
    @scala.inline
    implicit class ResultPropsMutableBuilder[Self <: ResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
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
