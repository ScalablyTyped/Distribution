package typings.algoliaClientSearch.mod

import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "findAnswers")
@js.native
object findAnswers extends js.Object {
  
  def apply(base: SearchIndex): js.Function3[
    /* query */ String, 
    /* queryLanguages */ js.Array[String], 
    /* requestOptions */ js.UndefOr[RequestOptions with FindAnswersOptions], 
    js.Promise[FindAnswersResponse[_]]
  ] = js.native
}
