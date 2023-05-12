package typings.atlaskitTokens

import typings.atlaskitTokens.anon.`025`
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultSpacingSpacingMod {
  
  /**
    * The spacing attribute schema governs the non-value specific metadata to apply to the
    * spacing theme. This governs the name, description and state
    * of a token.
    */
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.SpacingTokenSchema> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/spacing/spacing", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/spacing/spacing", "default.space")
    @js.native
    def space: OmitDistributive[`025`, value] = js.native
    inline def space_=(x: OmitDistributive[`025`, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
  }
}
