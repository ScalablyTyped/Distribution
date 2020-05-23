package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApFilePath extends js.Object {
  /** 文件路径 */
  var apFilePath: String
  /** 创建时间 */
  var createTime: Double
  /** 文件大小 */
  var size: Double
}

object ApFilePath {
  @scala.inline
  def apply(apFilePath: String, createTime: Double, size: Double): ApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePath]
  }
}

