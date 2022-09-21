package typings.antDesignProLayout

import typings.antDesignProUtils.useStyleMod.ProAliasToken
import typings.antDesignProUtils.useStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderStyleMod {
  
  @JSImport("@ant-design/pro-layout/es/components/PageHeader/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait PageHeaderToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
    
    var pageHeaderBgGhost: String
    
    var pageHeaderColorBack: String
    
    var pageHeaderFontSizeHeaderSubTitle: Double
    
    var pageHeaderFontSizeHeaderTitle: Double
    
    var pageHeaderPadding: Double
    
    var pageHeaderPaddingBreadCrumb: Double
    
    var pageHeaderPaddingContentPadding: Double
    
    var pageHeaderPaddingVertical: Double
  }
  object PageHeaderToken {
    
    inline def apply(
      ProAliasToken: ProAliasToken,
      componentCls: String,
      pageHeaderBgGhost: String,
      pageHeaderColorBack: String,
      pageHeaderFontSizeHeaderSubTitle: Double,
      pageHeaderFontSizeHeaderTitle: Double,
      pageHeaderPadding: Double,
      pageHeaderPaddingBreadCrumb: Double,
      pageHeaderPaddingContentPadding: Double,
      pageHeaderPaddingVertical: Double
    ): PageHeaderToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any], pageHeaderBgGhost = pageHeaderBgGhost.asInstanceOf[js.Any], pageHeaderColorBack = pageHeaderColorBack.asInstanceOf[js.Any], pageHeaderFontSizeHeaderSubTitle = pageHeaderFontSizeHeaderSubTitle.asInstanceOf[js.Any], pageHeaderFontSizeHeaderTitle = pageHeaderFontSizeHeaderTitle.asInstanceOf[js.Any], pageHeaderPadding = pageHeaderPadding.asInstanceOf[js.Any], pageHeaderPaddingBreadCrumb = pageHeaderPaddingBreadCrumb.asInstanceOf[js.Any], pageHeaderPaddingContentPadding = pageHeaderPaddingContentPadding.asInstanceOf[js.Any], pageHeaderPaddingVertical = pageHeaderPaddingVertical.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[PageHeaderToken]
    }
    
    extension [Self <: PageHeaderToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderBgGhost(value: String): Self = StObject.set(x, "pageHeaderBgGhost", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderColorBack(value: String): Self = StObject.set(x, "pageHeaderColorBack", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderFontSizeHeaderSubTitle(value: Double): Self = StObject.set(x, "pageHeaderFontSizeHeaderSubTitle", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderFontSizeHeaderTitle(value: Double): Self = StObject.set(x, "pageHeaderFontSizeHeaderTitle", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderPadding(value: Double): Self = StObject.set(x, "pageHeaderPadding", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderPaddingBreadCrumb(value: Double): Self = StObject.set(x, "pageHeaderPaddingBreadCrumb", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderPaddingContentPadding(value: Double): Self = StObject.set(x, "pageHeaderPaddingContentPadding", value.asInstanceOf[js.Any])
      
      inline def setPageHeaderPaddingVertical(value: Double): Self = StObject.set(x, "pageHeaderPaddingVertical", value.asInstanceOf[js.Any])
    }
  }
}
