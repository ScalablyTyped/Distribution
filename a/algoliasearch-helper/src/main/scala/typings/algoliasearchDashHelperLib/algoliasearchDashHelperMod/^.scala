package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  /**
    * The algoliasearchHelper module is the function that will let its
    * contains everything needed to use the Algoliasearch
    * Helper. It is a also a function that instanciate the helper.
    * To use the helper, you also need the Algolia JS client v3.
    * @param client an AlgoliaSearch client
    * @param index the name of the index to query
    * @param opts
    */
  def apply(
    client: algoliasearchLib.algoliasearchMod.algoliasearchNs.Client,
    index: java.lang.String,
    opts: algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.QueryParameters
  ): algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.AlgoliaSearchHelper = js.native
}

