package typings.algoliasearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/transporter.@algolia/transporter.RequestOptions & std.Pick<@algolia/client-search.@algolia/client-search.SaveSynonymsOptions, std.Exclude<keyof @algolia/client-search.@algolia/client-search.SaveSynonymsOptions, 'clearExistingSynonyms' | 'replaceExistingSynonyms'>> */
@js.native
trait RequestOptionsPickSaveSyn
  extends /**
  * Additional request body values. It's only taken in
  * consideration in `POST` and `PUT` requests.
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * If the given request should persist on the cache. Keep in mind,
    * that some methods may have this option enabled by default.
    */
  val cacheable: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom data for the request. This data are
    * going to be merged the transporter data.
    */
  val data: js.UndefOr[Record[String, _]] = js.native
  
  var forwardToReplicas: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom headers for the request. This headers are
    * going to be merged the transporter headers.
    */
  val headers: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * Custom query parameters for the request. This query parameters are
    * going to be merged the transporter query parameters.
    */
  val queryParameters: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * Custom timeout for the request. Note that, in normal situacions
    * the given timeout will be applied. But the transporter layer may
    * increase this timeout if there is need for it.
    */
  val timeout: js.UndefOr[Double] = js.native
}
object RequestOptionsPickSaveSyn {
  
  @scala.inline
  def apply(): RequestOptionsPickSaveSyn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptionsPickSaveSyn]
  }
  
  @scala.inline
  implicit class RequestOptionsPickSaveSynOps[Self <: RequestOptionsPickSaveSyn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheable: Self = this.set("cacheable", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setForwardToReplicas(value: Boolean): Self = this.set("forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardToReplicas: Self = this.set("forwardToReplicas", js.undefined)
    
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: Record[String, _]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
