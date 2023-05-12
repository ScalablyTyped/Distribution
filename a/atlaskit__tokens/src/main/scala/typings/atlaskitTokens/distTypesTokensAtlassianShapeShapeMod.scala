package typings.atlaskitTokens

import typings.atlaskitTokens.anon.Radius
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianShapeShapeMod {
  
  /**
    * This is combined with the attribute schema.
    * @link 'file:../default/shape/shape.tsx'
    */
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.ShapeTokenSchema> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-shape/shape", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-shape/shape", "default.border")
    @js.native
    def border: OmitDistributive[Radius, attributes] = js.native
    inline def border_=(x: OmitDistributive[Radius, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
  }
}
