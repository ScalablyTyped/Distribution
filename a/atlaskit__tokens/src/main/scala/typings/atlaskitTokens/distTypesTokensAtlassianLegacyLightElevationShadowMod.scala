package typings.atlaskitTokens

import typings.atlaskitTokens.anon.ShadowRaised
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianLegacyLightElevationShadowMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.ShadowTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/legacy-palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/elevation/shadow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/elevation/shadow", "default.elevation")
    @js.native
    def elevation: OmitDistributive[ShadowRaised, attributes] = js.native
    inline def elevation_=(x: OmitDistributive[ShadowRaised, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elevation")(x.asInstanceOf[js.Any])
  }
}
