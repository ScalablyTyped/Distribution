package typings.aliDashApp

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthCode extends js.Object {
  var authCode: String
  	// 授权码
  var authErrorScope: StringDictionary[Double]
  	// 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[String]
}

object Anon_AuthCode {
  @scala.inline
  def apply(authCode: String, authErrorScope: StringDictionary[Double], authSucessScope: js.Array[String]): Anon_AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode, authErrorScope = authErrorScope, authSucessScope = authSucessScope)
  
    __obj.asInstanceOf[Anon_AuthCode]
  }
}

