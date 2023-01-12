package typings.antDesignProLayout

import typings.antDesignProProvider.esUseStyleMod.ProAliasToken
import typings.antDesignProProvider.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPageContainerStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/PageContainer/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  inline def useStyle(prefixCls: String, componentsToken: pageContainerToken): UseStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any], componentsToken.asInstanceOf[js.Any])).asInstanceOf[UseStyleResult]
  
  trait PageContainerToken_
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object PageContainerToken_ {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): PageContainerToken_ = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[PageContainerToken_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageContainerToken_] (val x: Self) extends AnyVal {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
  
  trait pageContainerToken extends StObject {
    
    var paddingBlockPageContainerContent: js.UndefOr[Double] = js.undefined
    
    var paddingInlinePageContainerContent: js.UndefOr[Double] = js.undefined
  }
  object pageContainerToken {
    
    inline def apply(): pageContainerToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pageContainerToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pageContainerToken] (val x: Self) extends AnyVal {
      
      inline def setPaddingBlockPageContainerContent(value: Double): Self = StObject.set(x, "paddingBlockPageContainerContent", value.asInstanceOf[js.Any])
      
      inline def setPaddingBlockPageContainerContentUndefined: Self = StObject.set(x, "paddingBlockPageContainerContent", js.undefined)
      
      inline def setPaddingInlinePageContainerContent(value: Double): Self = StObject.set(x, "paddingInlinePageContainerContent", value.asInstanceOf[js.Any])
      
      inline def setPaddingInlinePageContainerContentUndefined: Self = StObject.set(x, "paddingInlinePageContainerContent", js.undefined)
    }
  }
}
