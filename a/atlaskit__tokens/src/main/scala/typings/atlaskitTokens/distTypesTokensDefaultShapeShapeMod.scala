package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Radius
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultShapeShapeMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.ShapeTokenSchema> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/shape/shape", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/shape/shape", "default.border")
    @js.native
    def border: OmitDistributive[Radius, value] = js.native
    inline def border_=(x: OmitDistributive[Radius, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
  }
}
