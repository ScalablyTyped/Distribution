package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderCreateRequest extends js.Object {
  
  var identifiers: js.Array[Identifier] = js.native
  
  var notAfter: js.UndefOr[String] = js.native
  
  var notBefore: js.UndefOr[String] = js.native
}
object OrderCreateRequest {
  
  @scala.inline
  def apply(identifiers: js.Array[Identifier]): OrderCreateRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateRequest]
  }
  
  @scala.inline
  implicit class OrderCreateRequestOps[Self <: OrderCreateRequest] (val x: Self) extends AnyVal {
    
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
    def setIdentifiersVarargs(value: Identifier*): Self = this.set("identifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdentifiers(value: js.Array[Identifier]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfter(value: String): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotAfter: Self = this.set("notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: String): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
  }
}
