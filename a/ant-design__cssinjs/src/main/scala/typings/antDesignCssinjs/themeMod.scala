package typings.antDesignCssinjs

import typings.antDesignCssinjs.interfaceMod.DerivativeFunc
import typings.antDesignCssinjs.interfaceMod.TokenType
import typings.antDesignCssinjs.themeThemeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
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
    extends typings.antDesignCssinjs.themeCacheMod.default
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
  
  inline def createTheme[DesignToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */, DerivativeToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */](
    derivatives: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DerivativeFunc<DesignToken, DerivativeToken> */ Any
    ]
  ): default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[default[Any, Any]]
  inline def createTheme[DesignToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */, DerivativeToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */](
    derivatives: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DerivativeFunc<DesignToken, DerivativeToken> */ Any
  ): default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[default[Any, Any]]
}
