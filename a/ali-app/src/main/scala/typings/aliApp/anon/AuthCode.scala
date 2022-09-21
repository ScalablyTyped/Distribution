package typings.aliApp.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthCode extends StObject {
  
  var authCode: String
  
  // 授权码
  var authErrorScope: StringDictionary[Double]
  
  // 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[String]
}
object AuthCode {
  
  inline def apply(authCode: String, authErrorScope: StringDictionary[Double], authSucessScope: js.Array[String]): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScope = authErrorScope.asInstanceOf[js.Any], authSucessScope = authSucessScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  
  extension [Self <: AuthCode](x: Self) {
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthErrorScope(value: StringDictionary[Double]): Self = StObject.set(x, "authErrorScope", value.asInstanceOf[js.Any])
    
    inline def setAuthSucessScope(value: js.Array[String]): Self = StObject.set(x, "authSucessScope", value.asInstanceOf[js.Any])
    
    inline def setAuthSucessScopeVarargs(value: String*): Self = StObject.set(x, "authSucessScope", js.Array(value*))
  }
}
