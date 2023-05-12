package typings.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitTokens.distTypesTypesMod.FontFamilyPaletteTokenSchema
import typings.atlaskitTokens.distTypesTypesMod.FontSizeScaleTokenSchema
import typings.atlaskitTokens.distTypesTypesMod.FontWeightScaleTokenSchema
import typings.atlaskitTokens.distTypesTypesMod.LineHeightScaleTokenSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPalettesTypographyPaletteMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/palettes/typography-palette", JSImport.Default)
  @js.native
  val default: AtlassianTokenSchema = js.native
  
  trait AtlassianTokenSchema extends StObject {
    
    var typography: FontSizeScaleTokenSchema[FontSizeScaleValues] | FontWeightScaleTokenSchema[FontWeightScaleValues] | FontFamilyPaletteTokenSchema[FontFamilyPaletteValues] | LineHeightScaleTokenSchema[LineHeightScaleValues]
  }
  object AtlassianTokenSchema {
    
    inline def apply(
      typography: FontSizeScaleTokenSchema[FontSizeScaleValues] | FontWeightScaleTokenSchema[FontWeightScaleValues] | FontFamilyPaletteTokenSchema[FontFamilyPaletteValues] | LineHeightScaleTokenSchema[LineHeightScaleValues]
    ): AtlassianTokenSchema = {
      val __obj = js.Dynamic.literal(typography = typography.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtlassianTokenSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AtlassianTokenSchema] (val x: Self) extends AnyVal {
      
      inline def setTypography(
        value: FontSizeScaleTokenSchema[FontSizeScaleValues] | FontWeightScaleTokenSchema[FontWeightScaleValues] | FontFamilyPaletteTokenSchema[FontFamilyPaletteValues] | LineHeightScaleTokenSchema[LineHeightScaleValues]
      ): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    }
  }
  
  type FontFamilyBaseToken = /* import warning: importer.ImportType#apply Failed type conversion: keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontFamilyPaletteTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontFamilyPaletteValues>['fontFamily'] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.FontFamilySans
    - typings.atlaskitTokens.atlaskitTokensStrings.FontFamilyMonospace
  */
  trait FontFamilyPaletteValues extends StObject
  object FontFamilyPaletteValues {
    
    inline def FontFamilyMonospace: typings.atlaskitTokens.atlaskitTokensStrings.FontFamilyMonospace = "FontFamilyMonospace".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontFamilyMonospace]
    
    inline def FontFamilySans: typings.atlaskitTokens.atlaskitTokensStrings.FontFamilySans = "FontFamilySans".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontFamilySans]
  }
  
  type FontSizeBaseToken = /* import warning: importer.ImportType#apply Failed type conversion: keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontSizeScaleTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontSizeScaleValues>['fontSize'] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize050
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize075
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize100
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize200
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize300
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize400
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize500
    - typings.atlaskitTokens.atlaskitTokensStrings.FontSize600
  */
  trait FontSizeScaleValues extends StObject
  object FontSizeScaleValues {
    
    inline def FontSize050: typings.atlaskitTokens.atlaskitTokensStrings.FontSize050 = "FontSize050".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize050]
    
    inline def FontSize075: typings.atlaskitTokens.atlaskitTokensStrings.FontSize075 = "FontSize075".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize075]
    
    inline def FontSize100: typings.atlaskitTokens.atlaskitTokensStrings.FontSize100 = "FontSize100".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize100]
    
    inline def FontSize200: typings.atlaskitTokens.atlaskitTokensStrings.FontSize200 = "FontSize200".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize200]
    
    inline def FontSize300: typings.atlaskitTokens.atlaskitTokensStrings.FontSize300 = "FontSize300".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize300]
    
    inline def FontSize400: typings.atlaskitTokens.atlaskitTokensStrings.FontSize400 = "FontSize400".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize400]
    
    inline def FontSize500: typings.atlaskitTokens.atlaskitTokensStrings.FontSize500 = "FontSize500".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize500]
    
    inline def FontSize600: typings.atlaskitTokens.atlaskitTokensStrings.FontSize600 = "FontSize600".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontSize600]
  }
  
  type FontWeightBaseToken = /* import warning: importer.ImportType#apply Failed type conversion: keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/types.FontWeightScaleTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.FontWeightScaleValues>['fontWeight'] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.FontWeightRegular
    - typings.atlaskitTokens.atlaskitTokensStrings.FontWeightMedium
    - typings.atlaskitTokens.atlaskitTokensStrings.FontWeightSemiBold
    - typings.atlaskitTokens.atlaskitTokensStrings.FontWeightBold
  */
  trait FontWeightScaleValues extends StObject
  object FontWeightScaleValues {
    
    inline def FontWeightBold: typings.atlaskitTokens.atlaskitTokensStrings.FontWeightBold = "FontWeightBold".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontWeightBold]
    
    inline def FontWeightMedium: typings.atlaskitTokens.atlaskitTokensStrings.FontWeightMedium = "FontWeightMedium".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontWeightMedium]
    
    inline def FontWeightRegular: typings.atlaskitTokens.atlaskitTokensStrings.FontWeightRegular = "FontWeightRegular".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontWeightRegular]
    
    inline def FontWeightSemiBold: typings.atlaskitTokens.atlaskitTokensStrings.FontWeightSemiBold = "FontWeightSemiBold".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.FontWeightSemiBold]
  }
  
  type LineHeightBaseToken = /* import warning: importer.ImportType#apply Failed type conversion: keyof @atlaskit/tokens.@atlaskit/tokens/dist/types/types.LineHeightScaleTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/typography-palette.LineHeightScaleValues>['lineHeight'] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight100
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight200
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight300
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight400
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight500
    - typings.atlaskitTokens.atlaskitTokensStrings.LineHeight600
  */
  trait LineHeightScaleValues extends StObject
  object LineHeightScaleValues {
    
    inline def LineHeight100: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight100 = "LineHeight100".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight100]
    
    inline def LineHeight200: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight200 = "LineHeight200".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight200]
    
    inline def LineHeight300: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight300 = "LineHeight300".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight300]
    
    inline def LineHeight400: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight400 = "LineHeight400".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight400]
    
    inline def LineHeight500: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight500 = "LineHeight500".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight500]
    
    inline def LineHeight600: typings.atlaskitTokens.atlaskitTokensStrings.LineHeight600 = "LineHeight600".asInstanceOf[typings.atlaskitTokens.atlaskitTokensStrings.LineHeight600]
  }
  
  type _To = AtlassianTokenSchema
  
  /* This means you don't have to write `default`, but can instead just say `distTypesPalettesTypographyPaletteMod.foo` */
  override def _to: AtlassianTokenSchema = default
}
