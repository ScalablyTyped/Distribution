package typings.atlaskitTokens

import typings.atlaskitTokens.anon.PartialThemeState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsThemeStateTransformerMod {
  
  @JSImport("@atlaskit/tokens/dist/types/utils/theme-state-transformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def themeObjectToString(themeState: PartialThemeState): String = ^.asInstanceOf[js.Dynamic].applyDynamic("themeObjectToString")(themeState.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def themeStringToObject(themeState: String): PartialThemeState = ^.asInstanceOf[js.Dynamic].applyDynamic("themeStringToObject")(themeState.asInstanceOf[js.Any]).asInstanceOf[PartialThemeState]
}
