package typings.atlaskitTokens

import typings.atlaskitTokens.distTypesTypesMod.Themes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/tokens", "ThemeMutationObserver")
  @js.native
  open class ThemeMutationObserver protected ()
    extends typings.atlaskitTokens.distTypesThemeChangeObserverMod.ThemeMutationObserver {
    def this(callback: js.Function1[/* theme */ Themes | Null, Any]) = this()
  }
  
  inline def setGlobalTheme(theme: Themes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 291, starting with typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblue, typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblueDotbolder, typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotred */ Any */](path: T): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  inline def token[T /* <: /* keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/get-token.Tokens */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 291, starting with typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblue, typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblueDotbolder, typings.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotred */ Any */](path: T, fallback: String): /* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("token")(path.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @atlaskit/tokens.@atlaskit/tokens/dist/types/artifacts/token-names.CSSTokenMap[T] */ js.Any]
  
  inline def useThemeObserver(): Themes | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeObserver")().asInstanceOf[Themes | Null]
}
