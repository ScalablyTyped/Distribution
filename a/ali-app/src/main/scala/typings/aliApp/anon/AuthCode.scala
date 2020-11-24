package typings.aliApp.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthCode extends js.Object {
  
  var authCode: String = js.native
  
      // 授权码
  var authErrorScope: StringDictionary[Double] = js.native
  
      // 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[String] = js.native
}
object AuthCode {
  
  @scala.inline
  def apply(authCode: String, authErrorScope: StringDictionary[Double], authSucessScope: js.Array[String]): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScope = authErrorScope.asInstanceOf[js.Any], authSucessScope = authSucessScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  
  @scala.inline
  implicit class AuthCodeOps[Self <: AuthCode] (val x: Self) extends AnyVal {
    
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
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthErrorScope(value: StringDictionary[Double]): Self = this.set("authErrorScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSucessScopeVarargs(value: String*): Self = this.set("authSucessScope", js.Array(value :_*))
    
    @scala.inline
    def setAuthSucessScope(value: js.Array[String]): Self = this.set("authSucessScope", value.asInstanceOf[js.Any])
  }
}
