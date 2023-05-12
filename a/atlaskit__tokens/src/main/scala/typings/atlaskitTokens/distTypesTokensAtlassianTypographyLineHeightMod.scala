package typings.atlaskitTokens

import typings.atlaskitTokens.anon.LineHeight
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianTypographyLineHeightMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.LineHeightTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.LineHeightBaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/line-height", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-typography/line-height", "default.font")
    @js.native
    def font: OmitDistributive[LineHeight, attributes] = js.native
    inline def font_=(x: OmitDistributive[LineHeight, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  }
}
