package typings.atlaskitTokens

import typings.atlaskitTokens.anon.AccentBackground
import typings.atlaskitTokens.anon.CardOverlay
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianLegacyLightDeprecatedDeprecatedMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.DeprecatedTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/legacy-palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/deprecated/deprecated", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/deprecated/deprecated", "default.color")
    @js.native
    def color: OmitDistributive[AccentBackground, attributes] = js.native
    inline def color_=(x: OmitDistributive[AccentBackground, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/deprecated/deprecated", "default.shadow")
    @js.native
    def shadow: OmitDistributive[CardOverlay, attributes] = js.native
    inline def shadow_=(x: OmitDistributive[CardOverlay, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadow")(x.asInstanceOf[js.Any])
  }
}
