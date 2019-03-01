package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 网络 https://docs.alipay.com/mini/api/network
trait RequestHeader
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object RequestHeader {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): RequestHeader = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequestHeader]
  }
}

