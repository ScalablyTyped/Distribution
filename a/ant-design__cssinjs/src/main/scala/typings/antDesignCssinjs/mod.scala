package typings.antDesignCssinjs

import typings.antDesignCssinjs.anon.HashId
import typings.antDesignCssinjs.anon.TokenKey
import typings.antDesignCssinjs.interfaceMod.DerivativeFunc
import typings.antDesignCssinjs.interfaceMod.TokenType
import typings.antDesignCssinjs.keyframesMod.default
import typings.antDesignCssinjs.styleContextMod.StyleProviderProps
import typings.antDesignCssinjs.useCacheTokenMod.Option
import typings.antDesignCssinjs.useStyleRegisterMod.CSSInterpolation
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
    extends typings.antDesignCssinjs.themeMod.Theme[DesignToken, DerivativeToken] {
    def this(derivatives: js.Array[DerivativeFunc[DesignToken, DerivativeToken]]) = this()
    def this(derivatives: DerivativeFunc[DesignToken, DerivativeToken]) = this()
  }
  
  inline def createCache(): typings.antDesignCssinjs.cacheMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")().asInstanceOf[typings.antDesignCssinjs.cacheMod.default]
  
  inline def createTheme[DesignToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */, DerivativeToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */](
    derivatives: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DerivativeFunc<DesignToken, DerivativeToken> */ Any
    ]
  ): typings.antDesignCssinjs.themeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]
  inline def createTheme[DesignToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */, DerivativeToken /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenType */ Any */](
    derivatives: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DerivativeFunc<DesignToken, DerivativeToken> */ Any
  ): typings.antDesignCssinjs.themeThemeMod.default[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(derivatives.asInstanceOf[js.Any]).asInstanceOf[typings.antDesignCssinjs.themeThemeMod.default[Any, Any]]
  
  inline def extractStyle(cache: typings.antDesignCssinjs.cacheMod.default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractStyle")(cache.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useCacheToken[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.themeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCacheToken")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  inline def useCacheToken[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.themeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]],
    option: Option[DerivativeToken]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCacheToken")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  
  inline def useStyleRegister(info: HashId, styleFn: js.Function0[CSSInterpolation]): js.Function1[/* node */ ReactElement, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStyleRegister")(info.asInstanceOf[js.Any], styleFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ ReactElement, Element]]
}
