package typings.antDesignProProvider

import typings.antDesignProProvider.anon.ColorBgCollapsedButton
import typings.antDesignProProvider.anon.ColorBgHeader
import typings.antDesignProProvider.anon.ColorBgPageContainer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypingLayoutTokenMod {
  
  @JSImport("@ant-design/pro-provider/es/typing/layoutToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayoutDesignToken(baseDesignTokens: DeepPartial[LayoutDesignToken], antdToken: Record[String, Any]): LayoutDesignToken = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutDesignToken")(baseDesignTokens.asInstanceOf[js.Any], antdToken.asInstanceOf[js.Any])).asInstanceOf[LayoutDesignToken]
  
  trait BaseLayoutDesignToken extends StObject {
    
    /**
      * layout 的背景颜色
      */
    var bgLayout: String
    
    /**
      * 跨站点应用的图标hover颜色
      */
    var colorBgAppListIconHover: String
    
    var colorPrimary: String
    
    /**
      * 跨站点应用的图标hover颜色
      */
    var colorTextAppListIcon: String
    
    /**
      * 跨站点应用的图标hover颜色
      */
    var colorTextAppListIconHover: String
    
    var hashId: String
    
    /**
      * header 的 token 设置
      */
    var header: ColorBgHeader
    
    /**
      * pageContainer
      */
    var pageContainer: ColorBgPageContainer
    
    /**
      * 侧边side的 token 配置
      */
    var sider: ColorBgCollapsedButton
  }
  object BaseLayoutDesignToken {
    
    inline def apply(
      bgLayout: String,
      colorBgAppListIconHover: String,
      colorPrimary: String,
      colorTextAppListIcon: String,
      colorTextAppListIconHover: String,
      hashId: String,
      header: ColorBgHeader,
      pageContainer: ColorBgPageContainer,
      sider: ColorBgCollapsedButton
    ): BaseLayoutDesignToken = {
      val __obj = js.Dynamic.literal(bgLayout = bgLayout.asInstanceOf[js.Any], colorBgAppListIconHover = colorBgAppListIconHover.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorTextAppListIcon = colorTextAppListIcon.asInstanceOf[js.Any], colorTextAppListIconHover = colorTextAppListIconHover.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], pageContainer = pageContainer.asInstanceOf[js.Any], sider = sider.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLayoutDesignToken]
    }
    
    extension [Self <: BaseLayoutDesignToken](x: Self) {
      
      inline def setBgLayout(value: String): Self = StObject.set(x, "bgLayout", value.asInstanceOf[js.Any])
      
      inline def setColorBgAppListIconHover(value: String): Self = StObject.set(x, "colorBgAppListIconHover", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorTextAppListIcon(value: String): Self = StObject.set(x, "colorTextAppListIcon", value.asInstanceOf[js.Any])
      
      inline def setColorTextAppListIconHover(value: String): Self = StObject.set(x, "colorTextAppListIconHover", value.asInstanceOf[js.Any])
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ColorBgHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPageContainer(value: ColorBgPageContainer): Self = StObject.set(x, "pageContainer", value.asInstanceOf[js.Any])
      
      inline def setSider(value: ColorBgCollapsedButton): Self = StObject.set(x, "sider", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? {[ P in keyof T ]:? @ant-design/pro-provider.@ant-design/pro-provider/es/typing/layoutToken.DeepPartial<T[P]>} : T
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  type LayoutDesignToken = BaseLayoutDesignToken
  
  trait ProTokenType extends StObject {
    
    var layout: js.UndefOr[DeepPartial[LayoutDesignToken]] = js.undefined
  }
  object ProTokenType {
    
    inline def apply(): ProTokenType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProTokenType]
    }
    
    extension [Self <: ProTokenType](x: Self) {
      
      inline def setLayout(value: DeepPartial[LayoutDesignToken]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    }
  }
}
