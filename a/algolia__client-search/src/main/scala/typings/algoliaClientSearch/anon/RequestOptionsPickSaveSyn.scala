package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/transporter.@algolia/transporter.RequestOptions & std.Pick<@algolia/client-search.@algolia/client-search.SaveSynonymsOptions, 'forwardToReplicas'> */
trait RequestOptionsPickSaveSyn
  extends StObject
     with /**
  * Additional request body values. It's only taken in
  * consideration in `POST` and `PUT` requests.
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * If the given request should persist on the cache. Keep in mind,
    * that some methods may have this option enabled by default.
    */
  val cacheable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom data for the request. This data are
    * going to be merged the transporter data.
    */
  val data: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom headers for the request. This headers are
    * going to be merged the transporter headers.
    */
  val headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Custom query parameters for the request. This query parameters are
    * going to be merged the transporter query parameters.
    */
  val queryParameters: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  /**
    * Custom timeout for the request. Note that, in normal situacions
    * the given timeout will be applied. But the transporter layer may
    * increase this timeout if there is need for it.
    */
  val timeout: js.UndefOr[Double] = js.undefined
}
object RequestOptionsPickSaveSyn {
  
  @scala.inline
  def apply(): RequestOptionsPickSaveSyn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptionsPickSaveSyn]
  }
  
  @scala.inline
  implicit class RequestOptionsPickSaveSynMutableBuilder[Self <: RequestOptionsPickSaveSyn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: Record[String, js.Any]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
