package typings.asana.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options to configure the client */
@js.native
trait ClientOptions extends DispatcherOptions {
  
  var asanaBaseUrl: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String | Double] = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var defaultHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAsanaBaseUrl(value: String): Self = this.set("asanaBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsanaBaseUrl: Self = this.set("asanaBaseUrl", js.undefined)
    
    @scala.inline
    def setClientId(value: String | Double): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    
    @scala.inline
    def setDefaultHeaders(value: StringDictionary[String]): Self = this.set("defaultHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeaders: Self = this.set("defaultHeaders", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
  }
}
