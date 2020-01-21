package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 文件 https://docs.alipay.com/mini/api/file
trait SavedFileData extends js.Object {
  /** 文件保存路径 */
  var apFilePath: String
}

object SavedFileData {
  @scala.inline
  def apply(apFilePath: String): SavedFileData = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SavedFileData]
  }
}

