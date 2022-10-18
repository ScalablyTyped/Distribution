package typings.antDesignCssinjs

import typings.antDesignCssinjs.anon.TokenKey
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCacheTokenMod {
  
  @JSImport("@ant-design/cssinjs/es/hooks/useCacheToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  inline def default[DerivativeToken, DesignToken](
    theme: typings.antDesignCssinjs.esThemeThemeMod.default[Any, Any],
    tokens: js.Array[Partial[DesignToken]],
    option: Option[DerivativeToken]
  ): js.Tuple2[DerivativeToken & TokenKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[DerivativeToken & TokenKey, String]]
  
  trait Option[DerivativeToken] extends StObject {
    
    /**
      * Format token as you need. Such as:
      *
      * - rename token
      * - merge token
      * - delete token
      *
      * This should always be the same since it's one time process.
      * It's ok to useMemo outside but this has better cache strategy.
      */
    var formatToken: js.UndefOr[js.Function1[/* mergedToken */ Any, DerivativeToken]] = js.undefined
    
    var `override`: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Generate token with salt.
      * This is used to generate different hashId even same derivative token for different version.
      */
    var salt: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply[DerivativeToken](): Option[DerivativeToken] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option[DerivativeToken]]
    }
    
    extension [Self <: Option[?], DerivativeToken](x: Self & Option[DerivativeToken]) {
      
      inline def setFormatToken(value: /* mergedToken */ Any => DerivativeToken): Self = StObject.set(x, "formatToken", js.Any.fromFunction1(value))
      
      inline def setFormatTokenUndefined: Self = StObject.set(x, "formatToken", js.undefined)
      
      inline def setOverride(value: js.Object): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
