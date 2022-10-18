package typings.atlaskitTokens.distTypesTypesMod

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends any ? T extends object ? @atlaskit/tokens.@atlaskit/tokens/dist/types/types.Id<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.DeepOmit<T, K>> : T : never
  }}}
  */
@js.native
trait OmitDistributive[T, K /* <: PropertyKey */] extends StObject
