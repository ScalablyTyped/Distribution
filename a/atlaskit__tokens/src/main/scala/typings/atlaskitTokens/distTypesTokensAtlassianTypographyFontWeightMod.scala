package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Weight
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianTypographyFontWeightMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontWeightTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontWeightBaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/font-weight", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/font-weight", "default.font")
    @js.native
    def font: OmitDistributive[Weight, attributes] = js.native
    inline def font_=(x: OmitDistributive[Weight, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  }
}
