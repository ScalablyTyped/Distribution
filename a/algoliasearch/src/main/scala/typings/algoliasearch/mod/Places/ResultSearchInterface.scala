package typings.algoliasearch.mod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of search.
  * https://community.algolia.com/places/api-clients.html#json-answer
  */
trait ResultSearchInterface[T /* <: HitInterface | LocalizedHitInterface */] extends js.Object {
  /**
    * Query fallback if query retrieve any result
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var degradedQuery: Boolean
  /**
    * Contains all the hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var hits: js.Array[T]
  /**
    * Number of total hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var nbHits: Double
  /**
    * GET parameters used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var params: String
  /**
    * Engine processing time (excluding network transfer).
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var processingTimeMS: Double
  /**
    * Query used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var query: String
}

object ResultSearchInterface {
  @scala.inline
  def apply[T](
    degradedQuery: Boolean,
    hits: js.Array[T],
    nbHits: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): ResultSearchInterface[T] = {
    val __obj = js.Dynamic.literal(degradedQuery = degradedQuery.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSearchInterface[T]]
  }
}

