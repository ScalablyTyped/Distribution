package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Surface
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.typesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultElevationSurfaceMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.SurfaceTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/elevation/surface", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/elevation/surface", "default.elevation")
    @js.native
    def elevation: OmitDistributive[Surface, value] = js.native
    inline def elevation_=(x: OmitDistributive[Surface, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elevation")(x.asInstanceOf[js.Any])
  }
}
