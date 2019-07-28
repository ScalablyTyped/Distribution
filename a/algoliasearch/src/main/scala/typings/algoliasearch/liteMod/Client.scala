package typings.algoliasearch.liteMod

import typings.algoliasearch.Anon_IndexName
import typings.algoliasearch.Anon_IndexNameParams
import typings.algoliasearch.algoliasearchMod.MultiResponse
import typings.algoliasearch.algoliasearchMod.SearchForFacetValuesNs.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the algolia client object
  */
@js.native
trait Client extends js.Object {
  /**
    * add a header, used for flagging InstantSearch implementations
    */
  def addAlgoliaAgent(agent: String): Unit = js.native
  /**
    * clear browser cache
    * https://github.com/algolia/algoliasearch-client-js#cache
    */
  def clearCache(): Unit = js.native
  /**
    * Get the value of an extra header
    */
  def getExtraHeader(name: String): String = js.native
  /**
    * Initialization of the index
    * https://github.com/algolia/algoliasearch-client-js#init-index---initindex
    */
  def initIndex(indexName: String): Index = js.native
  /**
    * Query on multiple index
    * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
    */
  def search[T](queries: js.Array[Anon_IndexName]): js.Promise[MultiResponse[T]] = js.native
  /**
    * Query on multiple index
    * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
    */
  def search[T](
    queries: js.Array[Anon_IndexName],
    cb: js.Function2[/* err */ Error, /* res */ MultiResponse[T], Unit]
  ): Unit = js.native
  /**
    * Query for facet values of a specific facet
    */
  def searchForFacetValues(queries: js.Array[Anon_IndexNameParams]): js.Promise[js.Array[Response]] = js.native
  /**
    * Add a header to be sent with all upcoming requests
    */
  def setExtraHeader(name: String, value: String): Unit = js.native
  /**
    * remove an extra header for all upcoming requests
    */
  def unsetExtraHeader(name: String): Unit = js.native
}

