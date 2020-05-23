package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  /**
    * Answer body. It’s truncated after 1000 characters.
    */
  val answer: String
  /**
    * Http response code.
    */
  val answer_code: String
  /**
    * Exhaustive flags used during the query.
    */
  val exhaustive: js.UndefOr[Boolean] = js.undefined
  /**
    * Index name of the log
    */
  val index: js.UndefOr[String] = js.undefined
  /**
    * Client ip of the call.
    */
  val ip: String
  /**
    * Rest type of the method.
    */
  val method: String
  /**
    * Number Of Api Calls
    */
  val nb_api_calls: js.UndefOr[String] = js.undefined
  /**
    * Processing time for the query. This does not include network time.
    */
  val processing_time_ms: String
  /**
    * Request body. It’s truncated after 1000 characters.
    */
  val query_body: String
  /**
    * Request Headers (API Key is obfuscated).
    */
  val query_headers: String
  /**
    * Number of hits returned for the query.
    */
  val query_nb_hits: js.UndefOr[String] = js.undefined
  /**
    * SHA1 ID of entry.
    */
  val sha1: String
  /**
    * Timestamp in ISO-8601 format.
    */
  val timestamp: String
  /**
    * Request URL.
    */
  val url: String
}

object Log {
  @scala.inline
  def apply(
    answer: String,
    answer_code: String,
    ip: String,
    method: String,
    processing_time_ms: String,
    query_body: String,
    query_headers: String,
    sha1: String,
    timestamp: String,
    url: String,
    exhaustive: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    nb_api_calls: String = null,
    query_nb_hits: String = null
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], answer_code = answer_code.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], processing_time_ms = processing_time_ms.asInstanceOf[js.Any], query_body = query_body.asInstanceOf[js.Any], query_headers = query_headers.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(exhaustive)) __obj.updateDynamic("exhaustive")(exhaustive.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (nb_api_calls != null) __obj.updateDynamic("nb_api_calls")(nb_api_calls.asInstanceOf[js.Any])
    if (query_nb_hits != null) __obj.updateDynamic("query_nb_hits")(query_nb_hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

