package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseSaCatchFinally
import typings.algoliaClientSearch.RequestOptionsPickSaveSyn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "replaceAllSynonyms")
@js.native
object replaceAllSynonyms extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* synonyms */ js.Array[Synonym], 
    /* requestOptions */ js.UndefOr[RequestOptionsPickSaveSyn], 
    ReadonlyWaitablePromiseSaCatchFinally
  ] = js.native
}

