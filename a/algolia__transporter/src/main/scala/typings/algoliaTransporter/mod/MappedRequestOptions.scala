package typings.algoliaTransporter.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappedRequestOptions extends js.Object {
  
  /**
    * If the request should be cached.
    */
  val cacheable: js.UndefOr[Boolean] = js.native
  
  /**
    * The data to be transfered to the server.
    */
  val data: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The headers of the request.
    */
  val headers: Record[String, String] = js.native
  
  /**
    * The query parameters of the request.
    */
  val queryParameters: Record[String, _] = js.native
  
  /**
    * The `read` or `write` timeout of the request.
    */
  val timeout: js.UndefOr[Double] = js.native
}
object MappedRequestOptions {
  
  @scala.inline
  def apply(headers: Record[String, String], queryParameters: Record[String, _]): MappedRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedRequestOptions]
  }
  
  @scala.inline
  implicit class MappedRequestOptionsOps[Self <: MappedRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameters(value: Record[String, _]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheable(value: Boolean): Self = this.set("cacheable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheable: Self = this.set("cacheable", js.undefined)
    
    @scala.inline
    def setData(value: Record[String, String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
