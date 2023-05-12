package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Weight
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultTypographyFontWeightMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontWeightTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontWeightBaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/typography/font-weight", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/typography/font-weight", "default.font")
    @js.native
    def font: OmitDistributive[Weight, value] = js.native
    inline def font_=(x: OmitDistributive[Weight, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  }
}
