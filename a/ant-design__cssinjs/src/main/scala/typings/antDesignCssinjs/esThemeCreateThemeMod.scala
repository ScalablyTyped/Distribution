package typings.antDesignCssinjs

import typings.antDesignCssinjs.esThemeInterfaceMod.DerivativeFunc
import typings.antDesignCssinjs.esThemeInterfaceMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeCreateThemeMod {
  
  @JSImport("@ant-design/cssinjs/es/theme/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]): typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any]]
  inline def default[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: DerivativeFunc[DesignToken, DerivativeToken]): typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any]]
}
