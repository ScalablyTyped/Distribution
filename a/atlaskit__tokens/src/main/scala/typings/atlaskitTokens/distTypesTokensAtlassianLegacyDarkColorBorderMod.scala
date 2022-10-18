package typings.atlaskitTokens

import typings.atlaskitTokens.anon.BorderFocused
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianLegacyDarkColorBorderMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.BorderColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/legacy-palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-dark/color/border", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-dark/color/border", "default.color")
    @js.native
    def color: OmitDistributive[BorderFocused, attributes] = js.native
    inline def color_=(x: OmitDistributive[BorderFocused, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
