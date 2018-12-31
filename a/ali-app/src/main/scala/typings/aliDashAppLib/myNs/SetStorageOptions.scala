package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 缓存 https://docs.alipay.com/mini/api/storage
trait SetStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要存储的内容 */
  var data: js.Any
  /** 本地缓存中的指定的 key */
  var key: java.lang.String
}

