package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApFilePath extends js.Object {
  /** 文件路径 */
  var apFilePath: String
  /** 创建时间 */
  var createTime: Double
  /** 文件大小 */
  var size: Double
}

object Anon_ApFilePath {
  @scala.inline
  def apply(apFilePath: String, createTime: Double, size: Double): Anon_ApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath, createTime = createTime, size = size)
  
    __obj.asInstanceOf[Anon_ApFilePath]
  }
}

