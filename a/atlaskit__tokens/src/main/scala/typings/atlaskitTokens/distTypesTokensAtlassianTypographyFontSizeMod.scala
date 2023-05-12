package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Size
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianTypographyFontSizeMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontSizeTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontSizeBaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/font-size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/font-size", "default.font")
    @js.native
    def font: OmitDistributive[Size, attributes] = js.native
    inline def font_=(x: OmitDistributive[Size, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  }
}
