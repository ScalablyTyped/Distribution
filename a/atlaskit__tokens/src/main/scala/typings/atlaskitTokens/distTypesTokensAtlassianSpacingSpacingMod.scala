package typings.atlaskitTokens

import typings.atlaskitTokens.anon.`025`
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianSpacingSpacingMod {
  
  /**
    * The spacing value schema is specifically designed to dictate the
    * possible values a specific key-token pair will have.
    *
    * This is combined with the attribute schema.
    * @link 'file:../default/spacing/spacing.tsx'
    */
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.SpacingTokenSchema> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-spacing/spacing", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-spacing/spacing", "default.space")
    @js.native
    def space: OmitDistributive[`025`, attributes] = js.native
    inline def space_=(x: OmitDistributive[`025`, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
  }
}
