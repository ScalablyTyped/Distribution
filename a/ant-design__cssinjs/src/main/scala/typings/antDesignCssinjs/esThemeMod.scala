package typings.antDesignCssinjs

import typings.antDesignCssinjs.esThemeInterfaceMod.DerivativeFunc
import typings.antDesignCssinjs.esThemeInterfaceMod.TokenType
import typings.antDesignCssinjs.esThemeThemeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeMod {
  
  @JSImport("@ant-design/cssinjs/es/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/cssinjs/es/theme", "Theme")
  @js.native
  open class Theme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */] protected () extends default[DesignToken, DerivativeToken] {
    def this(derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]) = this()
    def this(derivatives: DerivativeFunc[DesignToken, DerivativeToken]) = this()
  }
  
  @JSImport("@ant-design/cssinjs/es/theme", "ThemeCache")
  @js.native
  open class ThemeCache ()
    extends typings.antDesignCssinjs.esThemeThemeCacheMod.default
  /* static members */
  object ThemeCache {
    
    @JSImport("@ant-design/cssinjs/es/theme", "ThemeCache")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/cssinjs/es/theme", "ThemeCache.MAX_CACHE_OFFSET")
    @js.native
    def MAX_CACHE_OFFSET: Double = js.native
    inline def MAX_CACHE_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_CACHE_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/cssinjs/es/theme", "ThemeCache.MAX_CACHE_SIZE")
    @js.native
    def MAX_CACHE_SIZE: Double = js.native
    inline def MAX_CACHE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_CACHE_SIZE")(x.asInstanceOf[js.Any])
  }
  
  inline def createTheme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]): default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[default[Any, Any]]
  inline def createTheme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: DerivativeFunc[DesignToken, DerivativeToken]): default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[default[Any, Any]]
}
