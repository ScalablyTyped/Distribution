package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 文件 https://docs.alipay.com/mini/api/file
trait SavedFileData extends js.Object {
  /** 文件保存路径 */
  var apFilePath: java.lang.String
}

object SavedFileData {
  @scala.inline
  def apply(apFilePath: java.lang.String): SavedFileData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apFilePath")(apFilePath)
    __obj.asInstanceOf[SavedFileData]
  }
}

