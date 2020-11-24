package typings.angularHttp.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularHttp.enumsMod.RequestMethod
import typings.angularHttp.enumsMod.ResponseContentType
import typings.angularHttp.headersMod.Headers
import typings.angularHttp.urlSearchParamsMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptionsArgs extends js.Object {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[Headers | Null] = js.native
  
  var method: js.UndefOr[String | RequestMethod | Null] = js.native
  
  var params: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.native
  
  var responseType: js.UndefOr[ResponseContentType | Null] = js.native
  
  /** @deprecated from 4.0.0. Use params instead. */
  var search: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.native
  
  var url: js.UndefOr[String | Null] = js.native
  
  var withCredentials: js.UndefOr[Boolean | Null] = js.native
}
object RequestOptionsArgs {
  
  @scala.inline
  def apply(): RequestOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptionsArgs]
  }
  
  @scala.inline
  implicit class RequestOptionsArgsOps[Self <: RequestOptionsArgs] (val x: Self) extends AnyVal {
    
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    
    @scala.inline
    def setMethod(value: String | RequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMethodNull: Self = this.set("method", null)
    
    @scala.inline
    def setParams(value: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParamsNull: Self = this.set("params", null)
    
    @scala.inline
    def setResponseType(value: ResponseContentType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setResponseTypeNull: Self = this.set("responseType", null)
    
    @scala.inline
    def setSearch(value: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSearchNull: Self = this.set("search", null)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
    
    @scala.inline
    def setWithCredentialsNull: Self = this.set("withCredentials", null)
  }
}
