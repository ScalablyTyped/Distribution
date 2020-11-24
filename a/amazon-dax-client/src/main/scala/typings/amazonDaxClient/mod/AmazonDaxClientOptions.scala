package typings.amazonDaxClient.mod

import typings.std.Date
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmazonDaxClientOptions extends js.Object {
  
  var accessKeyId: js.UndefOr[String] = js.native
  
  var apiVersion: js.UndefOr[String | Date] = js.native
  
  var endpoint: js.UndefOr[String] = js.native
  
  var endpoints: js.UndefOr[js.Array[String]] = js.native
  
  var httpOptions: js.UndefOr[AmazonDaxClientHttpOptions] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[Map[String, _]] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var secretAccessKey: js.UndefOr[String] = js.native
}
object AmazonDaxClientOptions {
  
  @scala.inline
  def apply(): AmazonDaxClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonDaxClientOptions]
  }
  
  @scala.inline
  implicit class AmazonDaxClientOptionsOps[Self <: AmazonDaxClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    
    @scala.inline
    def setApiVersion(value: String | Date): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: String*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[String]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: AmazonDaxClientHttpOptions): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setParams(value: Map[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
  }
}
