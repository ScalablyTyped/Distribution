package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Indexname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends StObject {
  
  /**
    * Answer body. It’s truncated after 1000 characters.
    */
  val answer: String = js.native
  
  /**
    * Http response code.
    */
  val answer_code: String = js.native
  
  /**
    * Exhaustive flags used during the query.
    */
  val exhaustive: js.UndefOr[Boolean] = js.native
  
  /**
    * Index name of the log
    */
  val index: js.UndefOr[String] = js.native
  
  /**
    * Internal queries performed for this query.
    */
  val inner_queries: js.Array[Indexname] = js.native
  
  /**
    * Client ip of the call.
    */
  val ip: String = js.native
  
  /**
    * Rest type of the method.
    */
  val method: String = js.native
  
  /**
    * Number Of Api Calls
    */
  val nb_api_calls: js.UndefOr[String] = js.native
  
  /**
    * Processing time for the query. This does not include network time.
    */
  val processing_time_ms: String = js.native
  
  /**
    * Request body. It’s truncated after 1000 characters.
    */
  val query_body: String = js.native
  
  /**
    * Request Headers (API Key is obfuscated).
    */
  val query_headers: String = js.native
  
  /**
    * Number of hits returned for the query.
    */
  val query_nb_hits: js.UndefOr[String] = js.native
  
  /**
    * SHA1 ID of entry.
    */
  val sha1: String = js.native
  
  /**
    * Timestamp in ISO-8601 format.
    */
  val timestamp: String = js.native
  
  /**
    * Request URL.
    */
  val url: String = js.native
}
object Log {
  
  @scala.inline
  def apply(
    answer: String,
    answer_code: String,
    inner_queries: js.Array[Indexname],
    ip: String,
    method: String,
    processing_time_ms: String,
    query_body: String,
    query_headers: String,
    sha1: String,
    timestamp: String,
    url: String
  ): Log = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], answer_code = answer_code.asInstanceOf[js.Any], inner_queries = inner_queries.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], processing_time_ms = processing_time_ms.asInstanceOf[js.Any], query_body = query_body.asInstanceOf[js.Any], query_headers = query_headers.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswer_code(value: String): Self = StObject.set(x, "answer_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExhaustive(value: Boolean): Self = StObject.set(x, "exhaustive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExhaustiveUndefined: Self = StObject.set(x, "exhaustive", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInner_queries(value: js.Array[Indexname]): Self = StObject.set(x, "inner_queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner_queriesVarargs(value: Indexname*): Self = StObject.set(x, "inner_queries", js.Array(value :_*))
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_api_calls(value: String): Self = StObject.set(x, "nb_api_calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_api_callsUndefined: Self = StObject.set(x, "nb_api_calls", js.undefined)
    
    @scala.inline
    def setProcessing_time_ms(value: String): Self = StObject.set(x, "processing_time_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_body(value: String): Self = StObject.set(x, "query_body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_headers(value: String): Self = StObject.set(x, "query_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_nb_hits(value: String): Self = StObject.set(x, "query_nb_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_nb_hitsUndefined: Self = StObject.set(x, "query_nb_hits", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
