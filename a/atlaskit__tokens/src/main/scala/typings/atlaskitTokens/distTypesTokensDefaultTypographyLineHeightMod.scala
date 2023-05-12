package typings.atlaskitTokens

import typings.atlaskitTokens.anon.LineHeight
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultTypographyLineHeightMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.LineHeightTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.LineHeightBaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/typography/line-height", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/typography/line-height", "default.font")
    @js.native
    def font: OmitDistributive[LineHeight, value] = js.native
    inline def font_=(x: OmitDistributive[LineHeight, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  }
}
