package typings.atlaskitTokens.typesTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.atlaskitTokens.anon.Radius
import typings.atlaskitTokens.atlaskitTokensStrings.active
import typings.atlaskitTokens.atlaskitTokensStrings.attributes
import typings.atlaskitTokens.atlaskitTokensStrings.deleted
import typings.atlaskitTokens.atlaskitTokensStrings.deprecated
import typings.atlaskitTokens.atlaskitTokensStrings.opacity
import typings.atlaskitTokens.atlaskitTokensStrings.paint
import typings.atlaskitTokens.atlaskitTokensStrings.raw
import typings.atlaskitTokens.atlaskitTokensStrings.shadow
import typings.atlaskitTokens.atlaskitTokensStrings.value
import typings.atlaskitTokens.typesInternalMod.InternalTokenIds
import typings.std.Omit
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveTokenState = active

type AttributeSchema[Schema /* <: js.Object */] = DeepOmit[Schema, value]

type DeepOmit[T /* <: Any */, K /* <: PropertyKey */] = Omit[
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: @atlaskit/tokens.@atlaskit/tokens/dist/types/types.OmitDistributive<T[P], K>}
  */ typings.atlaskitTokens.atlaskitTokensStrings.DeepOmit & TopLevel[T], 
K]

type DeletedTokenState = deleted

type DeprecatedTokenState = deprecated

type Id[T] = js.Object & typings.atlaskitTokens.atlaskitTokensStrings.Id & TopLevel[T]

type OmitDistributive[T, K /* <: PropertyKey */] = T | (Id[DeepOmit[T, K]])

type OpacityToken = DesignToken[String, opacity]

type PaintToken[BaseToken] = DesignToken[BaseToken, paint]

type RawToken = DesignToken[String, raw]

type Replacement = InternalTokenIds | js.Array[InternalTokenIds]

type ShadowToken[BaseToken] = DesignToken[js.Array[Radius[BaseToken]], shadow]

type TokenSchema[BaseToken] = ColorTokenSchema[BaseToken] & ElevationTokenSchema[BaseToken]

type TokenState = ActiveTokenState | DeprecatedTokenState | DeletedTokenState

type ValueCategory = opacity

type ValueSchema[Schema /* <: js.Object */] = DeepOmit[Schema, attributes]
