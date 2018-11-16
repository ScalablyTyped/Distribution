package typings
package algoliasearchLib.liteMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Interface for the algolia client object
   */
@js.native
trait Client extends js.Object {
  /**
       * clear browser cache
       * https://github.com/algolia/algoliasearch-client-js#cache
       */
  def clearCache(): scala.Unit = js.native
  /**
       * Get the value of an extra header
       */
  def getExtraHeader(name: java.lang.String): java.lang.String = js.native
  /**
       * Initialization of the index
       * https://github.com/algolia/algoliasearch-client-js#init-index---initindex
       */
  def initIndex(indexName: java.lang.String): Index = js.native
  /**
       * Query on multiple index
       * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
       */
  def search(queries: js.Array[algoliasearchLib.Anon_IndexNameQueryParams]): stdLib.Promise[MultiResponse] = js.native
  /**
       * Query on multiple index
       * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
       */
  def search(
    queries: js.Array[algoliasearchLib.Anon_IndexNameQueryParams],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ MultiResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Query for facet values of a specific facet
       */
  def searchForFacetValues(queries: js.Array[algoliasearchLib.Anon_IndexNameParams]): stdLib.Promise[
    js.Array[algoliasearchLib.liteMod.algoliasearchNs.SearchForFacetValuesNs.Response]
  ] = js.native
  /**
       * Add a header to be sent with all upcoming requests
       */
  def setExtraHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * remove an extra header for all upcoming requests
       */
  def unsetExtraHeader(name: java.lang.String): scala.Unit = js.native
}

