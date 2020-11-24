package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSaCatch
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "saveSynonyms")
@js.native
object saveSynonyms extends js.Object {
  
  def apply(base: SearchIndex): js.Function2[
    /* synonyms */ js.Array[Synonym], 
    /* requestOptions */ js.UndefOr[SaveSynonymsOptions with RequestOptions], 
    ReadonlyWaitablePromiseSaCatch
  ] = js.native
}
