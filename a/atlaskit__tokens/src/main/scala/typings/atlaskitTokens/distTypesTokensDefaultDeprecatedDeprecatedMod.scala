package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Card
import typings.atlaskitTokens.anon.IconBorder
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultDeprecatedDeprecatedMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.DeprecatedTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/deprecated/deprecated", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/deprecated/deprecated", "default.color")
    @js.native
    def color: OmitDistributive[IconBorder, value] = js.native
    inline def color_=(x: OmitDistributive[IconBorder, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/deprecated/deprecated", "default.shadow")
    @js.native
    def shadow: OmitDistributive[Card, value] = js.native
    inline def shadow_=(x: OmitDistributive[Card, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadow")(x.asInstanceOf[js.Any])
  }
}
