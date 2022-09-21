package typings.atlaskitTokens

import typings.atlaskitTokens.anon.BackgroundBlanket
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.typesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlassianLegacyLightColorBackgroundMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.BackgroundColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/legacy-palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/color/background", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-light/color/background", "default.color")
    @js.native
    def color: OmitDistributive[BackgroundBlanket, attributes] = js.native
    inline def color_=(x: OmitDistributive[BackgroundBlanket, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
