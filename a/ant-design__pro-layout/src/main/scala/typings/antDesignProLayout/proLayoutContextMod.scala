package typings.antDesignProLayout

import org.scalablytyped.runtime.TopLevel
import typings.antDesignProLayout.anon.ColorBgCollapsedButton
import typings.antDesignProLayout.anon.ColorBgHeader
import typings.antDesignProLayout.anon.ColorBgPageContainer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proLayoutContextMod {
  
  @JSImport("@ant-design/pro-layout/es/context/ProLayoutContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/context/ProLayoutContext", "ProLayoutContext")
  @js.native
  val ProLayoutContext: Context[LayoutDesignToken] = js.native
  
  @JSImport("@ant-design/pro-layout/es/context/ProLayoutContext", "ProLayoutProvider")
  @js.native
  val ProLayoutProvider: FC[ProLayoutProviderProps] = js.native
  
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
  
  type DeepPartial[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? @ant-design/pro-layout.@ant-design/pro-layout/es/context/ProLayoutContext.DeepPartial<T[P]>}
    */ typings.antDesignProLayout.antDesignProLayoutStrings.DeepPartial & TopLevel[T])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalToken * / any */ trait LayoutDesignToken
    extends StObject
       with BaseLayoutDesignToken
  object LayoutDesignToken {
    
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
    ): LayoutDesignToken = {
      val __obj = js.Dynamic.literal(bgLayout = bgLayout.asInstanceOf[js.Any], colorBgAppListIconHover = colorBgAppListIconHover.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorTextAppListIcon = colorTextAppListIcon.asInstanceOf[js.Any], colorTextAppListIconHover = colorTextAppListIconHover.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], pageContainer = pageContainer.asInstanceOf[js.Any], sider = sider.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutDesignToken]
    }
  }
  
  trait ProLayoutProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var token: js.UndefOr[DeepPartial[LayoutDesignToken]] = js.undefined
  }
  object ProLayoutProviderProps {
    
    inline def apply(): ProLayoutProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProLayoutProviderProps]
    }
    
    extension [Self <: ProLayoutProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setToken(value: DeepPartial[LayoutDesignToken]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
