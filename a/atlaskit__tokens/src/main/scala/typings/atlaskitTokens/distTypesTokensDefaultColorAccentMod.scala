package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Icon
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultColorAccentMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.AccentColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/accent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/accent", "default.color")
    @js.native
    def color: OmitDistributive[Icon, value] = js.native
    inline def color_=(x: OmitDistributive[Icon, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
