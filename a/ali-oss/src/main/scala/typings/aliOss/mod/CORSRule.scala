package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CORSRule extends js.Object {
  
   // configure for Access-Control-Allow-Methods header
  var allowedHeader: js.UndefOr[String | js.Array[String]] = js.native
  
   // configure for Access-Control-Allow-Origin header
  var allowedMethod: String | js.Array[String] = js.native
  
  var allowedOrigin: String | js.Array[String] = js.native
  
   // configure for Access-Control-Allow-Headers header
  var exposeHeader: js.UndefOr[String | js.Array[String]] = js.native
  
   // configure for Access-Control-Expose-Headers header
  var maxAgeSeconds: js.UndefOr[String | js.Array[String]] = js.native
}
object CORSRule {
  
  @scala.inline
  def apply(allowedMethod: String | js.Array[String], allowedOrigin: String | js.Array[String]): CORSRule = {
    val __obj = js.Dynamic.literal(allowedMethod = allowedMethod.asInstanceOf[js.Any], allowedOrigin = allowedOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
  
  @scala.inline
  implicit class CORSRuleOps[Self <: CORSRule] (val x: Self) extends AnyVal {
    
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
    def setAllowedMethodVarargs(value: String*): Self = this.set("allowedMethod", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethod(value: String | js.Array[String]): Self = this.set("allowedMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginVarargs(value: String*): Self = this.set("allowedOrigin", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigin(value: String | js.Array[String]): Self = this.set("allowedOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeaderVarargs(value: String*): Self = this.set("allowedHeader", js.Array(value :_*))
    
    @scala.inline
    def setAllowedHeader(value: String | js.Array[String]): Self = this.set("allowedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedHeader: Self = this.set("allowedHeader", js.undefined)
    
    @scala.inline
    def setExposeHeaderVarargs(value: String*): Self = this.set("exposeHeader", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeader(value: String | js.Array[String]): Self = this.set("exposeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeader: Self = this.set("exposeHeader", js.undefined)
    
    @scala.inline
    def setMaxAgeSecondsVarargs(value: String*): Self = this.set("maxAgeSeconds", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: String | js.Array[String]): Self = this.set("maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAgeSeconds: Self = this.set("maxAgeSeconds", js.undefined)
  }
}
