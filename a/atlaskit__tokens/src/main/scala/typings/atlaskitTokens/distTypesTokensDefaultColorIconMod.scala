package typings.atlaskitTokens

import typings.atlaskitTokens.anon.IconDisabled
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultColorIconMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.IconColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/icon", "default.color")
    @js.native
    def color: OmitDistributive[IconDisabled, value] = js.native
    inline def color_=(x: OmitDistributive[IconDisabled, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
