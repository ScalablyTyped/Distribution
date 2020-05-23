package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApFilePaths extends js.Object {
  /**
    * 图片文件描述
    */
  var apFilePaths: js.Array[String]
}

object ApFilePaths {
  @scala.inline
  def apply(apFilePaths: js.Array[String]): ApFilePaths = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePaths]
  }
}

