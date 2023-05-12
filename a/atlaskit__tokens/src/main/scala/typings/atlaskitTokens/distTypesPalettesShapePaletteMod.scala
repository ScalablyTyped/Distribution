package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.distTypesTypesMod.ShapeScaleTokenSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPalettesShapePaletteMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/palettes/shape-palette", JSImport.Default)
  @js.native
  val default: ShapeScaleTokenSchema[BaseRadiusToken, BaseSizeToken] = js.native
  
  /* keyof @atlaskit/tokens.anon.Radius050 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.Radius050
    - typings.atlaskitTokens.atlaskitTokensStrings.Radius100
    - typings.atlaskitTokens.atlaskitTokensStrings.Radius200
    - typings.atlaskitTokens.atlaskitTokensStrings.Radius300
    - typings.atlaskitTokens.atlaskitTokensStrings.Radius400
    - typings.atlaskitTokens.atlaskitTokensStrings.RadiusCircle
  */
  trait BaseRadiusToken
    extends StObject
       with ShapePaletteToken
  
  /* keyof @atlaskit/tokens.anon.Size0 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.Size0
    - typings.atlaskitTokens.atlaskitTokensStrings.Size050
    - typings.atlaskitTokens.atlaskitTokensStrings.Size100
  */
  trait BaseSizeToken
    extends StObject
       with ShapePaletteToken
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.distTypesPalettesShapePaletteMod.BaseRadiusToken
    - typings.atlaskitTokens.distTypesPalettesShapePaletteMod.BaseSizeToken
  */
  trait ShapePaletteToken extends StObject
  
  type _To = ShapeScaleTokenSchema[BaseRadiusToken, BaseSizeToken]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesPalettesShapePaletteMod.foo` */
  override def _to: ShapeScaleTokenSchema[BaseRadiusToken, BaseSizeToken] = default
}
