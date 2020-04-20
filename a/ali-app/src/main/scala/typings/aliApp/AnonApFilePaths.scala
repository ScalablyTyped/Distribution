package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApFilePaths extends js.Object {
  /**
  			 * 压缩后的路径数组
  			 */
  var apFilePaths: js.Array[String]
}

object AnonApFilePaths {
  @scala.inline
  def apply(apFilePaths: js.Array[String]): AnonApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApFilePaths]
  }
}

