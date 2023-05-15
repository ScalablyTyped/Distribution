package typings.antDesignCssinjs

import typings.antDesignCssinjs.anon.HashId
import typings.antDesignCssinjs.anon.TokenKey
import typings.antDesignCssinjs.esHooksUseCacheTokenMod.Option
import typings.antDesignCssinjs.esHooksUseStyleRegisterMod.CSSInterpolation
import typings.antDesignCssinjs.esKeyframesMod.default
import typings.antDesignCssinjs.esLintersInterfaceMod.Linter
import typings.antDesignCssinjs.esStyleContextMod.StyleProviderProps
import typings.antDesignCssinjs.esThemeInterfaceMod.DerivativeFunc
import typings.antDesignCssinjs.esThemeInterfaceMod.TokenType
import typings.antDesignCssinjs.esTransformersInterfaceMod.Transformer
import typings.antDesignCssinjs.esTransformersPx2remMod.Options
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/cssinjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/cssinjs", "Keyframes")
  @js.native
  open class Keyframes protected () extends default {
    def this(name: String, style: CSSInterpolation) = this()
  }
  
  @JSImport("@ant-design/cssinjs", "StyleProvider")
  @js.native
  val StyleProvider: FC[StyleProviderProps] = js.native
  
  @JSImport("@ant-design/cssinjs", "Theme")
  @js.native
  open class Theme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */] protected ()
    extends typings.antDesignCssinjs.esThemeMod.Theme[DesignToken, DerivativeToken] {
    def this(derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]) = this()
    def this(derivatives: DerivativeFunc[DesignToken, DerivativeToken]) = this()
  }
  
  inline def createCache(): typings.antDesignCssinjs.esCacheMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")().asInstanceOf[typings.antDesignCssinjs.esCacheMod.default]
  
  inline def createTheme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]): typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any]]
  inline def createTheme[DesignToken /* <: TokenType */, DerivativeToken /* <: TokenType */](derivatives: DerivativeFunc[DesignToken, DerivativeToken]): typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any]]
  
  inline def extractStyle(cache: typings.antDesignCssinjs.esCacheMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractStyle")(cache.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractStyle(cache: typings.antDesignCssinjs.esCacheMod.default, plain: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractStyle")(cache.asInstanceOf[js.Any], plain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Convert css logical properties to legacy properties.
    * Such as: `margin-block-start` to `margin-top`.
    * Transform list:
    * - inset
    * - margin
    * - padding
    * - border
    */
  @JSImport("@ant-design/cssinjs", "legacyLogicalPropertiesTransformer")
  @js.native
  val legacyLogicalPropertiesTransformer: Transformer = js.native
  
  @JSImport("@ant-design/cssinjs", "legacyNotSelectorLinter")
  @js.native
  val legacyNotSelectorLinter: Linter = js.native
  
  @JSImport("@ant-design/cssinjs", "logicalPropertiesLinter")
  @js.native
  val logicalPropertiesLinter: Linter = js.native
  
  @JSImport("@ant-design/cssinjs", "parentSelectorLinter")
  @js.native
  val parentSelectorLinter: Linter = js.native
  
  inline def px2remTransformer(): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("px2remTransformer")().asInstanceOf[Transformer]
  inline def px2remTransformer(options: Options): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("px2remTransformer")(options.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  inline def useCacheToken[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCacheToken")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  inline def useCacheToken[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]],
    option: Option[DerivativeToken]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCacheToken")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  
  inline def useStyleRegister(info: HashId, styleFn: js.Function0[CSSInterpolation]): js.Function1[/* node */ ReactElement, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRegister")(info.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ ReactElement, Element]]
}
