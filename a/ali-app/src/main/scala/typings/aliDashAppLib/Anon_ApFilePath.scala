package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApFilePath extends js.Object {
  /** 文件路径 */
  var apFilePath: java.lang.String
  /** 创建时间 */
  var createTime: scala.Double
  /** 文件大小 */
  var size: scala.Double
}

object Anon_ApFilePath {
  @scala.inline
  def apply(apFilePath: java.lang.String, createTime: scala.Double, size: scala.Double): Anon_ApFilePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apFilePath")(apFilePath)
    __obj.updateDynamic("createTime")(createTime)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_ApFilePath]
  }
}

