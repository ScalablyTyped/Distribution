package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthCode extends js.Object {
  var authCode: java.lang.String
  	// 授权码
  var authErrorScope: org.scalablytyped.runtime.StringDictionary[scala.Double]
  	// 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[java.lang.String]
}

object Anon_AuthCode {
  @scala.inline
  def apply(
    authCode: java.lang.String,
    authErrorScope: org.scalablytyped.runtime.StringDictionary[scala.Double],
    authSucessScope: js.Array[java.lang.String]
  ): Anon_AuthCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authCode")(authCode)
    __obj.updateDynamic("authErrorScope")(authErrorScope)
    __obj.updateDynamic("authSucessScope")(authSucessScope)
    __obj.asInstanceOf[Anon_AuthCode]
  }
}

