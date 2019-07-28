package typings.algoliasearch.algoliasearchMod

import typings.algoliasearch.algoliasearchNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var answer: String
  var answer_code: Double
  var exhaustive_faceting: js.UndefOr[`false`] = js.undefined
  var exhaustive_nb_hits: js.UndefOr[`false`] = js.undefined
  var index: String
  var ip: String
  var method: String
  var nb_api_calls: String
  var processing_time_ms: String
  var query_body: String
  var query_headers: String
  var query_nb_hits: String
  var query_params: String
  var sha1: String
  var timestamp: String
  var url: String
}

object Log {
  @scala.inline
  def apply(
    answer: String,
    answer_code: Double,
    index: String,
    ip: String,
    method: String,
    nb_api_calls: String,
    processing_time_ms: String,
    query_body: String,
    query_headers: String,
    query_nb_hits: String,
    query_params: String,
    sha1: String,
    timestamp: String,
    url: String,
    exhaustive_faceting: `false` = null,
    exhaustive_nb_hits: `false` = null
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer, answer_code = answer_code, index = index, ip = ip, method = method, nb_api_calls = nb_api_calls, processing_time_ms = processing_time_ms, query_body = query_body, query_headers = query_headers, query_nb_hits = query_nb_hits, query_params = query_params, sha1 = sha1, timestamp = timestamp, url = url)
    if (exhaustive_faceting != null) __obj.updateDynamic("exhaustive_faceting")(exhaustive_faceting)
    if (exhaustive_nb_hits != null) __obj.updateDynamic("exhaustive_nb_hits")(exhaustive_nb_hits)
    __obj.asInstanceOf[Log]
  }
}

