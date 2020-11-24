package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProxySessionsResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  
  /**
    * The proxy session details.
    */
  var ProxySessions: js.UndefOr[typings.awsSdk.chimeMod.ProxySessions] = js.native
}
object ListProxySessionsResponse {
  
  @scala.inline
  def apply(): ListProxySessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProxySessionsResponse]
  }
  
  @scala.inline
  implicit class ListProxySessionsResponseOps[Self <: ListProxySessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProxySessionsVarargs(value: ProxySession*): Self = this.set("ProxySessions", js.Array(value :_*))
    
    @scala.inline
    def setProxySessions(value: ProxySessions): Self = this.set("ProxySessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxySessions: Self = this.set("ProxySessions", js.undefined)
  }
}
