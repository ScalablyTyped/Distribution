package typings.apolloReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a HTTP. */
@js.native
trait IHTTP extends js.Object {
  
  /** HTTP host */
  var host: js.UndefOr[String | Null] = js.native
  
  /** HTTP method */
  var method: js.UndefOr[Method | Null] = js.native
  
  /** HTTP path */
  var path: js.UndefOr[String | Null] = js.native
  
  /** HTTP protocol */
  var protocol: js.UndefOr[String | Null] = js.native
  
  /** HTTP requestHeaders */
  var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.native
  
  /** HTTP responseHeaders */
  var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.native
  
  /** HTTP secure */
  var secure: js.UndefOr[Boolean | Null] = js.native
  
  /** HTTP statusCode */
  var statusCode: js.UndefOr[Double | Null] = js.native
}
object IHTTP {
  
  @scala.inline
  def apply(): IHTTP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTTP]
  }
  
  @scala.inline
  implicit class IHTTPOps[Self <: IHTTP] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMethodNull: Self = this.set("method", null)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    
    @scala.inline
    def setRequestHeaders(value: StringDictionary[IValues]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setRequestHeadersNull: Self = this.set("requestHeaders", null)
    
    @scala.inline
    def setResponseHeaders(value: StringDictionary[IValues]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeadersNull: Self = this.set("responseHeaders", null)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSecureNull: Self = this.set("secure", null)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setStatusCodeNull: Self = this.set("statusCode", null)
  }
}
