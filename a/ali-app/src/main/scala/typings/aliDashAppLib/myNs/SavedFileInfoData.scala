package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFileInfoData extends js.Object {
  /**
  		 * 创建时间
  		 */
  var createTime: scala.Double
  /**
  		 * 文件大小，单位B
  		 */
  var size: scala.Double
}

object SavedFileInfoData {
  @scala.inline
  def apply(createTime: scala.Double, size: scala.Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime, size = size)
  
    __obj.asInstanceOf[SavedFileInfoData]
  }
}

