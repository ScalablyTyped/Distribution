package typings.algoliasearchHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("algoliasearch-helper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * The algoliasearchHelper module is the function that will let its
    * contains everything needed to use the Algoliasearch
    * Helper. It is a also a function that instantiate the helper.
    * To use the helper, you also need the Algolia JS client v3.
    * @param client an AlgoliaSearch client
    * @param index the name of the index to query
    * @param opts
    */
  def apply(client: SearchClient, index: String): AlgoliaSearchHelper = js.native
  def apply(client: SearchClient, index: String, opts: PlainSearchParameters): AlgoliaSearchHelper = js.native
}
