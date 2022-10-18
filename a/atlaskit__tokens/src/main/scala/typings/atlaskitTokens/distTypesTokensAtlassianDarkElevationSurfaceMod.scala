package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Surface
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianDarkElevationSurfaceMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.SurfaceTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/elevation/surface", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/elevation/surface", "default.elevation")
    @js.native
    def elevation: OmitDistributive[Surface, attributes] = js.native
    inline def elevation_=(x: OmitDistributive[Surface, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elevation")(x.asInstanceOf[js.Any])
  }
}
