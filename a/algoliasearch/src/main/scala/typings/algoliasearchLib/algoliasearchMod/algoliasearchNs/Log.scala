package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var answer: java.lang.String
  var answer_code: scala.Double
  var exhaustive_faceting: js.UndefOr[algoliasearchLib.algoliasearchLibNumbers.`false`] = js.undefined
  var exhaustive_nb_hits: js.UndefOr[algoliasearchLib.algoliasearchLibNumbers.`false`] = js.undefined
  var index: java.lang.String
  var ip: java.lang.String
  var method: java.lang.String
  var nb_api_calls: java.lang.String
  var processing_time_ms: java.lang.String
  var query_body: java.lang.String
  var query_headers: java.lang.String
  var query_nb_hits: java.lang.String
  var query_params: java.lang.String
  var sha1: java.lang.String
  var timestamp: java.lang.String
  var url: java.lang.String
}

object Log {
  @scala.inline
  def apply(
    answer: java.lang.String,
    answer_code: scala.Double,
    index: java.lang.String,
    ip: java.lang.String,
    method: java.lang.String,
    nb_api_calls: java.lang.String,
    processing_time_ms: java.lang.String,
    query_body: java.lang.String,
    query_headers: java.lang.String,
    query_nb_hits: java.lang.String,
    query_params: java.lang.String,
    sha1: java.lang.String,
    timestamp: java.lang.String,
    url: java.lang.String,
    exhaustive_faceting: algoliasearchLib.algoliasearchLibNumbers.`false` = null,
    exhaustive_nb_hits: algoliasearchLib.algoliasearchLibNumbers.`false` = null
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer, answer_code = answer_code, index = index, ip = ip, method = method, nb_api_calls = nb_api_calls, processing_time_ms = processing_time_ms, query_body = query_body, query_headers = query_headers, query_nb_hits = query_nb_hits, query_params = query_params, sha1 = sha1, timestamp = timestamp, url = url)
    if (exhaustive_faceting != null) __obj.updateDynamic("exhaustive_faceting")(exhaustive_faceting)
    if (exhaustive_nb_hits != null) __obj.updateDynamic("exhaustive_nb_hits")(exhaustive_nb_hits)
    __obj.asInstanceOf[Log]
  }
}

