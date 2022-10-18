package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Loading
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianDarkOpacityOpacityMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.OpacityTokenSchema> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/opacity/opacity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/opacity/opacity", "default.opacity")
    @js.native
    def opacity: OmitDistributive[Loading, attributes] = js.native
    inline def opacity_=(x: OmitDistributive[Loading, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
  }
}
