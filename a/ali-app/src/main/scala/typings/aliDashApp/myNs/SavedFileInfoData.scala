package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  /**
  		 * 创建时间
  		 */
  var createTime: Double
  /**
  		 * 文件大小，单位B
  		 */
  var size: Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: Double, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

