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
  val answerCode: String
  /**
    * Exhaustive flags used during the query.
    */
  val exhaustive: js.UndefOr[Boolean] = js.undefined
  /**
    * Index name of the log
    */
  val index: String
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
  val numberOfApiCalls: String
  /**
    * Number of hits returned for the query.
    */
  val numberOfQueryHits: String
  /**
    * Processing time for the query. This does not include network time.
    */
  val processingTimeMS: String
  /**
    * Request body. It’s truncated after 1000 characters.
    */
  val queryBody: String
  /**
    * Request Headers (API Key is obfuscated).
    */
  val queryHeaders: String
  /**
    * SHA1 ID of entry.
    */
  val sha1: String
  /**
    * Timestamp in ISO-8601 format.
    */
  val timeStamp: String
  /**
    * Request URL.
    */
  val url: String
}

object Log {
  @scala.inline
  def apply(
    answer: String,
    answerCode: String,
    index: String,
    ip: String,
    method: String,
    numberOfApiCalls: String,
    numberOfQueryHits: String,
    processingTimeMS: String,
    queryBody: String,
    queryHeaders: String,
    sha1: String,
    timeStamp: String,
    url: String,
    exhaustive: js.UndefOr[Boolean] = js.undefined
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], answerCode = answerCode.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], numberOfApiCalls = numberOfApiCalls.asInstanceOf[js.Any], numberOfQueryHits = numberOfQueryHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], queryBody = queryBody.asInstanceOf[js.Any], queryHeaders = queryHeaders.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(exhaustive)) __obj.updateDynamic("exhaustive")(exhaustive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

