package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /** 摘要结果 */
  var digest: java.lang.String
  /** 文件大小，单位：B */
  var size: scala.Double
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: java.lang.String, size: scala.Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest, size = size)
  
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

