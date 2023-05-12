package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.distTypesTypesMod.SpacingScaleTokenSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPalettesSpacingScaleMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/palettes/spacing-scale", JSImport.Default)
  @js.native
  val default: SpacingScaleTokenSchema[SpacingPaletteToken] = js.native
  
  /* keyof @atlaskit/tokens.anon.Space0 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.Space0
    - typings.atlaskitTokens.atlaskitTokensStrings.Space025
    - typings.atlaskitTokens.atlaskitTokensStrings.Space050
    - typings.atlaskitTokens.atlaskitTokensStrings.Space075
    - typings.atlaskitTokens.atlaskitTokensStrings.Space100
    - typings.atlaskitTokens.atlaskitTokensStrings.Space150
    - typings.atlaskitTokens.atlaskitTokensStrings.Space200
    - typings.atlaskitTokens.atlaskitTokensStrings.Space250
    - typings.atlaskitTokens.atlaskitTokensStrings.Space300
    - typings.atlaskitTokens.atlaskitTokensStrings.Space400
    - typings.atlaskitTokens.atlaskitTokensStrings.Space500
    - typings.atlaskitTokens.atlaskitTokensStrings.Space600
    - typings.atlaskitTokens.atlaskitTokensStrings.Space800
    - typings.atlaskitTokens.atlaskitTokensStrings.Space1000
  */
  trait SpacingPaletteToken extends StObject
  
  type _To = SpacingScaleTokenSchema[SpacingPaletteToken]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesPalettesSpacingScaleMod.foo` */
  override def _to: SpacingScaleTokenSchema[SpacingPaletteToken] = default
}
