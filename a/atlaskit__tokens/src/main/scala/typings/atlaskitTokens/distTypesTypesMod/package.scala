package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Radius
import typings.atlaskitTokens.atlaskitTokensStrings.active
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.atlaskitTokensStrings.deleted
import typings.atlaskitTokens.atlaskitTokensStrings.deprecated
import typings.atlaskitTokens.atlaskitTokensStrings.experimental
import typings.atlaskitTokens.atlaskitTokensStrings.opacity
import typings.atlaskitTokens.atlaskitTokensStrings.paint
import typings.atlaskitTokens.atlaskitTokensStrings.raw
import typings.atlaskitTokens.atlaskitTokensStrings.shadow
import typings.atlaskitTokens.atlaskitTokensStrings.spacing
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.distTypesArtifactsTypesInternalMod.InternalTokenIds
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

type DeletedTokenState = deleted

type DeprecatedTokenState = deprecated

type ExperimentalReplacement = InternalTokenIds | js.Array[InternalTokenIds] | String

type ExperimentalTokenState = experimental

type Id[T] = js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} */ js.Any)

type OpacityToken = DesignToken[String, opacity]

type PaintToken[BaseToken] = DesignToken[BaseToken, paint]

type RawToken = DesignToken[String, raw]

type Replacement = InternalTokenIds | js.Array[InternalTokenIds]

type ShadowToken[BaseToken] = DesignToken[js.Array[Radius[BaseToken]], shadow]

type SpacingToken[BaseToken] = DesignToken[BaseToken, spacing]

type TokenSchema[BaseToken] = ColorTokenSchema[BaseToken] & ElevationTokenSchema[BaseToken]

type TokenState = ActiveTokenState | DeprecatedTokenState | DeletedTokenState | ExperimentalTokenState

type ValueCategory = opacity

type ValueSchema[Schema /* <: js.Object */] = DeepOmit[Schema, attributes]
