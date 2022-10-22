package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Container
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianSpacingSpacingMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.SpacingTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/spacing-scale.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-spacing/spacing", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-spacing/spacing", "default.spacing")
    @js.native
    def spacing: OmitDistributive[Container, attributes] = js.native
    inline def spacing_=(x: OmitDistributive[Container, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
  }
}
