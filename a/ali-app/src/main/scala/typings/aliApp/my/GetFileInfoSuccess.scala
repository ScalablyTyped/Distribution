package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /** 摘要结果 */
  var digest: String
  /** 文件大小，单位：B */
  var size: Double
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: String, size: Double): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

