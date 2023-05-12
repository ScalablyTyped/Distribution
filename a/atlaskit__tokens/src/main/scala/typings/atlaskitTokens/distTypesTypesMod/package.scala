package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Opacity
import typings.atlaskitTokens.atlaskitTokensStrings.active
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.atlaskitTokensStrings.deleted
import typings.atlaskitTokens.atlaskitTokensStrings.deprecated
import typings.atlaskitTokens.atlaskitTokensStrings.experimental
import typings.atlaskitTokens.atlaskitTokensStrings.fontFamily
import typings.atlaskitTokens.atlaskitTokensStrings.fontSize
import typings.atlaskitTokens.atlaskitTokensStrings.fontWeight
import typings.atlaskitTokens.atlaskitTokensStrings.lineHeight
import typings.atlaskitTokens.atlaskitTokensStrings.opacity
import typings.atlaskitTokens.atlaskitTokensStrings.paint
import typings.atlaskitTokens.atlaskitTokensStrings.raw
import typings.atlaskitTokens.atlaskitTokensStrings.shadow
import typings.atlaskitTokens.atlaskitTokensStrings.shape
import typings.atlaskitTokens.atlaskitTokensStrings.spacing
import typings.atlaskitTokens.atlaskitTokensStrings.typography
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
import typings.atlaskitTokens.distTypesPalettesShapePaletteMod.ShapePaletteToken
import typings.atlaskitTokens.distTypesPalettesSpacingScaleMod.SpacingPaletteToken
import typings.std.Omit
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveTokenState = active

type AttributeSchema[Schema /* <: js.Object */] = DeepOmit[Schema, value]

type DeepOmit[T /* <: Any */, K /* <: PropertyKey */] = Omit[
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: @atlaskit/tokens.@atlaskit/tokens/dist/types/types.OmitDistributive<T[P], K>} */ js.Any, 
K]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends object ? {[ P in keyof T ]:? @atlaskit/tokens.@atlaskit/tokens/dist/types/types.DeepPartial<T[P]>} : T
  }}}
  */
type DeepPartial[T] = T

type DeletedTokenState = deleted

type DeprecatedTokenState = deprecated

type ExperimentalReplacement = InternalTokenIds | js.Array[InternalTokenIds] | String

type ExperimentalTokenState = experimental

type ExtendedValueSchema[Schema /* <: js.Object */] = DeepPartial[ValueSchema[Schema]]

type FontFamilyToken[BaseToken] = DesignToken[BaseToken, fontFamily]

type FontSizeToken[BaseToken] = DesignToken[BaseToken, fontSize]

type FontWeightToken[BaseToken] = DesignToken[BaseToken, fontWeight]

type Id[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any

type LineHeightToken[BaseToken] = DesignToken[BaseToken, lineHeight]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends any ? T extends object ? @atlaskit/tokens.@atlaskit/tokens/dist/types/types.Id<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.DeepOmit<T, K>> : T : never
  }}}
  */
type OmitDistributive[T, K /* <: PropertyKey */] = T

type OpacityToken = DesignToken[String, opacity]

type PaintToken[BaseToken] = DesignToken[BaseToken, paint]

type RawToken = DesignToken[String, raw]

type Replacement = InternalTokenIds | js.Array[InternalTokenIds]

type ShadowToken[BaseToken] = DesignToken[js.Array[Opacity[BaseToken]], shadow]

type ShapeSchemaValue = BaseToken[String, shape]

type ShapeToken = DesignToken[ShapePaletteToken, shape]

type SpacingSchemaValue = BaseToken[String, spacing]

type SpacingToken = DesignToken[SpacingPaletteToken, spacing]

type TokenSchema[BaseToken] = ColorTokenSchema[BaseToken] & ElevationTokenSchema[BaseToken]

type TokenState = ActiveTokenState | DeprecatedTokenState | DeletedTokenState | ExperimentalTokenState

type TypographySchemaValue = BaseToken[String, typography]

type TypographyToken[BaseToken] = DesignToken[BaseToken, fontSize | fontWeight | fontFamily | lineHeight]

type ValueCategory = opacity

type ValueSchema[Schema /* <: js.Object */] = DeepOmit[Schema, attributes]
