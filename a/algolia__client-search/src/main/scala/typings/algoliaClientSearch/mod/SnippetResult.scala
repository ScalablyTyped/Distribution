package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  THit extends string | number ? @algolia/client-search.@algolia/client-search.SnippetMatch : {[ KAttribute in keyof THit ]: @algolia/client-search.@algolia/client-search.SnippetResult<THit[KAttribute]>}
  }}}
  */
@js.native
trait SnippetResult[THit] extends StObject
